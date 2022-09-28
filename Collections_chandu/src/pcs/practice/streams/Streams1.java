package pcs.practice.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {

	static List<Emp> emps = new ArrayList<Emp>();

	static {
		emps.add(new Emp("chandu", "pasupunuri", 45000, List.of("project 1", "project 2")));
		emps.add(new Emp("swachith", "joel", 50000, List.of("project 1", "project 2", "project 3")));
		emps.add(new Emp("sathish", "gokinapally", 55000, List.of("project 1", "project 2", "project 3", "project 4")));
	}

	public static void main(String[] args) {

//		Stream.of(emps);
//		emps.stream();

//		emps.stream().forEach(e -> System.out.println(emps));

		List<Emp> increasedSalaryInList = emps.stream()
				.map(e -> new Emp(e.getfName(), e.getlName(), e.getSalary() * 1.10, e.getProjects()))
				.collect(Collectors.toList());
		Set<Emp> increasedSalaryInSet = emps.stream()
				.map(e -> new Emp(e.getfName(), e.getlName(), e.getSalary() * 1.10, e.getProjects()))
				.collect(Collectors.toSet());
		System.out.println("increased salary : " + increasedSalaryInList);
//		System.out.println("increased salary : "+increasedSalaryInSet);

		List<Emp> filterEmps = emps.stream().filter(e -> e.getSalary() >= 50000)
				.map(e -> new Emp(e.getfName(), e.getlName(), e.getSalary(), e.getProjects()))
				.collect(Collectors.toList());
		System.out.println("\nfiltered emps based on salary  : " + filterEmps);

		Emp findFirst = emps.stream().filter(e -> e.getSalary() >= 40000)
				.map(e -> new Emp(e.getfName(), e.getlName(), e.getSalary(), e.getProjects())).findFirst().orElse(null);
		System.out.println("\nfirst emps based on salary  : " + findFirst);

		
		//flateMap is not worked here WHY ???????????//
//		String projects = 
//				emps.stream()
//				.map(e -> e.getSalary())
//				.flatMap(s -> s.valueOf())
//				.collect(Collectors.joining(","));
		
		//short circuting operations
		List<Emp> shortCircute = emps.stream()
		.skip(1)
		.limit(1)
		.collect(Collectors.toList());
		System.out.println("\nShort circuted data of  emps   : " + shortCircute);
		
		
		//Finite Data//
		Stream.generate(Math::random)
			.limit(5)
			.forEach(value -> System.out.println("\n"+value));
		
		//Sorting data //
		List<Emp> sortedData = emps.stream()
			.sorted((o1, o2)-> o1.getfName()
					.compareToIgnoreCase(o2.getlName()))
			.collect(Collectors.toList());
		System.out.println("\nsorted data of  emps   : " + sortedData);
		
		
		//min or max//
		Emp minSalary = emps.stream()
		.min(Comparator.comparing(Emp::getSalary))
		.orElseThrow(NoSuchElementException::new);
		System.out.print("\n min values of salary : "+minSalary);
		
		Emp maxSalary = emps.stream()
				.max(Comparator.comparing(Emp::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.print("\n max values of salary : "+maxSalary);
		
		//reduce//
		Double totalSalary = emps.stream()
		.map(e -> e.getSalary())
		.reduce(0.0, Double::sum);
		System.out.print("\n total salary  alla emps : "+totalSalary);
		
		
	}
}
