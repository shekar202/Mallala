import java.util.*;
public class Binary {
  public static void main(String[] args) {
	  ArrayList al = new ArrayList();
	  al.add("A");
	  al.add("Z");
	  al.add("K");
	  al.add("M");
	  al.add("a");
	  System.out.println(al);
	  Collections.sort(al);
	  System.out.println(al);
	  System.out.println(Collections.binarySearch(al, "M"));
	  System.out.println(Collections.binarySearch(al, "J"));
	  
  }
	
}
