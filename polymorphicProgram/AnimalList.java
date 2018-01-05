package polymorphicProgram;

public class AnimalList {
	
	private int i;
	private Animal[] theList;
	
	
	public AnimalList(int size){
		i = 0;
		theList = new Animal[size];
	}
	
	
	public void add(Animal a){
		if(i<theList.length){
			theList[i] = a;
			System.out.println("Animal added at index " +i);
			i++;
		}	
	}
	
	public Animal[] getList(){
		return theList;
	}
	

}
