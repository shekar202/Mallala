import java.util.*;

class Test2  {
	
	public static void main(String[] args) {
		ArrayList v = new ArrayList();//ArrayList Default size is 10 and if you add 11th 
		//element the size will be (currentCapacity*3/2)+1
		//for the vector it will be correntcapacity*2
		 new Thread() {
		
		public void run(){
			v.add(10);
			v.add("sh");
			System.out.println(v);
		}
		 }.start();
		 try {
	Thread.sleep(1000);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
			
			 new Thread() {
			
			public void run() {
				System.out.println(v.size());
				v.remove(1);
				System.out.println(v);
			}
			 }.start();
			
			
		
	}
}

