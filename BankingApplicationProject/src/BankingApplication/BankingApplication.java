
package BankingApplication;
import java.util.Scanner;

class BankService{
	int balance;
    int withdraw;
	int previousTransition;
	String customername;
	String customerID;
	
	BankService(String customer_name,String customer_id){
		customername = customer_name;
		customerID = customer_id;
	}
	
	void deposit(int amount1) {
		if(amount1 != 0) {
			balance = balance + amount1;
			System.out.println("Your "+amount1+" is deposited successfully");
			previousTransition = amount1;
		}
	}
	void withdraw(int amount2) {
		if(amount2 <= balance) {
			balance = balance - amount2;
			System.out.println("Your "+amount2+" is withdraw successfully");
			previousTransition = -amount2;
		} else {
			System.out.println("Sorry ! Insufficient funds");
		}
	}
	void previousTransition() {
		if(previousTransition > 0) {
			System.out.println("Deposited = "+previousTransition);
		}
		else if(previousTransition < 0) {
			System.out.println("Withdraw = "+Math.abs(previousTransition));
		}
		else {
			System.out.println("No Transition occurred");
		}
	}
	void showmenu() {
		
		Scanner s = new Scanner(System.in);
		int option;
		System.out.println("Welcome "+ customername + " to our bank");
		System.out.println("Your ID is "+customerID);
		System.out.println("\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Previous Transition");
		System.out.println("5. Exit");
		
		
		do {
			
			System.out.println("===========================================================================================================================================================================================================================================");
			System.out.println("Enter an option");
		    option = s.nextInt();
			System.out.println("\n");
			
			switch(option) {
			case 1 :
				System.out.println("Your balance is "+balance);
				System.out.println("\n");
				break;
			case 2 :
				System.out.println("Enter an amount to deposit : ");
				int amount1 = s.nextInt();
				deposit(amount1);
				System.out.println("\n");
				break;
			case 3 :
				System.out.println("Enter an amount to withdraw : ");
				int amount2 = s.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 4 :
				previousTransition();
				System.out.println("\n");
				break;
			case 5:
				System.out.println("Thank You");
				
				default:
					System.out.println("Invalid option!!.Please try again later");
					break;
			} 
		} while(option != 5);
		System.out.println("ThankYou for using services");
	}
}
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankService obj = new  BankService("Anusha","CBIN0045600");
		obj.showmenu();
	
	}

}
