package package5;

public class StringData extends Data{

	String data;
	
	public StringData(String dataString, Number dataNumber) {
		super(dataString, dataNumber);
		data = super.getDataString() + " "+super.getDataNumber();
	}

	@Override
	public Data getData() {
		return this;
	}

}
