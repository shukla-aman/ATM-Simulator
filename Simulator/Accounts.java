package Simulator;

import java.util.Scanner;

public class Accounts{
	private double amount=000,cash;
	public void details(){
		String IFSC="SBI00ALLD";
		String acc_No="875021362105";
		String acc_Name="Bhanu Pratap Rai";
		System.out.println("Name-"+acc_Name+"\n"+"Account No."+acc_No+"\n"+"IFSC Code"+IFSC);
	}
	public void bal_Enquiry(){
		System.out.println("Rupees "+amount);
	}
	public void csh_Deposit(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Amount \n You want to Deposit");
		cash=scan.nextDouble();
		amount+=cash; 
		bal_Enquiry();
	}
	public void csh_Withdrawl(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Amount \n You want to Withdraw");
		cash=scan.nextDouble();
		amount-=cash; 
		bal_Enquiry();
	}
	public void acc_Details(){
		details();
		bal_Enquiry();
	}
	public void chng_Pin(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter New Pin");
		int nwpin=scan.nextInt();
		System.out.println("Pin Changed successfully");
	}

}