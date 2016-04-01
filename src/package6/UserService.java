package package6;

import java.security.Principal;
import java.util.Map;

import javax.xml.ws.Response;

@Path("/user")
public class UserService
{
    public static final String PASSWORD = "password";

    private final AuthManager authManager;
    private final InputFormat input;
    private final OutputFormat output;

    public UserService( @Context AuthManager authManager, @Context InputFormat input, @Context OutputFormat output )
    {
        this.authManager = authManager;
        this.input = input;
        this.output = output;
    }

    @GET
    @Path("/{username}")
    public Response getUser( @PathParam("username") String username, @Context HttpServletRequest req )
    {
        Principal principal = req.getUserPrincipal();
        if ( principal == null || !principal.getName().equals( username ) )
        {
            return output.notFound();
        }

        final User currentUser = authManager.getUser( username );
        if ( currentUser == null )
        {
            return output.notFound();
        }
        return output.ok( new AuthorizationRepresentation( currentUser ) );
    }

    @POST
    @Path("/{username}/password")
    public Response setPassword( @PathParam("username") String username, @Context HttpServletRequest req, String payload )
    {
        Principal principal = req.getUserPrincipal();
        if ( principal == null || !principal.getName().equals( username ) )
        {
            return output.notFound();
        }

        final Map<String, Object> deserialized;
        try
        {
            deserialized = input.readMap( payload );
        } catch ( Exception e )
        {
            return output.response( "" );
        }

        Object o = deserialized.get( PASSWORD );
        if ( o == null )
        {
            return output.response( "" );
        }
        if ( !( o instanceof String ) )
        {
            return output.response( "" );
        }
        String newPassword = (String) o;
        if ( newPassword.length() == 0 )
        {
            return output.response( "" );
        }

        final User currentUser = authManager.getUser( username );
        if (currentUser == null)
        {
            return output.notFound();
        }

        if ( currentUser.credentials().matchesPassword( newPassword ) )
        {
            return output.response("" );
        }

        final User updatedUser;
        try
        {
            updatedUser = authManager.setPassword( username, newPassword );
        } catch ( Exception e )
        {
            return output.serverErrorWithoutLegacyStacktrace( e );
        }

        if (updatedUser == null)
        {
            return output.notFound();
        }

        return output.ok(null);
    }

}