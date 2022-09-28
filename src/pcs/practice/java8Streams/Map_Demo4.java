package pcs.practice.java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	int empId;
	String ename;
	int salary;

	public Emp(int empId, String ename, int salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class Map_Demo4 {
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();

		empList.add(new Emp(101, "chintu", 100000));
		empList.add(new Emp(102, "chandu", 20000));
		empList.add(new Emp(103, "sunny's", 10000));
		empList.add(new Emp(104, "shekhar", 9000));
		empList.add(new Emp(105, "chotu", 4000000));

		// combination of filter and map
		List<Integer> empSalList = empList.stream().filter(p -> p.salary > 20000) // filtering
				.map(Emp::getSalary) // map
				.collect(Collectors.toList()); // collecting data for new list
		System.out.println(empSalList);

		System.out.println();
		empList.stream().filter(p -> p.salary > 20000) // filtering
				.map(Emp::getEname) // map
				.forEach(p -> System.out.print(p + ", "));

	}
}
