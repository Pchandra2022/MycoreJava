package pcs.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	
	public static Costomer getCostomerEmailId(String email) throws Exception {
		List<Costomer> costomers = EkartDB.getAll();
		return costomers.stream()
		.filter(f->f.getEmail().equals(email))
		.findAny()
		.orElseThrow(()->new Exception("no costomer present with this given emai id"));
//		.orElse(new Costomer());
//		.get();
	}
	
	
	public static void main(String[] args) {
		Costomer c = new Costomer(101, "john", "john@gmail.com", Arrays.asList("777777777", "666666666"));

		//empty method
		//of method
		//ofNullable method
		
		Optional.empty();
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		
//		Optional<String> emailOptional = Optional.of(c.getEmail());
//		System.out.println(emailOptional);
		
		Optional<Object> ofNullable = Optional.ofNullable(c.getEmail());
//		if (ofNullable.isPresent()) {
//			System.out.println(ofNullable.get());
//		}
		
//		System.out.println(ofNullable.orElse("rey chandu gaa default mail id raaaa idhi....: defualt@gmail.com \n"));
		
//		System.out.println(ofNullable.orElseThrow(()->new IllegalArgumentException("sorry ra chandu email.not present"))+"\n");
		
//		System.out.println(ofNullable.map(String::toUpperCase).orElseGet(()->"default email..."));
		
		try {
			getCostomerEmailId("john");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
