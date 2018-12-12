package geeksforgeeks;
class Task extends Thread{
	public void run() {
		
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
	} 
}
class Task1 extends Thread{
   public void run() {
	   for(int i=110;i<=200;i++) {
		 	System.out.print(i+" ");
		}
   }
}
public class Threading extends Thread {
public static void main(String agrs[]) {
	
	 Thread task=new Thread(new Task());
	 Thread task1=new Thread(new Task1());
	 task.run();
	 task1.run();
	 
}
}
