public class ThreadStates {

 public static void main(String[] args) {
      Thread thread = new Thread(new MyThread(), "MyThread");
      displayState("State after creation", thread);
      // Calling start method
      thread.start();
 
  try {
     // sleep method on Main thread 
      Thread.sleep(200);
      displayState("After starting ", thread);
      thread.join();
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
     displayState("State after running ", thread);
 }
 
 public static void displayState(String msg, Thread thread){
  System.out.println(msg + "- " + "Thread Name- " + thread.getName() 
     + " State- " +  thread.getState());
 }
}

class MyThread implements Runnable{
    @Override
    public void run() {
       ThreadStates.displayState("State in run method ", Thread.currentThread());
       System.out.println("In run method of MyThread --" + Thread.currentThread().getName());   
  
	 try {
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
       ThreadStates.displayState("In run method after sleep", Thread.currentThread());  
     }    
}