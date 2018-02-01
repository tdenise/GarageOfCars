
public class Garage {
	private Car[][] carList;
	private int carAmount = 0; 
	
	Garage(){
		carList = new Car[6][]; //can change size later
	}
	
	public void addCar(String name, int horsePower) {
		
	}
	/*
	public String toString() {
		
	}
	*/
	
	public int carCount() {
		return carAmount; 
	}
	
	public void incrementCarCount() {
		carAmount += 1; 
	}
}
