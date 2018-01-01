package enumeration;

public enum People {
	bucky("nice", "22"),
	kelsey("fun", "19"),
	julia("good", "23"),
	nicole("Italian", "12"),
	brock("left","16"),
	erin("tall","53");
	
	private final String desc;
	private final String year;
	
	People(String desc0, String year0){
		desc = desc0;
		year = year0;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
	
}
