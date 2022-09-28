package pcs.practice.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
//	static String duplicates="";

	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java",  "java", "JavaScript","C", "Python" };
		
		List<String> al = new ArrayList<>();
		List<String> a1l = new ArrayList<>();
		Set<String> ds = new HashSet<>();
		//with for loop
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					ds.add(names[i]);
//					duplicates+=", "+names[i];
					if (al.contains(names[i])) {
						break;
					}
					else {
						al.add(names[i]);
					}
					
				}
			}
			if(a1l!=null){
                if(!a1l.contains(names[i])){
                    a1l.add(names[i]);
                }

            }else{
                a1l.add(names[i]);
            }
		}
		for(String v:a1l){
            System.out.println(v);
        }
		System.out.println("duplicates values are : "+al);
//		System.out.println("uniq values are : "+ds);
		
		
		
//		//with set collection 
//		Set<String> data = new HashSet<>();
//		
//		for (String duplicates : names) {
//			if (data.add(duplicates)==false) {
//				System.out.println("duplicate values are : "+duplicates);
//			}
//		}
	}
	
	
}
