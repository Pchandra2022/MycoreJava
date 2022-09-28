package pcs.practice.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = getUnsortedEmployeeList();

		// Compare by first name and then last name
		Comparator<Employee> compareByName = Comparator.comparing(Employee::getFname).thenComparing(Employee::getLname);

		List<Employee> sortedEmployees = employees.stream().sorted(compareByName).collect(Collectors.toList());

		
		//first name comparator
		Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getFname );
		 
		//last name comparator
		Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getLname );
		 
		//Compare by first name and then last name (multiple fields)
		Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);
		 
		//Using Comparator - pseudo code
		employees.stream().sorted( Comparator.comparing(Employee :: getA));
		
		
		System.out.println(sortedEmployees);
		System.out.println(compareByFullName);
	}

	private static List<Employee> getUnsortedEmployeeList() {
		Employee e1 = new Employee(2l, "Lokesh", "Gupta");
		Employee e2 = new Employee(1l, "Alex", "Gussin");
		Employee e3 = new Employee(4l, "Brian", "Sux");
		Employee e4 = new Employee(5l, "Neon", "Piper");
		Employee e5 = new Employee(3l, "David", "Beckham");
		Employee e6 = new Employee(7l, "Alex", "Beckham");
		Employee e7 = new Employee(6l, "Brian", "Suxena");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

//		ArrayList<Employee> list = new ArrayList<>();
//		list.add(new Employee(2l, "Lokesh", "Gupta"));
//		list.add(new Employee(1l, "Alex", "Gussin"));
//		list.add(new Employee(4l, "Brian", "Sux"));
//		list.add(new Employee(5l, "Neon", "Piper"));
//		list.add(new Employee(3l, "David", "Beckham"));
//		list.add(new Employee(7l, "Alex", "Beckham"));
//		list.add(new Employee(6l, "Brian", "Suxena"));

		return list;
	}
}