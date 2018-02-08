import java.util.*;
public class BinaryS {
 public static void main(String[] args) {
	 ArrayList al = new ArrayList();
	 al.add(0);
	 al.add(10);
	 al.add(8);
	 al.add(15);
	 al.add(20);
	 al.add(12);
	 System.out.println(al);;
	 Collections.sort(al,new MyComparator());
	 System.out.println(al);
     System.out.println(Collections.binarySearch(al, 10,new MyComparator()));
     System.out.println(Collections.binarySearch(al, 16, new MyComparator()));
     Collections.reverse(al);
     System.out.println(al);
 }
}

class MyComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
	return i2.compareTo(i1);
	}
}
