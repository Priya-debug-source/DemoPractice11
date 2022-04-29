package pri;

public class tvexample {
	
	interface tvremote{
		
	void remote();
	
		
	}
	
	interface smarttvremote {
		void smartremote();
	}
	
	class tv implements tvremote, smarttvremote{

		@Override
		public void remote() {
			System.out.println("hello i am remote");
			
		}
		@Override 
		public void smartremote(){
			System.out.println("hello i am a smart remotr");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
