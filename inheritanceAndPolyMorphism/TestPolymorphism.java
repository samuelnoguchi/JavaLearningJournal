package inheritanceAndPolyMorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		
		Person[] people = new Person[3]; //Create polymorphic array
		people[0] = new Student("Sam","Noguchi",2022,3.95);
		people[1] = new Student("Bill", "Gates", 2021, 3.94);
		people[2] = new Professor("Peter","Knoetal");
		
		for(Person person: people){
			person.print();
		}
		

	}

}
