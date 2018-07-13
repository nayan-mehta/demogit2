
package demo;

// Inheritance
//class A{
//        int x;
//        void setX(int x1)
//        {
//            x=x1;
//        }
//        void displayX()
//        {
//            System.out.println(x);
//        }
//        A(){
//        	System.out.println("Parent class");
//        }
//            }
//    class B extends A
//    {
//        int x;
//        
//        B(){
////        	super();
//        	System.out.println("Child class");
//        }
//        void setY(int y1)
//        {
//            x=y1;    
//        }
//        void displayY()
//        {
//            System.out.println(super.x);
//        }
//    }
//    class InheritTest1 {
//        public static void main (String[] args) {
//        	
////            A a1 = new A(); 
////            a1.setX(5);
////            a1.displayX();
//            
//            B b1 = new B(); 
//            
////            b1.setX(10);
////            b1.setY(20);
//            
////            System.out.println(b1.x);
//            
////            b1.displayX();
////            b1.displayY();
//            
////            a1.displayY();
//        }
//    
//    } 


//Method Overriding

//    class A
//    {
//        int x;
//        
//        void set(int x1){
//            x = x1;
//        }
//        void display(){
//            System.out.println(x);
//        }
//    }
//    class B extends A
//    {
//        int y;
//        
//        // set method of class B is not overriding set
//        // method of class A as arguments are different
//        void set(int x1,int y1){
//            set(x1); // This will call set() of class A 
//            y = y1;
//        }
//        
//        @Override
//        // display method of class B is overriding display
//        // method of class A
//        void display(){
////            // display; This will call display of class B
//            super.display(); // This will call display of class A
//            System.out.println(y);
//        }
//    }
//    class InheritTest1{
//        public static void main (String[] args) {
//            B b1 = new B();
//            b1.set(10,20);
//            b1.display();
//        }
//    } 

//Constructor calling order
//
//                class Base 
//            {
//                int x;
//                Base(int x) {
//                    System.out.println("Base Constructor Called");
//                    this.x = x;
//                }
////                Base(){
////                	System.out.println("Base Default");
////                }
//            }
//            
//            class Derived extends Base 
//            {
//                int y;
//                Derived(int x, int y) {
//                    super(x);
//                    System.out.println("Derived Constructor Called");
//                    this.y = y;
//                }
//                void Display()
//                {
//                    System.out.println("x = "+x+", y = "+y);
//                }
//            }
//            
//            public class InheritTest1
//            {
//                public static void main(String[] args) { 
//                    Derived d = new Derived(10, 20);
//                    d.Display();
//                }
//            }
            

//Dynamic Binding
//
//class A
//{
//    void m1()
//    {
//        System.out.println("Inside A's m1 method");
//    }
//}
//
//class B extends A
//{
//    // overriding m1()
//    void m1()
//    {
//        System.out.println("Inside B's m1 method");
//    }
//}
//
//class C extends A
//{
//    // overriding m1()
//    void m1()
//    {
//        System.out.println("Inside C's m1 method");
//    }
//}
//
//class InheritTest1
//{
//    public static void main(String args[])
//    {
//        // object of type A
//        A a = new A();
//
//        // object of type B
//        B b = new B();
//
//        // object of type C
//        C c = new C();
//
//        // obtain a reference of type A
//        A ref;
//        
//        // ref refers to an A object
//        ref = a;
//
//        // calling A's version of m1()
//        ref.m1();
//        
//
//        // now ref refers to a B object
//        ref = b;
//
//        // calling B's version of m1()
//        ref.m1();
//       
//        // now ref refers to a C object
//        ref = c;
//
//        // calling C's version of m1()
//        ref.m1();
//    }
//}

//Static keyword

//class InheritTest1
//{
//    // static variable
//    static int a = 10;
//    static int b;
//    
//    int c = 30;
//     
//    // static block
//      static void yello(){
//        System.out.println("Static block initialized.");
//        b = a * 4;
//    }
// 
//    public static void main(String[] args)
//    {
//       System.out.println("from main");
//       yello();
//       System.out.println("Value of a : "+a);
//       System.out.println("Value of b : "+b);
//       
//       InheritTest1 i= new InheritTest1();
//       System.out.println("Value of b : "+i.c);
//    }
//}
 