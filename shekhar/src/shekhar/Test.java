package shekhar;

 class Display {
	 public synchronized void wish(String name) {
		 for(int i=0; i<5; i++) {
			 System.out.println("good morning" + Thread.currentThread().getName()+".."+ this.hashCode());
			 try {
			 Thread.sleep(2000);
			 }catch(Exception e) {
				 System.out.println(name);
			 }
		 }
	 }

}
 
 class MyThread extends Thread{
	 Display d;
	 String name;
	   
	 MyThread(Display d, String name){
		 this.d=d;
		 this.name = name;
		 
	 }
	 public void run()  {
		 d.wish(name);
	 }
 }

public  class Test{
	 public static void main (String[] args) {
		 Display d= new Display();
		 MyThread t1 = new MyThread(d,"msr");
		 MyThread t2 = new MyThread(d,"sham");
		 t1.start();
		 t2.start();
		 
	 }
 }