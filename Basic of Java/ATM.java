//In the ATM program, the user has to select an option from the options displayed on the screen.
import java.util.*;
public class ATM_System 
{
        public static void main(String args[])
        {
            int balance = 1000000;
            Scanner sc = new Scanner(System.in);
            while(true)
            {
                System.out.println("ATM for you");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for Exit");
                System.out.print("Choose the operation you want to perform: ");


                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                            System.out.println("Enter money to be withdrawn:");
                            int withdraw = sc.nextInt();
                            if(balance>=withdraw)
                            {
                                balance = balance - withdraw;
                                System.out.println("Collect your Money:" + withdraw);
                            }
                            else
                            {
                                System.out.println("Insifficient Balance");
                            }
                            System.out.println("");
                            break;
                    case 2:
                            System.out.print("Enter money to be deposited:"); 
                            int deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.err.println("Your Money has been Deposited");
                            System.out.println("");
                            break;
                    case 3:
                            System.out.println("Balance: " + balance);
                            System.out.println("");
                            break;
                    case 4:
                            System.exit(0);
                            //The java.lang.System.exit() method exits current program by terminating running Java virtual machine
                }
            }  
        }
}

