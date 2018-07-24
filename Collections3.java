package demo;

import java.util.*;


//public class Collections3 {
//
//	
//	//TreeMap
//	// This function prints frequencies of all elements
//    static void printFreq(int arr[])
//    {
//        // Creates an empty TreeMap
//        TreeMap<Integer, Integer> tmap =
//                     new TreeMap<Integer, Integer>();
// 
//        // Traverse through the given array
//        for (int i = 0; i < arr.length; i++)
//        {
//            Integer c = tmap.get(arr[i]);
// 
//            // If this is first occurrence of element   
//            if (tmap.get(arr[i]) == null)
//               tmap.put(arr[i], 1);
// 
//            // If elements already exists in hash map
//            else
//              tmap.put(arr[i], ++c);
//        }
// 
//        // hello
//        // h=1,e=1,l=2,o=1
//        
//        // Print result
//        for (Map.Entry m:tmap.entrySet())
//          System.out.println("Frequency of " + m.getKey() + 
//                             " is " + m.getValue());
//        System.out.println(tmap);
//    }
//	public static void main(String[] args) {
//		
//		//TreeMap
////		int arr[] = {10, 34, 5, 10, 3, 5, 10};
////        printFreq(arr);
//		
//		//LinkedHashMap
//		
////		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
////		 
////		 lhm.put("one", "yello");
////		 lhm.put("five", "jello");
////		 lhm.put("four", "cello");
////		
////		 // It prints the elements in same order 
////		 // as they were inserted    
////		 System.out.println(lhm);
////		
////		 System.out.println("Getting value for key 'one': "
////		                                + lhm.get("one"));
////		 System.out.println("Size of the map: " + lhm.size());
////		 System.out.println("Is map empty? " + lhm.isEmpty());
////		 System.out.println("Contains key 'two'? "+ 
////		                           lhm.containsKey("two"));
////		 System.out.println("Contains value 'ye"
////		 +"llo'? "+ lhm.containsValue("ye"+
////		 "llo"));
////		 System.out.println("delete element 'one': " + 
////		                    lhm.remove("one"));
////		 System.out.println(lhm);
//		
//		
//	}
//
//}

//Comparable Interface

////A class 'Movie' that implements Comparable
//class Movie implements Comparable<Movie>
//{
// private double rating;
// private String name;
// private int year;
//
// // Used to sort movies by year
// public int compareTo(Movie m)
// {
//     return this.year - m.year;
// }
//
// // Constructor
// public Movie(String nm, double rt, int yr)
// {
//     this.name = nm;
//     this.rating = rt;
//     this.year = yr;
// }
//
// // Getter methods for accessing private data
// public double getRating() { return rating; }
// public String getName()   {  return name; }
// public int getYear()      {  return year;  }
//}
//
////Driver class
//class Collections3
//{
// public static void main(String[] args)
// {
//     ArrayList<Movie> list = new ArrayList<Movie>();
//     list.add(new Movie("Force Awakens", 8.3, 2015));
//     list.add(new Movie("Star Wars", 8.7, 1977));
//     list.add(new Movie("Empire Strikes Back", 8.8, 1980));
//     list.add(new Movie("Return of the Jedi", 8.4, 1983));
//
//     Collections.sort(list);
//
//     System.out.println("Movies after sorting : ");
//     for (Movie movie: list)
//     {
//         System.out.println(movie.getName() + " " +
//                            movie.getRating() + " " +
//                            movie.getYear());
//     }
// }
//}

