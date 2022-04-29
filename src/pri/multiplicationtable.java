package pri;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number to get the multiplicationtable for it: ");
		Scanner sc =new Scanner(System.in);
		int userinput= sc.nextInt();
		

		for(int i=1;i<=10;i++) {
			
		 int m1=(userinput*i);
		 System.out.printf("  %d * %d = %d \n ",userinput ,i ,m1);
		}

		
	
		

	}

}
