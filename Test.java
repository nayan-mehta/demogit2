
//this refer class instance variable

//public class Test {
//	int a;
//    int b;
//    
//    // Parameterized constructor
//    Test(int a, int b)
//    {
//        this.a = a;
//        this.b = b;
//    }
//
//    void display()
//    {
//        //Displaying value of variables a and b
//        System.out.println("a = " + a + " b = " + b);
//    }
//    
//	public static void main(String[] args) {
//		
//		Test object = new Test(10, 20);
//        object.display(); 
//
//	}
//
//}

//this() to invoke current class constructor
//class Test
//{
//    int a;
//    int b;
//
//    //No args constructor
//    Test()
//    { 
//        this(10, 20);
//        System.out.println("Inside default constructor \n");
//    }
//    
//    //Parameterized constructor
//    Test(int a, int b)
//    {
//        this.a = a;
//        this.b = b;
//        System.out.println("Inside parameterized constructor"+" "+a+" "+b);
//    }
//
//    public static void main(String[] args)
//    {
//        Test object = new Test();
//    }
//}

//this to return class instance
//class Test
//{
//    int a;
//    int b;
//
//    //Default constructor
//    Test()
//    {
//        a = 10;
//        b = 20;
//    }
//    
//    //Method that returns current class instance
//    Test get()
//    {
//        return this;
//    }
//    
//    //Displaying value of variables a and b
//    void display()
//    {
//        System.out.println("a = " + a + " b = " + b);
//    }
//
//    public static void main(String[] args)
//    {
//        Test object = new Test();
//        object.get().display();
//    }
//} 

//this as a method parameter

//class Test
//{
//    int a;
//    int b;
//    
//    // Default constructor
//    Test()
//    {
//        a = 10;
//        b = 20;
//    }
//    
//    // Method that receives 'this' keyword as parameter
//    void display(Test obj)
//    {
//        System.out.println("a = " + obj.a + " b = " + obj.b);
//    }
//
//    // Method that returns current class instance
//    void get()
//    {
//        display(this);
//    }
//
//    public static void main(String[] args)
//    {
//        Test object = new Test();
//        object.get();
//    }
//}

//‘this’ keyword to invoke current class method
//class Test {
//
//    void display()
//    {
//        // calling function show()
//        this.show();
//    
//    System.out.println("Inside display function");
//    }
//    
//    void show() {
//        System.out.println("Inside show function");
//    }
//    
//
//    public static void main(String args[]) {
//        Test t1 = new Test();
//        t1.display();
//    }
//}

//import java.util.Scanner;
//    public class Test
//    {
//        public static void main(String[] args)
//        {
//            // Declare the object and initialize with
//            // predefined standard input object
//            Scanner sc = new Scanner(System.in);
//     
//            // String input
//            String name = sc.nextLine();
//     
//            // Character input
//            char gender = sc.next().charAt(0);
//     
//            // Numerical data input
//            // byte, short and float can be read
//            // using similar-named functions.
//            int age = sc.nextInt();
//            long mobileNo = sc.nextLong();
//            double cgpa = sc.nextDouble();
//     
//            // Print the values to check if input was correctly obtained.
//            System.out.println("Name: "+name);
//            System.out.println("Gender: "+gender);
//            System.out.println("Age: "+age);
//            System.out.println("Mobile Number: "+mobileNo);
//            System.out.println("CGPA: "+cgpa);
//            
//            sc.close();
//        }
//    }

//class A
//{
//    B obj;
//    
//    // Parameterized constructor with object of B 
//    // as a parameter
//    A(B obj)
//    {
//        this.obj = obj;
//        
//    // calling display method of class B
//        obj.display();
//    }
//    
//}
//
//class B
//{
//    int x = 5;
//    
//    // Default Constructor that create a object of A 
//    // with passing this as an argument in the 
//    // constructor
//    B()
//    {
//        A obj = new A(this);
//    }
//    
//    // method to show value of x 
//    void display()
//    {
//        System.out.println("Value of x in Class B : " + x);
//    }
//    
//    public static void main(String[] args) {
//        B obj = new B();
//    }
//}
        

