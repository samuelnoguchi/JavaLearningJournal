package enumeration;

import java.util.EnumSet;

public class SeePeople {

	public static void main(String[] args) {
		
		// enumurated data type has static method values which returns array of people
		
		for(People people: People.values()){  
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}
		
		System.out.println("\nAnd now for range\n");
		
		//creates new array with specified range
		for(People people: EnumSet.range(People.kelsey, People.brock)){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}
		
	}

}
