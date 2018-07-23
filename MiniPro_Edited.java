package demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class Allfiles{
	  static int j=0;
	 
	 
ArrayList<String> al1=new ArrayList<String>();
ArrayList<String> al2=new ArrayList<String>();
	void Listing(ArrayList<String> Dir)throws IOException{
		
		/* 
		 * Change logic here instead of hard coded path
		 */
		 FileWriter  Writer=new FileWriter("/Users/nayanmehta/Desktop/AcadView_Java/CSV.csv");
		File f3=new File("/Users/nayanmehta/Desktop/AcadView_Java");
	  String nm[] = f3.list();
	  
	  System.out.println("list of Files & Sub-Directories of '.'");
	  
	  for(int i=0;i < nm.length ;i++)
	  {
	      System.out.print(nm[i]);
	      File f4 = new File("/Users/nayanmehta/Desktop/AcadView_Java"+nm[i]);
	      if(f4.isFile() == true){
	    	System.out.println(" It is a File");
	    	String dir1=f4.getAbsolutePath();
	        Writer.append(dir1);
	        Writer.append('\n');
	        al1.add(dir1);
	      }
	      else{
	//      System.out.println(" It is a Directory");
	      String dir2=f4.getAbsolutePath();
	     
	      al2.add(dir2);
	     }
		}System.out.println(al2);

		
//		Iterator itr = al2.iterator();
//		while(itr.hasNext())
//		{
//			String i = (String)itr.next();
//			al2.remove(i);
//			Listing(al2);
//		}
		
		}
}
public class MiniPro_Edited {
public static void main(String args[])throws IOException{
	Allfiles af=new Allfiles();
	System.out.println("Enter the Path:");
	Scanner sn=new Scanner(System.in);
	String N= sn.nextLine();
	
	// Added
	ArrayList<String> al = new ArrayList();
	al.add(N);
	
	sn.close();
	af.Listing(al);
	
	// Check this out really cool function to traverse and print 
	Files.walk(Paths.get("/Users/nayanmehta/Desktop/AcadView_Java")).filter(Files::isRegularFile).forEach(System.out::println);
}
}