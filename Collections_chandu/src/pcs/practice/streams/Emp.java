package pcs.practice.streams;

import java.util.List;

public class Emp {

	private String fName;
	private String lName;
	private double salary;
	private List<String> projects;

	public Emp(String fName, String lName, double salary, List<String> projects) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
		this.projects = projects;
	}

	public Emp() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Emp [fName=" + fName + ", lName=" + lName + ", salary=" + salary + ", projects=" + projects + "]";
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

}
