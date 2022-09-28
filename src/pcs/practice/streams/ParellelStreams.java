package pcs.practice.streams;

import java.util.Arrays;
import java.util.List;

public class ParellelStreams {

	public static void main(String[] args) {
		List<Student> std = Arrays.asList(new Student("chandu", 82), new Student("swachith", 90),
				new Student("sathish", 65), new Student("kiran", 55), new Student("rakesh", 85),
				new Student("sunnys", 50), new Student("arun", 88));
	
		System.out.println("\nsequential stream 1 :");
	
		//using streams --> sequential process
		std.stream()
			.filter(p -> p.getScore()>=80)
			.limit(3)
			.forEach(stu -> System.out.println(stu.getName()+" : "+stu.getScore()));
		
	System.out.println("\nparallel stream 2 : ");
		
		//using parellel-strams 
		std.parallelStream()
		.filter(s->s.getScore()>=80)
		.limit(4)
		.forEach(s->System.out.println(s.getName()+" : "+s.getScore()));
	
	
	//convert stream() into --> parellelstream()
	// by help of parellel() method
		
		System.out.println("\nparallel method stream 3 : ");
		std.stream()
		.parallel()
		.filter(s->s.getScore()>=80)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+" : "+stu.getScore()));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
