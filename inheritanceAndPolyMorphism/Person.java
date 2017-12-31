package inheritanceAndPolyMorphism;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName0, String lastName0){
		this.firstName = firstName0;
		this.lastName = lastName0;
	}
	
	public void print(){
		System.out.println("\t"+ firstName + "\t" + lastName);
	}

}
