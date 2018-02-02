
public class Garage {
	private Car[][] carList;
	private int carAmount = 0; 
	private int columnIndex = 0; 
	private int rowIndex = 0; 
	
	Garage(){
		carList = new Car[2][3];
	}
	
	public void addCar(Car car) {
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
		carAmount += 1; 
		columnIndex += 1; 
	}
	
	public int getCarCount() {
		return carAmount; 
	}
	
	public void getCarList(){
		for (int row = 0; row <= rowIndex; row++)
	         for (int coln = 0; coln < columnIndex; coln++)
	        	 System.out.println(carList[row][coln].toString());
	}

}
