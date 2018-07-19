package demo;
import java.util.*;
import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws IOException {
	
		//File Class
		
		File f = new File("/Users/nayanmehta/Desktop/AcadView_Java/demo/src/demo/yello.txt");
        if(!f. exists())
        f.createNewFile();
        
//        System.out.println("Length="+f.length()+" bytes");
//        System.out.println("Name="+f.getName());
//        System .out. println("Parent="+f .getParent() );
//        System .out. println("Path=" +f. getPath() );
//        System.out.println("Absolute Path="+f.getAbsolutePath());
//        System.out.println(f.exists()? "Exists" : "Does not exist");
//        System.out.println(f.isFile() ? "is file" : "not a file");
//        System.out.println(f.canRead() ? "is readable" : "not readable");
//        System.out.println(f.canWrite()? "is writable" : "not writable");
//        System.out.println(f.isDirectory()? "is directory" : "not a directory");

//    File f3=new File("/Users/nayanmehta/Desktop/AcadView_Java");
//    String nm[] = f3.list();
//    
//    System.out.println("list of Files & Sub-Directories of '.'");
//    for(int i=0;i < nm.length ;i++)
//    {
//        System.out.print(nm[i]);
//        File f4 = new File("/Users/nayanmehta/Desktop/AcadView_Java/"+nm[i]);
//        if(f4.isFile() == true)
//        System.out.println(" It is a File");
//        else
//        System.out.println(" It is a Directory");
//    }
//    
//    File f5=new File("/Users/nayanmehta/Desktop/zzz");
//    f5.mkdir();
//    File f6=new File("/Users/nayanmehta/Desktop/yyy/aaa");
//    f6.mkdirs();
		
		//Character Oriented Data Streaming
		
		//FileWriter Class
		
//		try {  
//			
//            Writer w = new FileWriter("A.txt");  
//            String str = "Heloooooo";  
//            w.write(str);  
//            w.close();  
//            
//            System.out.println("Complete");  
//        } catch (IOException e) {  
//            e.printStackTrace(); }  
		
		//FileReader Class
//		
//		try {  
//            Reader r = new FileReader("A.txt");  
//            int data = r.read(); 
//            System.out.println(data);
//            while (data != -1) {  
//                System.out.print((char) data);  
//                data = r.read();  
//            }  
//            r.close();  
//        } catch (Exception ex) {  
//            System.out.println(ex); 
//            }
		
		//Buffered Reader Class
		
//		  FileReader fr=new FileReader("A.txt");
//        BufferedReader br=new BufferedReader(fr); 
//        String line = br.readLine();   
//        while(line != null){
//            System.out.println(line);
//            line = br.readLine();
//        }    
//        br.close();    
//        fr.close(); 
        
		//PrintWriter Class
		
//		FileWriter fout=new FileWriter("A.txt");
//        PrintWriter pw=new PrintWriter(fout,true);
//        pw.println("This is a string");
//        int i=-7;
//        pw.println(i);
//        double d=4.5e-7;
//        pw.println(d);
		
		//Byte Oriented Data Streaming
		
		//Input Stream
		
//		try{
//            FileInputStream fis= new FileInputStream("A.txt");
//            int size = fis.available();
//            byte ba[]=new byte[size];
//            fis.read(ba);
//            String data=new String(ba);
//            System.out.println(data);
//            fis.close();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
		
		//Output Stream
		
//		int n; 
//        FileInputStream fin=new FileInputStream("A.txt");
//        FileOutputStream fout=new FileOutputStream("B.txt");
//        byte b[]=new byte[10];
//        n=fin.read(b);
//        System.out.println(n);
//        while(n!=-1)
//        {
//            fout.write(b,0,n); //write(String str,int off,int len)
//            n=fin.read(b);
//            }
//        fin.close();
//        fout.close();
        
        //Buffered Output Stream
		
//		FileOutputStream fout=new FileOutputStream("A.txt");
//        BufferedOutputStream bout=new BufferedOutputStream(fout);
//        String str="This is hello";
//        byte b[]=str.getBytes();
//        bout.write(b);
//        bout.flush();
//        bout.close();
//        fout.close();
		
		//Buffered Input Stream
		
//		FileInputStream fin=new FileInputStream("A.txt");
//        BufferedInputStream bin=new BufferedInputStream(fin);
//        for(int i=1;i<=10;i++)
//            System.out.println((char)bin.read());
//        if(bin.markSupported())
//        {
//            bin.mark(500);
//            for(int i=1;i<=10;i++)
//                    System.out.println((char)bin.read());
//                bin.reset();
//        }
//        else
//            {System.out.println("Marking option not available");
//         }
//        bin.close();
//        fin.close();
		
		//Print Stream Class
//		FileOutputStream fout=new FileOutputStream("A.txt ");    
//        PrintStream pout=new PrintStream(fout);    
//        pout.println("Hello World");    
//        pout.println("Welcome to Java");    
//        pout.close();    
//        fout.close();    
//        System.out.println("Completed");

	}

}
