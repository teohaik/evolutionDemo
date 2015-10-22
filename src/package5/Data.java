package package5;

public abstract class Data {
	
	protected String dataString;
	protected Number dataNumber;
	
	public Data(String dataString, Number dataNumber) {
		this.dataString = dataString;
		this.dataNumber = dataNumber;
	}
	
	public String getDataString() {
		return dataString;
	}
	public void setDataString(String dataString) {
		this.dataString = dataString;
	}
	public Number getDataNumber() {
		return dataNumber;
	}
	public void setDataNumber(Number dataNumber) {
		this.dataNumber = dataNumber;
	}
	
	public abstract Data getData();
	

}
