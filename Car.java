package lab4;

public class Car {
	private String make;
	private String model;
	private int year;
	
	public Car(String makeInit, String modelInit, int yearInit) {
		make = makeInit;
		model = modelInit;
		year = yearInit;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String makeUpdate) {
		make = makeUpdate;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String modelUpdate) {
		model = modelUpdate;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int yearUpdate) {
		year = yearUpdate;
	}
	public String toString() {
		return year + " " + make + " " + model;
	}
}
