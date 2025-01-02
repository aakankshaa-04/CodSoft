package Com.Codesoft.Task3;

import java.util.Scanner;

class Bank{
	String accnumber;
	String name;
	double balance;
	public Bank(String accnumber,String name, double balance) {
		this.accnumber = accnumber;
		this.name=name;
		this.balance = balance;
	}
	public void withdraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance-=amt;
			System.out.println("$"+amt+" is withdraw sucessfully.");
		}else if(amt<=0) {
			System.out.println("Amount must be greater than zero.");
		}else {
			System.out.println("Insufficient balance.");
		}
	}
	public void deposite(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("$"+amt+" is deposited sucessful");
		}else {
			System.out.println("Invalid amount");
		}
	}
	public void checkBalance() {
		System.out.println("Account Number:"+accnumber);
		System.out.println("Holder Name:"+name);
		System.out.println("current balance="+balance);
	}
}
public class ATM {

	public static void main(String[] args) {
		Bank b=new Bank("AC123","Akanksha", 10000);
		Scanner sc=new Scanner(System.in);
		int choice=0;
        while(choice!=4) {
        	System.out.println("\n*******************ATM Management***************");
            System.out.println("\t\t1. Check Balance");
            System.out.println("\t\t2. Deposit Amount");
            System.out.println("\t\t3. Withdraw Amount");
            System.out.println("\t\t4. Exit");
            System.out.println("Enter choice:");
            choice=sc.nextInt();
            switch(choice) {
            case 1:
            {
            	b.checkBalance();
            }
            break;
            case 2:
            {
            	System.out.println("Enter amount you want to desposit:");
            	double amt=sc.nextDouble();
            	b.deposite(amt);
            }
            break;
            case 3:
            {
            	System.out.println("Enter amount you want to wthdraw:");
            	double amt=sc.nextDouble();
            	b.withdraw(amt);
            }
            break;
            case 4:
            {
            	System.out.println("Thank you...");
            }
            break;
            default:
            {
            	System.out.println("Invalid choice");
            }
            break;
            }
        }
	}

}
