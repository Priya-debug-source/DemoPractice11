package pri;

import java.util.Random;
import java.util.Scanner;

public class rockpapersgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For user: enter 0: rock, enetr 1: paper enetr 2: scissors :");

		Scanner sc = new Scanner(System.in);
		int userinput=sc.nextInt();
				
		
				
		Random r1= new Random();
		System.out.println("For Computer:  enter 0: rock, enetr 1: paper enetr 2: scissors :");
		int computerinput= r1.nextInt(3);
		
		System.out.println(computerinput);
		
		if(userinput==computerinput){
			System.out.println("draw");
		}else if((userinput==0 && computerinput==1)||(userinput==2 && computerinput==0)){
			System.out.println("computer Win!!!!!");
		}else {
			System.out.println("you Win!!!!!");
		}
	}

}
