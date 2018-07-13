//
//public class AnimalDemo {
//    
//	String name;
//	String species;
//	int population;
//	
//	public String getName() {
//		return name;
//	}
//	public String getSpecies() {
//		return species;
//	}
//	public int getPop() {
//		return population;
//	}
//
//	//Default Constructor
////No args constructor
////	public AnimalDemo() {
////	System.out.println("No args Constructor");
//// }
//
////Parameterized constructor
////	public AnimalDemo(String name, String species, int pop){
////	  this.name=name;
////	  this.species= species;
////	  this.population= pop;
////	}
//
//	public static void main(String[] args) {
//		
//		AnimalDemo ani = new AnimalDemo();
//		System.out.println(ani.getName()+ " "+ani.getSpecies()+" "+ani.getPop());
//        
//	}
//
//}




class AnimalDemo 
{
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    AnimalDemo(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    
    // constructor used when no dimensions specified
    AnimalDemo()
    {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // AnimalDemo
    }
    
    // constructor used when cube is created
    AnimalDemo(double len)
    {
        width = height = depth = len;
    }
    
    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }

    public static void main(String args[]) 
    {
        // create AnimalDemoes using the various constructors
        AnimalDemo myAnimalDemo1 = new AnimalDemo(10, 20, 15);
        AnimalDemo myAnimalDemo2 = new AnimalDemo();
        AnimalDemo mycube = new AnimalDemo(7);
        
        double vol;
        
        // get volume of first AnimalDemo
        vol = myAnimalDemo1.volume();
        System.out.println("Volume of myAnimalDemo1 is " + vol);
        // get volume of second AnimalDemo
        vol = myAnimalDemo2.volume();
        System.out.println("Volume of myAnimalDemo2 is " + vol);
        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}