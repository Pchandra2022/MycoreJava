package pcs.practice.Arrays;

/**
Output:-
Type: Car, Model: Tesla, FuleType: Electric, Seats: 4 
Type: Car, Model: Vespa, FuleType: Petrol, Seats: 2
*/

/**
 * String type; String model; Integer seats; String fuelType;
 */

interface Automobile {

	String displayInfo();
}

class Vehicle implements Automobile {

	private String Type;
	private String Model;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String displayInfo() {
		return "Type: " + Type + ", Model: " + Model;
	}
}
//Type: Car, Model: Tesla, FuleType: Electric, Seats: 4 
//Type: Car, Model: Vespa, FuleType: Petrol, Seats: 2

class Engine implements Automobile {
	private String FuleType;

	public String getFuleType() {
		return FuleType;
	}

	public void setFuleType(String fuleType) {
		FuleType = fuleType;
	}

	@Override
	public String displayInfo() {
		return "FuleType: " + FuleType;
	}

}

class Car implements Automobile {

	private Integer seats;

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	@Override
	public String displayInfo() {
		return "seats: " + seats;
	}
}

class Scooter {
}

public class Main {
	public static void main(String args[]) {
//Type: Car, Model: Tesla, FuleType: Electric, Seats: 4 
//Type: Car, Model: Vespa, FuleType: Petrol, Seats: 2
		Vehicle v = new Vehicle();
		Engine e = new Engine();
		Car c = new Car();
		Vehicle vv = new Vehicle();
		Engine ee = new Engine();
		Car cc = new Car();
		v.setType("Car");
		v.setModel("Tesla");
		e.setFuleType("Electric");
		c.setSeats(4);
		vv.setType("Car");
		vv.setModel("vespa");
		ee.setFuleType("petrol");
		cc.setSeats(2);

		String ss = v.displayInfo() + ", " + e.displayInfo() + ", " + c.displayInfo();
		String sss = vv.displayInfo() + ", " + ee.displayInfo() + ", " + cc.displayInfo();

		System.out.println(ss + "\n" + sss);
	}
}

/**
 * Abhishek Sharma3:00 PM
 * 
 * Output:- Type: Car, Model: Tesla, FuleType: Electric, Seats: 4 Type: Car,
 * Model: Vespa, FuleType: Petrol, Seats: 2
 */

/**
 * String type; String model; Integer seats; String fuelType;
 * 
 * 
 * interface Automobile { void displayInfo(); }
 * 
 * class Vehicle { }
 * 
 * class Engine { }
 * 
 * class Car { }
 * 
 * class Scooter { }
 * 
 * 
 * public class Main { public static void main(String args[]) { Automobile tesla
 * = ... tesla.displayInfo(); Automobile vespa = ... vespa.displayInfo(); } }
 * Jr. Java : Final Round
 */
