//class for an individual car
public class Car {
	//instance fields
	private String name; 
	private int horsePower;
	
	//constructor with two arguments for name and horsepower
	Car(String name, int horsePower){
		this.name = name; 
		this.horsePower = horsePower; 
	}
	
	
	//constructor for creating a copy of another car object
	Car(Car car2){
		this.name = car2.name; 
		this.horsePower = car2.horsePower; 
	}
	
	//method for printing out the car's info
	public String toString() {
		String str = "Car name: " + name + " Horsepower: " + horsePower; 
		return str; 
	}

	//method for comparing two car objects through their fields
	public boolean compareCars(Car car2){
		boolean status;
      		if (name.equals(car2.name) &&
          	horsePower == car2.horsePower)
         		status = true;
      		else
         		status = false;
      		return status;
	}

	//method for returning car name
	public String getName() {
		return name; 
	}
	
	//method for returning horsepower
	public int getHorsePower() {
		return horsePower; 
	}
	
	//method for copying an object and returning a reference to the copied object
	public Car copy()
	   {
	      Car copyObject = new Car(name, horsePower);
	      
	      return copyObject;
	   }
}
