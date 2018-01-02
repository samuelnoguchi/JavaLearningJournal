package staticVariables;

public class Members {
	private String first;
	private String last;
	private static int num =0;
	
	public Members(String fn, String ln){
		first = fn;
		last = ln;
		num++;
		System.out.printf("Constructor for %s %s members: %d \n", first, last, num);
	}
	
	public String getFirst(){
		return first;
	}

	public String getLast(){
		return last;
	}
	
	public static int getNum(){
		return num;
	}
	
}
