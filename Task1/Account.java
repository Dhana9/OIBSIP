import java.util.Date;
import java.util.Scanner;

public class Account {
    private double balance;
    private Date dateCreated = new Date();

    String name;
    int accNum;
    String pwd;
    Scanner inp = new Scanner(System.in);
    public Account(double balance) {
        this.balance = balance;
        //dateCreated = new Date();
    }

    public void register() {
        System.out.print("enter your name : ");
        this.name = inp.nextLine();
        System.out.print("enter your Account Number : ");
        this.accNum = inp.nextInt();
        System.out.print("enter the password : ");
        this.pwd = inp.next();
    }

    public boolean Transaction(double transMoney) {
        if(balance >= transMoney) {
            balance = balance - transMoney;
            return true;
        }
        else
            return false;
    }
    String name1;
    int accNum1;
    String pwd1;

    public boolean login() {
        System.out.println("Please Login...");
        System.out.print("enter your name : ");
        this.name1 = inp.next();
        System.out.print("enter your Account Number : ");
        this.accNum1 = inp.nextInt();
        System.out.print("enter the password : ");
        this.pwd1 = inp.next();
        if(name.equals(name1) && accNum == accNum1 && pwd.equals(pwd1)) {
            return true;
        }
        else
            return false;
    }
    public boolean withdraw(double amount) {
        if(balance >= amount) {
            balance = balance-amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance = balance+amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
