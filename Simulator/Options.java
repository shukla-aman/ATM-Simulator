package Simulator;

import java.util.Scanner;

public class Options extends Accounts{
	public int optionMenu(){
		int i=1;
		do{
		System.out.println("\n \t"+"Welcome to Option Menu Of this ATM Simulator"+"\n");
		System.out.println("\n \t"+"1:   Balance Enquiry"+"\n");
		System.out.println("\n \t"+"2:   Cash Deposit"+"\n");
		System.out.println("\n \t"+"3:   Cash Withdrawal"+"\n");
		System.out.println("\n \t"+"4:   Change Pin"+"\n");
		System.out.println("\n \t"+"5:   Accounts Details"+"\n");
		System.out.println("\n \t"+"6:   Exit"+"\n");
		System.out.println("Enter Your choice");
		Scanner scan=new Scanner(System.in);
		int ch=scan.nextInt();
		switch(ch){
		case 1:
			bal_Enquiry();
			break;	
		case 2:
			csh_Deposit();
			break;
		case 3:
			csh_Withdrawl();
			break;
		case 4:
			chng_Pin();
			break;
		case 5:
			acc_Details();
			break;
		case 6:
			System.out.println("Thankyou");
			return 0;
		default:
			System.out.println("\n"+"Invalid Input \n Please Enter Correct option");
		}
		i++;
		}while(i<6);
		return 0;
	}
}