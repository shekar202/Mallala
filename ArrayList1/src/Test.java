import java.util.Vector;
/*public class Test {
	
  public static void main(String[] args){
   
	 // ArrayList al = new ArrayList();
	  final Vector v = new Vector(); 
	  Thread1 t1 = new Thread1();
	  Thread2 t2 = new Thread2();
	  t1.start();
	  t2.start();
  }


private static class Thread1 extends Thread{
	public void run() {
		v.add(10);
		v.add(20);
		System.out.println(v);
		
	}
}
private static class Thread2 extends Thread{
	public void run() {
		al.remove(0);
		System.out.println(al);
	}
}
}*/

class Test1 extends Thread {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		
		 new Thread() {
		
		public void run(){
			v.add(10);
			System.out.println(v);
		}
		 }.start();
		 
	//	Thread.sleep(100);
			
			 new Thread() {
			
			public void run() {
				v.size();
				System.out.println(v);
			}
			 }.start();
			
			
		
	}
}

