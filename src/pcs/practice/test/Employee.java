package pcs.practice.test;

public class Employee {
	
	long a;
	String fname;
	String lname;
	
	public Employee(long l, String fname, String lname) {
		super();
		this.a = l;
		this.fname = fname;
		this.lname = lname;
	}

	public long getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Employee [a=" + a + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
	

}
