import java.util.*; 

public class Driver {
	public static void main(String[] args) {
		Garage garage = new Garage(); //creates a Garage
		Scanner scan = new Scanner(System.in);
		String carName;
		int hp;
		String another; //string to store response on whether the user wants to put in another car
		System.out.println("Welcome to Garage Storage!");
		
		//executes as long as 1)there are enough spaces in the garage (6) and 2)the user wants to input more
		do {
			System.out.println("Enter the name of the car: ");
			carName = scan.next();
			System.out.println("Enter the horsepower of the car: ");
			hp = scan.nextInt();
			/*After storing the user input into variables, it uses them as the arguments
			for a new car object*/
			Car car = new Car(carName, hp);
			garage.addCar(car); //uses method addCar from Garage class to add a car into the Garage
			if (garage.getCarCount() >= 6)
				break; //breaks out of the loop once the garage reaches its max size
			System.out.println("Input another car? y/n");
			another = scan.next(); 
		}while((another.equalsIgnoreCase("y") || another.equalsIgnoreCase("yes") ) && garage.getCarCount() < 6);
		
		garage.getCarList();	//once done, prints out a list of info of cars in the garage from the getCarList method
	}
}
