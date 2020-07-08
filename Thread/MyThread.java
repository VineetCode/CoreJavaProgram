public class MyThread extends Thread {

	public void run(){
	
	   for(int i=0;i<5;i++){
	     System.out.println("Enter run method ::"+Thread.currentThread().getName()+ " :-->"+i );
	  } 
	  System.out.println("Finsihed with MyThread.");
	}
	public static void main(String[] args) {
      
	   for(int i=0;i<5;i++){
	     System.out.println("Enter main method ::"+Thread.currentThread().getName()+ " :-->"+i );
	  }

		MyThread thread=new MyThread();
		thread.start();
	}
}
