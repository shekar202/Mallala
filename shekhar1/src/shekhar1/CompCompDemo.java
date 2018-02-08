package shekhar1;
import java.util.*;
public class CompCompDemo {

	 public static void main(String[] args) {
		 Employee e1 = new Employee("shekar", 001);
		 Employee e2 = new Employee("vamshi",004);
		 Employee e3 = new Employee("abi", 002);
		 Employee e4= new Employee("mithil",003);
		/* TreeSet t1 = new TreeSet();
		 t1.add(e1);
		 t1.add(e2);
		 t1.add(e3);
		 t1.add(e4);
		 System.out.println(t1);*/
	
TreeSet t1 = new TreeSet(new MyComparator());
t1.add(e1);
t1.add(e2);
t1.add(e3);
t1.add(e4);
System.out.println(t1);
	 }
	}
class Employee implements Comparable{
	
  String name;
  int id;
  
  Employee(String name, int id){
	  this.name= name;
	  this.id= id;
	  
  }
  public String toString(){
	  return  name+"...."+id;
  }
  
  public int compareTo(Object obj) {
	  
	  int id1 = this.id;
	  Employee e = (Employee)obj;
	  int id2 = e.id;
	  
	  if(id1<id2) {
		  return -1;
	  }else if (id1>id2) {
		  return +1;
	  }else {
		  return 0;
	  }
  }
}

class MyComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		
		Employee e1 = (Employee)obj1;
		Employee e2 =(Employee)obj2;
		String s1=e1.name;
		String s2= e2.name;
		return s1.compareTo(s2);
	}
}
