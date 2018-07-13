
public class Students {

	
	// Class variables
	String name;
	String address;
	int age;
	double la;
	//Class methods
	String talking(String name) {
		System.out.println(name+" "+"talks so much");
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Students ankur= new Students();
//		System.out.println(ankur.name+" "+ankur.age+" "+ankur.address+" "+ankur.la);
		String name =ankur.talking("Purab");
	}

}
