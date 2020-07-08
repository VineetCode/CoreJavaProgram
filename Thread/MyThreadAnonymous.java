public class MyThreadAnonymous{

     public MyThreadAnonymous(String name){
	    Thread t=new Thread(name){

			public void run(){
			     for(int i=1;i<6;i++){
				    System.out.println("Enter run method ::"+name+ " :-->"+i );
				 }//for
				 System.out.println("Finished Thread");
			}//run
		};
		t.start();
	 }//constructor

	public static void main(String[] args) {
	   MyThreadAnonymous  anonymous=new MyThreadAnonymous("MyThread");

	}
}
