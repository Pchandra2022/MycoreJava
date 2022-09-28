package pcs.practice.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateValues {
	public static void main(String[] args) {
		ArrayList<Emps> Allemps = new ArrayList();
		Emps e1 = new Emps("1", "chandu", "120000");
		Emps e2 = new Emps("2", "swachith", "120000");
		Emps e3 = new Emps("3", "sathish", "120000");
		Emps e4 = new Emps("4", "kiran", "120000");
		Emps e5 = new Emps("5", "chandu", "120000");
		Emps e6 = new Emps("5", "kiran", "120000");

		Allemps.add(e1);
		Allemps.add(e2);
		Allemps.add(e3);
		Allemps.add(e4);
		Allemps.add(e5);
		Allemps.add(e6);

//		List<String> names1 = Allemps.stream().map(emp -> emp.getE_nanme()).collect(Collectors.toList());
//		Set<String> uniqNames = new HashSet<>();
//		Set<String> duplicateNames = names1.stream().filter(name -> !uniqNames.add(name)).collect(Collectors.toSet());
//
//		System.out.println("results 1  all names: " + names1);
//		System.out.println("results 2 duplicates : " + duplicateNames);
//		System.out.println("results 3 uniqs : " + uniqNames);
//		
//		
//		List<String> names = Allemps.stream().map(emp -> emp.getE_nanme()).collect(Collectors.toList());
//		Map<String, Long> mapOfNames =  names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		Set<String> namess = mapOfNames.entrySet().stream().filter(entry -> entry.getValue() >1).map(entry -> entry.getKey()).collect(Collectors.toSet());
//		
//		
//		System.out.println("results 1  all names: " + names);
//		System.out.println("results 2 duplicates : " + mapOfNames);
//		System.out.println("results 3 uniqs : " + namess);
		
		
		

	}
}
