
public class Car {
	private String name;
	private int horsePower;
	
	Car(String name, int horsePower){
		this.name = name; 
		this.horsePower = horsePower; 
	}
	
	Car(Car car2){
		this.name = car2.name; 
		this.horsePower = car2.horsePower; 
	}
	/*
	public String toString() {
		
	}
	
	public boolean compareCars(Car car1, Car car2){
		
	}
	*/
	
	public String getName() {
		return name; 
	}
	
	public int getHorsePower() {
		return horsePower; 
	}
	
	/*
	public void copyCar(Car car1, Car car2) {
		
	}
	*/
}
