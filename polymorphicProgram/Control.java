package polymorphicProgram;

public class Control {

	public static void main(String[] args) {
		
		AnimalList aLo = new AnimalList(2);
		Dog d1 = new Dog();
		Fish f1 = new Fish();
		
		aLo.add(d1);
		aLo.add(f1);
		
		
		
		for(Animal a: aLo.getList()){
			a.noise();
		}
		
		

	}

}
