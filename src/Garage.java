
public class Garage {
	private Car[][] carList; //2d array of cars
	private int carAmount = 0; //amount of cars in garage currently
	private int columnIndex = 0; //initializes where to start storing cars in garage
	private int rowIndex = 0; 
	
	Garage(){ //constructor is an empty 2d array with 2 row, 3 columns
		carList = new Car[2][3];
	}
	
	public void addCar(Car car) {
		/*Inputs whatever car is put as the argument into the correct spot
		based on how many spaces are left*/
		if (rowIndex == 0) {
			if (columnIndex < 3) {
				carList[rowIndex][columnIndex] = car; 
			} else {
				columnIndex = 0; 
				rowIndex = 1; 
				carList[rowIndex][columnIndex] = car; 
			}
		} else if (rowIndex == 1){
				carList[rowIndex][columnIndex] = car; 
		}
		carAmount += 1; //increments the carAmount each time a car is added
		columnIndex += 1; //increments columnIndex by 1 each time a space is taken
	}
	
	//method that returns the carAmount, to be used in the Driver class & determine if all six places are taken
	public int getCarCount() {
		return carAmount; 
	}
	
	//method that prints out list of cars using the toString method from the Car class
	public void getCarList(){ 
		for (int row = 0; row <= rowIndex; row++)
	         for (int coln = 0; coln < columnIndex; coln++)
	        	 System.out.println(carList[row][coln].toString());
	}

}
