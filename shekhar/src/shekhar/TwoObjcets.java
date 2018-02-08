package shekhar;

public class TwoObjcets {
 
	 public static   Object lock1 = new Object();
     public static Object lock2 = new Object();
     
      public static void main(String[] args) {
	  Threadd t1= new Threadd();
	  Threadd1 t2 = new Threadd1();
	  t1.start();
	  t2.start();
  }

private static  class Threadd extends Thread{
	public void run() {
		synchronized(lock1) {
			System.out.println("Thread1 : hoilding lock1.");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("T1:waiting for lock2..");
			
			synchronized(lock2) {
				System.out.println("t1: holding lock1 and lock2");
			}
		}
	}
}
private static class Threadd1 extends Thread {
	public void run() {
		synchronized(lock2) {
		System.out.println("t2: holding lock2.");
		
		try {
			Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("t2: waiting for  lock1.");
	synchronized(lock1) {
		System.out.println("t2: holding lock1 and lock2.");
	}
	}
}
}
}
