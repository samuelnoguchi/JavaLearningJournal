package inheritanceAndPolyMorphism;

public class Professor extends Person {
	
	public Professor(String firstName0, String lastName0){
		super(firstName0, lastName0);
	}
	
	public void print(){
		System.out.println("Professor Details:");
		super.print();
	}
	
}
