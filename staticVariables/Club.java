package staticVariables;

public class Club {

	public static void main(String[] args) {
		Members member1 = new Members("John","Smith");
		Members member2 = new Members("Kelsey","Davids");
		Members member3 = new Members("Allan","Paul");	
		
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getNum());
		
		System.out.println(Members.getNum()); //static method does not need an object
		
	}
	
	

}
