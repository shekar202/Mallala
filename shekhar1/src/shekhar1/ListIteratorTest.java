package shekhar1;
import java.util.*;
public class ListIteratorTest {
 public static void main(String []args) {
	 ArrayList l= new ArrayList();
	 for(int i=0;i<=10;i++) {
		 l.add(i);
		 
	 }
	 System.out.println(l);
	// l.set(3,11);
	// l.add(2, 20);
	 //l.remove(10);
	 ListIterator Ll = l.listIterator();
	 
	 while(Ll.hasNext()) {
		 Integer I = (Integer)Ll.next();
		 if(I.equals(2)) {
			 Ll.remove();
		 }
		 else if(I.equals(5)) {
			 Ll.add(11);
		 }
		 else if(I.equals(8)) {
			 Ll.set(12);
		 }
		
	 }
	 System.out.println(l);
 }
}
