package pri;

public class abstrctexample {
	
	abstract class pen {
	abstract	void write();
	abstract	void refill();
		
	}
	
	class Fountainpen extends pen {
		void write() {
			System.out.println("write using the pen");
		}
		void refill() {
			System.out.println("refill using the pen");}
			void changenib() {
				System.out.println("changenib");
			
		}
	} 
	class Monkey {
		void jump() {
			System.out.println("jump..");
			
		}
		void bite() {
			System.out.println("bite..");
			
		}
			
		}
		
 
	
		 class Human extends Monkey implements Basicanimals {
			 void speak() {
				 System.out.println("hello sir..");
			 }
			 public void sleep() {
				 System.out.println("sleep..");
				 
			 }
			 public void eat() {
				 System.out.println("eat..");
				 
			 }
			 
		 
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
