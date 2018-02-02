
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
	
	public String toString() {
		String str = "Car name: " + name + " Horsepower: " + horsePower; 
		return str; 
	}

	public boolean compareCars(Car car2){
	boolean status;
      if (name.equals(car2.name) &&
          horsePower == car2.horsePower)
         status = true;
      else
         status = false;
      
      return status;
		
	}

	
	public String getName() {
		return name; 
	}
	
	public int getHorsePower() {
		return horsePower; 
	}
	
	   public Car copy()
	   {
	      Car copyObject = new Car(name, horsePower);
	      
	      return copyObject;
	   }
}
