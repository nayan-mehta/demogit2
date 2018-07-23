package Demo;
import java.io.*;
import java.util.*;

class Allfiles{
	 
	 
ArrayList<String> al1=new ArrayList<String>();
ArrayList<String> al2=new ArrayList<String>();
Iterator<String> ip = al2.iterator();

void Listing(String Dir)throws IOException{
		 FileWriter  Writer=new FileWriter("D:/Java Programs/Acadview/CSV.csv");
		File f3=new File(Dir);
	  String nm[] = f3.list();
	  
	  System.out.println("list of Files & Sub-Directories of '.'");
	  
	  for(int i=0;i < nm.length ;i++)
	  {
	      System.out.print(nm[i]);
	      File f4 = new File(Dir+"/"+nm[i]);
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
	      
	      Listing(dir2);
	     }
		}

	  Writer.close();
	

	  
	  
//	while(ip.hasNext())
//	{
//		Listing(ip.next());
//
//	}
//		System.out.println(al2);
		
		}
}
public class MiniPro {
public static void main(String args[])throws IOException{
	Allfiles af=new Allfiles();
	System.out.println("Enter the Path:");
	Scanner sn=new Scanner(System.in);
	String N= sn.nextLine();
	sn.close();
	af.Listing(N);
}
}
