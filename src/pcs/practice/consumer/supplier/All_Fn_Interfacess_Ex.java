package pcs.practice.consumer.supplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp {
	String ename;
	int salary;
	String gender;

	public Emp(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}

}

public class All_Fn_Interfacess_Ex {
	public static void main(String[] args) {
		ArrayList<Emp> e = new ArrayList<>();
		e.add(new Emp("chandu", 50000, "male"));
		e.add(new Emp("vinay", 30000, "male"));
		e.add(new Emp("akhila", 20000, "female"));
		e.add(new Emp("vinitha", 10000, "male"));
		e.add(new Emp("bupal", 450000, "male"));

		// Function f..i..
		Function<Emp, Integer> f = emp -> (emp.salary * 10) / 100; // task 1

		// Predicate f..i..
		Predicate<Integer> p = b -> b >= 5000; // task 2

		// Consumer f..i..
		Consumer<Emp> c = emp -> {
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		}; // task 3

		for (Emp ee : e) {
			int bonus = f.apply(ee); // calculating the bonus

			if (p.test(bonus)) { // if bonus >=5000 it gives true as return value //

				c.accept(ee);

				System.out.println("Employee Bonus : " + bonus + "\n");
			}
		}

	}
}
