package pcs.practice.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	int exprnc;

	Employee(String name, int sal, int exp) {
		this.ename = name;
		this.salary = sal;
		this.exprnc = exp;
	}
}

public class PredictDemo2 {

	// Ex1
	// emp obj ---> return name sal>50k, exp>3
	public static void main(String[] args) {

		Employee emp = new Employee("chandu", 50000, 5);

		Predicate<Employee> pr = e -> (e.salary > 30000 && e.exprnc > 3);
		System.out.println(pr.test(emp) + "\n");

		// Ex2
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("chandu", 50000, 5));
		al.add(new Employee("vinay", 30000, 3));
		al.add(new Employee("pcs", 450000, 2));
		al.add(new Employee("chintu", 2000, 10));
		al.add(new Employee("anil", 31000, 5));
		al.add(new Employee("sunny's", 10000, 8));

		for (Employee e : al) {
			if (pr.test(e)) {
				System.out.println(e.ename + " : " + e.salary + " : " + e.exprnc);
			}
		}

	}
}
