package demo;
import java.util.Scanner;

//abstract class Base {
//	Base() { System.out.println("Base Constructor Called"); }
//    abstract void fun();
//}
//
//class Derived extends Base {
//	Derived() { System.out.println("Derived Constructor Called"); }
//    void fun() { System.out.println("Derived fun() called"); }
//}
//
//abstract class Base {
//    final void fun() { System.out.println("Derived fun() called"); }
//}
//  
//class Derived extends Base {
//}
//public class Abstraction {
//
//	public static void main(String[] args) {
//		
////		 Base b = new Base();
//		 
//  
//        Base b = new Derived();
//        b.fun(); 
//    
//		
//	}
//
//}


//
//abstract class Shape
//{
//	String color;
//	
//	// these are abstract methods
//	abstract double area();
//	public abstract String toString();
//	
//	// abstract class can have constructor
//	public Shape(String color) {
//	System.out.println("Shape constructor called");
//	this.color = color;
//}
//
//// this is concrete method
//public String getColor() {
//	return color;
//}
//}
//class Circle extends Shape
//{
//		double radius;
//		
//		public Circle(String color,double radius) {
//		super(color);
//		System.out.println("Circle constructor called");
//		this.radius = radius;
//	}
//	
//	@Override
//	double area() {
//		return Math.PI * Math.pow(radius, 2);
//		}
//	
//	@Override
//	public String toString() {
//		return "Circle color is " + super.color + "and area is : " + area();
//	}
//
//}
//class Rectangle extends Shape{
//
//	double length;
//	double width;
//	
//	public Rectangle(String color,double length,double width) {
//	super(color);
//	System.out.println("Rectangle constructor called");
//	this.length = length;
//	this.width = width;
//}
//
//@Override
//double area() {
//	return length*width;
//}
//
//@Override
//public String toString() {
//	return "Rectangle color is " + super.color + "and area is : " + area();
//}
//
//}
//public class Abstraction {
//
//	public static void main(String[] args) {
//	
//		Shape s1 = new Circle("Red", 2.2);
//        Shape s2 = new Rectangle("Yellow", 2, 4);
//        
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//        
//	}
//
//}

//Interface
//Interface declaration: by first user  
//interface Drawable{  
//	void draw();  
//}  
////Implementation: by second user  
//class Rectangle implements Drawable{  
//    public void draw(){System.out.println("drawing rectangle");}  
//}  
//class Circle implements Drawable{  
//	public void draw(){System.out.println("drawing circle");}  
//}  
////Using interface: by third user  
//class Abstraction{   
//	
//	public static void main(String args[]){  
//	Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
//	d.draw();  
//	
//        }
//	}  


//Combined example interface and abstract

//interface AtmMachine 
//{   
//        // Implicitly below methods are public and abstract
//        void withdraw(double  amt);
//        void checkBalance();
//        void deposit(double amt);   
//}
//abstract class Bank implements AtmMachine
//{
//    double balance;
//    
//    // abstract class can have constructor
//    public Bank(double initialBalance) {
//        balance = initialBalance;
//    }
//    
//    // concrete methods
//    @Override
//    public void deposit(double amount)
//    {
//        balance = balance + amount;
//    }
//    
//    @Override
//    public void withdraw(double amount)
//    {
//        balance = balance - amount;
//    }
//    
//    // this is abstract method
//    public abstract void addInterest();
//}
// class Hdfc extends Bank implements AtmMachine 
// {
//     
//    double interest;
//     
//    public Hdfc(double initialBalance,double initialInterest) {
//        super(initialBalance);
//        interest = initialInterest;
//    }
//    
//    public Hdfc() {
//        this(1000,5);
//    }
//
//    @Override
//    public void checkBalance() {
//        System.out.println("From HDFC: balance is "+balance);
//        
//    }
//
//    @Override
//    public void deposit(double amt) {
//        super.deposit(amt);
//        System.out.println("From HDFC : successfully deposit");
//
//    }
//
//    @Override
//    public void addInterest() {
//        // HDFC bank Interest Logic
//        balance = balance + 0.3*balance * interest;
//    }
//}
//class Icici extends Bank implements AtmMachine 
//{
//     double interest;
//     
//     public Icici(double initialBalance,double initialInterest) {
//        super(initialBalance);
//        interest = initialInterest;
//        
//     }
//    
//     public Icici() {
//        this(10000,10);
//    }
//
//    @Override
//    public void withdraw(double amt) {
//        super.withdraw(amt);
//        System.out.println("From ICICI: Successfully Withdraw "+amt);
//    }
//
//    @Override
//    public void checkBalance() {
//        System.out.println("From ICICI: balance is "+balance);
//        
//    }
//
//    @Override
//    public void deposit(double amt) {
//        super.deposit(amt);
//        System.out.println("From ICICI: successfully withdraw");
//        
//    }
//
//    @Override
//    public void addInterest() {
//        // ICICI bank Interest Logic
//        balance = balance + 0.1*balance * interest;
//    }
//            
//}
//class Sbi extends Bank implements AtmMachine
//{
//    double interest;
//    
//    public Sbi(double initialBalance,double initialInterest) {
//        super(initialBalance);
//        interest = initialInterest;
//    }
//    
//    public Sbi() {
//        this(100,2);
//    }
//
//    @Override
//    public void checkBalance() {
//        System.out.println("From Sbi: balance is "+balance);
//        
//    }
//
//    @Override
//    public void deposit(double amt) {
//        super.deposit(amt);
//        System.out.println("From Sbi : successfully deposit");
//
//    }
//
//    @Override
//    public void addInterest() {
//        // Sbi bank Interest Logic
//        balance = balance + 0.2*balance*interest;
//    }
//}
//public class Abstraction{
//
//    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Scanner scn =new Scanner(System.in);
//        System.out.println("Enter Card :");
//        String card=scn.next();
//        Class cls = Class.forName(card);
//        
//        Object obj = cls.newInstance();
//        
//        AtmMachine a=(AtmMachine) obj;
//        a.withdraw(100);
//        a.checkBalance();
//        a.deposit(500);
//        a.checkBalance();
//
//}
//}

//Wrapper classes

//class Abstraction{   
//
//public static void main(String args[]){  
//	double a = 4.3;
//    
//	Integer i = 9;
//
//    Double b= 4.3;
//    
//    
////	System.out.println(a);
////    System.out.println(Math.ceil(a));
////    System.out.println(b.equals(a));
//
//    }
//}


//abstract class Animal{
//	abstract void talking();
//}
//
//class Dog extends Animal{
//	void talking() {
//		System.out.println("Woof woof");
//	}
//}
//class Cat extends Animal{
//	void talking() {
//		System.out.println("Meow Meow");
//	}
//}
//class Abstraction{   
//
//public static void main(String args[]){  
//	
//	Animal a= new Cat();
//	a.talking();
//
//  }
//}


