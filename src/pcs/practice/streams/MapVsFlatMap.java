package pcs.practice.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Costomer> c = EkartDB.getAll();
		
		//List<costomer> convert List<String>  -> Data Transformation
		//mapping : costomer -> costomer.getEmail();
		//costomer -> costomer.getEmail() one to one mapping
		List<String> cstmr = 
				c.stream()
				.map(cc->cc.getEmail())
				.collect(Collectors.toList());
				System.out.println("cstmr : \n"+cstmr);
		
				
		//costomer -> costomer.getEmail() one to many mapping
		List<List<String>> cm = 
				c.stream()
				.map(cc->cc.getMibile())
				.collect(Collectors.toList());
		System.out.println("\nmobile numbers : "+cm);
		
		
		//List<costomer> convert List<String>  -> Data Transformation
		//mapping : costomer -> phone numbers;
		//costomer -> costomer.getMobile() ->> one to many mapping.
		List<String> flmp =c.stream()
		.flatMap(cc->cc.getMibile().stream())
		.collect(Collectors.toList());
		System.out.println("\nmobile numbers with flatmap : "+flmp);
		
		
		
		
		
		
		
		
	
	
	}
	
}
