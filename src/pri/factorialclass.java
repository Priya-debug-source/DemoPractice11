package pri;

import java.util.Scanner;

public class factorialclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number : ");
		Scanner sc=  new Scanner(System.in);
		int fact =sc.nextInt();
		int i=1;
		while(i<fact) {
		fact=fact*i;
			i++;
	
		System.out.println(fact);
		
		}

	}

}
