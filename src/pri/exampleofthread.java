package pri;


class Thread1 extends Thread{
    public void run(){
    	
    	
    	try {
    		
       Thread.sleep(200);
        System.out.println("Welcome");
    	}
        catch(Exception e) {
        	System.out.println(e);
    	
        	
        	
        	
        	
        	
      	
    }
        
    	
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class exampleofthread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();

	}

}
