import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account testAccount = new Account(50000);
        System.out.println("Welcome!!!Good to See You");
        System.out.print("1.Register\n2.Exit\n");
        System.out.print("enter your choice : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                testAccount.register();
                System.out.print("Do you want to login (yes/no) ?");
                String op = input.next();
                if (op.equals("yes")) {
                    if (testAccount.login())
                        System.out.println("Login Successful");
                    else {
                        System.out.println("Login not Successful...Due to Invalid Credentials");
                        return;
                    }
                }
                else {
                    return;
                }
                while (true) {
                    System.out.print("1.Withdraw\n2.Deposit\n3.Transactioon\n4.checkBalance\n5.Exit\n");
                    System.out.print("enter your choice : ");
                    int choice1 = input.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.print("enter the amount you want to withdraw : ");
                            double amount1 = input.nextDouble();

                            if (testAccount.withdraw(amount1))
                                System.out.println("Withdraw was Successful");
                            else
                                System.out.println("Withdraw was not Successful");
                            break;
                        case 2:
                            System.out.print("enter the amount you want to deposit : ");
                            double amount2 = input.nextDouble();
                            testAccount.deposit(amount2);
                            break;
                        case 3 :
                            System.out.print("enter the name of the Beneficiary : ");
                            String benName = input.next();
                            System.out.print("enter the amount you want to Transfer : ");
                            double transMoney = input.nextDouble();
                            if(testAccount.Transaction(transMoney)) {
                                System.out.println(transMoney+" has been transferred to "+benName);
                            }
                            else {
                                System.out.println("Sorry!!!You have no enough Balance");
                            }
                            break;
                        case 4:
                            System.out.println("Current Balance is " + testAccount.getBalance());
                            break;
                        case 5:
                            return;
                    }
                }
            case 2 :
                return;
        }
    }
}