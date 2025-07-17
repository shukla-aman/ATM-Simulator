package Simulator;

import java.util.Scanner;

public class Login extends Options{
	private void getLogin(){
		int user1=136381870,user2=645021434,user3=969535248;
		int pwd1=7232,pwd2=9695,pwd3,ch=1,i;
		System.out.println("\n \t"+"Welcome to ATM Simulator"+"\n");
		for(i=1;i<=5;i++){
		System.out.println("Enter Your User ID");
		Scanner scan=new Scanner(System.in);
		int usr=scan.nextInt();
		if(usr==user1){
		while(ch<=5){
		System.out.println("Enter Your pin");
		int pin=scan.nextInt();
		if(pin==pwd1){
			 optionMenu();
			break;
		}
		else{
			System.out.println("Pls Enter the Correct Pin");
			ch++;
		}
		if(ch>5){
		System.out.println("Invalid Pin"+"\n"+"Try after sometime :):)");
		}
		}
		break;
		}
		else if(usr==user2){
		while(ch<=5){
		System.out.println("Enter Your pin");
		int pin=scan.nextInt();
		if(pin==pwd2){
			 optionMenu();
			break;
		}
		else{
			System.out.println("Pls Enter the Correct Pin");
			ch++;
		}
		if(ch>5){
		System.out.println("Invalid Pin"+"\n"+"Try after sometime :):)");
		}	
		}
		break;
		}	 
		else if(usr==user3){
		System.out.println("Generate Your Pin");
		pwd3=scan.nextInt();
		break;
		}	
		else{
		if(i<5)
		System.out.println("Invalid User ID"+"\n"+"Pls Enter correct User ID");	
		}
		}
		if(i>5)
			System.out.println("Too many Attempt \n Try after sometime :):)");
	}
	public void stimulate(){
		getLogin();
	}
}
		