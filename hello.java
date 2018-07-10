import java.util.Scanner;

//Types of Variables
//class A
//{
//    int x =10;        // instance variable
//    static int y=20;   // static variable or class variable
//}

public class hello {

	public static void main(String[] args) {
		
//int x = 40;

//Conditional Programming
//		  int marks=65;  
//	      
//		    if(marks<50){  
//		        System.out.println("fail");  
//		    }  
//		    else if(marks>=50 && marks<60){  
//		        System.out.println("D grade");  
//		    }  
//		    else if(marks>=60 && marks<70){  
//		        System.out.println("C grade");  
//		    }  
//		    else if(marks>=70 && marks<80){  
//		        System.out.println("B grade");  
//		    }  
//		    else if(marks>=80 && marks<90){  
//		        System.out.println("A grade");  
//		    }else if(marks>=90 && marks<100){  
//		        System.out.println("A+ grade");  
//		    }else{  
//		        System.out.println("Invalid!");  
//		    }  
		
// Switch
//		 int number=20;  
//		    switch(number){  
//		    case 10: System.out.println("10");break;  
//		    case 20: System.out.println("20");break;  
//		    case 30: System.out.println("30");break;  
//		    default:System.out.println("Not in 10, 20 or 30");  
//		    }  
	
// While Loop
//		int i=1;  
//	    while(i<=10){  
//	        System.out.println(i);  
//	    i++;  
//	    }  

// Do While loop
//		int i=1;  
//	    do{  
//	        System.out.println(i);  
//	    i++;  
//	    }while(i<=10);  

//  Basics Input
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter your name");  
		String name=sc.next(); 
	    System.out.println(name);   
		sc.close();
	}

}