// Comparable and Comparator
//
////A class 'Movie' that implements Comparable
//class Movie implements Comparable<Movie>
//{
// private double rating;
// private String name;
// private int year;
//
// // Used to sort movies by year
// public int compareTo(Movie m)
// {
//     return this.year - m.year;
// }
//
// // Constructor
// public Movie(String nm, double rt, int yr)
// {
//     this.name = nm;
//     this.rating = rt;
//     this.year = yr;
// }
//
// // Getter methods for accessing private data
// public double getRating() { return rating; }
// public String getName()   {  return name; }
// public int getYear()      {  return year;  }
//}
//
////Class to compare Movies by ratings
//class RatingCompare implements Comparator<Movie>
//{
// public int compare(Movie m1, Movie m2)
// {
//     if (m1.getRating() < m2.getRating()) return -1;
//     if (m1.getRating() > m2.getRating()) return 1;
//     else return 0;
// }
//}
//
////Class to compare Movies by name
//class NameCompare implements Comparator<Movie>
//{
// public int compare(Movie m1, Movie m2)
// {
//     return m1.getName().compareTo(m2.getName());
// }
//}
//
////Driver class
//class Collections3
//{
// public static void main(String[] args)
// {
//     ArrayList<Movie> list = new ArrayList<Movie>();
//     list.add(new Movie("Force Awakens", 8.3, 2015));
//     list.add(new Movie("Star Wars", 8.7, 1977));
//     list.add(new Movie("Empire Strikes Back", 8.8, 1980));
//     list.add(new Movie("Return of the Jedi", 8.4, 1983));
//
//     // Sort by rating : (1) Create an object of ratingCompare
//     //                  (2) Call Collections.sort
//     //                  (3) Print Sorted list
//     System.out.println("Sorted by rating");
//     RatingCompare ratingCompare = new RatingCompare();
//     Collections.sort(list, ratingCompare);
//     for (Movie movie: list)
//         System.out.println(movie.getRating() + " " +
//                            movie.getName() + " " +
//                            movie.getYear());
//
//
//     // Call overloaded sort method with RatingCompare
//     // (Same three steps as above)
//     System.out.println("\nSorted by name");
//     NameCompare nameCompare = new NameCompare();
//     Collections.sort(list, nameCompare);
//     for (Movie movie: list)
//         System.out.println(movie.getName() + " " +
//                            movie.getRating() + " " +
//                            movie.getYear());
//
//     // Uses Comparable to sort by year
//     System.out.println("\nSorted by year");
//     Collections.sort(list);
//     for (Movie movie: list)
//         System.out.println(movie.getYear() + " " +
//                            movie.getRating() + " " +
//                            movie.getName()+" ");
// }
//}  

//Generic classes
//
////We use < > to specify Parameter type
//class Test<T>
//{
// // An object of type T is declared
// T obj;
// Test(T obj) {  this.obj = obj;  }  // constructor
// public T getObject()  { return this.obj; }
//}
//
////Driver class to test above
//class Collections3
//{
// public static void main (String[] args)
// {
//     // instance of Integer type
//     Test <Integer> iObj = new Test<Integer>(123);
//     System.out.println(iObj.getObject());
//
//     // instance of String type
//     Test <String> sObj =
//                       new Test<String>("DumdeeDum");
//     System.out.println(sObj.getObject());
// }
//}

//Generic Method

//public class Collections3 {
//    // generic method printArray
//    public static < E > void printArray( E[] inputArray ) {
//        // Display array elements
//        for(E element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//        System.out.println();
//    }
//
//    public static void main(String args[]) {
//        // Create arrays of Integer, Double and Character
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//
//        System.out.println("Array integerArray contains:");
//        printArray(intArray);   // pass an Integer array
//
//        System.out.println("\nArray doubleArray contains:");
//        printArray(doubleArray);   // pass a Double array
//
//        System.out.println("\nArray characterArray contains:");
//        printArray(charArray);   // pass a Character array
//    }
//    }

//	class Box<T> {
//	private T t;
//	
//	public void add(T t) {
//	   this.t = t;
//	}
//	
//	public T get() {
//	   return t;
//	}
//	}
//	public class Collections3{
//	public static void main(String[] args) {
//	   Box<Integer> integerBox = new Box<Integer>();
//	   Box<String> stringBox = new Box<String>();
//	
//	   integerBox.add(new Integer(10));
//	   stringBox.add(new String("Hello World"));
//	
//	   System.out.printf("Integer Value :%d\n\n", integerBox.get());
//	   System.out.printf("String Value :%s\n", stringBox.get());
//	}
//	}

//Bounded Arguments

//public class Collections3 {
//	   // determines the largest of three Comparable objects
//	   
//	   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
//	      T max = x;   // assume x is initially the largest
//	      
//	      if(y.compareTo(max) > 0) {
//	         max = y;   // y is the largest so far
//	      }
//	      
//	      if(z.compareTo(max) > 0) {
//	         max = z;   // z is the largest now                 
//	      }
//	      return max;   // returns the largest object   
//	   }
//	   
//	   public static void main(String args[]) {
//	      System.out.printf("Max of %d, %d and %d is %d\n\n", 
//	         3, 4, 5, maximum( 3, 4, 5 ));
//
//	      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
//	         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));
//
//	      System.out.printf("Max of %s, %s and %s is %s\n","pear",
//	         "apple", "orange", maximum("pear", "apple", "orange"));
//	   }
//	}
//	    

