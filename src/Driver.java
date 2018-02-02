import java.util.*; 

public class Driver {
//store garage to 2D array
		public static void main(String[] args) {
			
			Garage garage = new Garage(); 
			Scanner scan = new Scanner(System.in);
			String carName;
			int hp;
			String another; 
			System.out.println("Welcome to Garage Storage!");
			do {
//				if (another.equalsIgnoreCase("n"))
//					break; 
					System.out.println("Enter the name of the car: ");
					carName = scan.next();
					System.out.println("Enter the horsepower of the car: ");
					hp = scan.nextInt();
					Car car = new Car(carName, hp);
					garage.addCar(car);
					if (garage.getCarCount() >= 6)
						break; 
					System.out.println(garage.getCarCount());
					System.out.println("Input another car? y/n");
					another = scan.next(); 

			}while((another.equalsIgnoreCase("y") || another.equalsIgnoreCase("yes") ) && garage.getCarCount() < 6);
			
			garage.getCarList();
	
	}
	
	
}
