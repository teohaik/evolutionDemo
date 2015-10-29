package package5;

public class MyList<T extends Data> {
	
	
	private T[] array;
	
	public MyList(T[] ar){
		array = ar;
	}
	
	public T get(int i){
		return array[i];
	}

	
	public void foo(){
		System.out.println("Fooo");
	}

}
