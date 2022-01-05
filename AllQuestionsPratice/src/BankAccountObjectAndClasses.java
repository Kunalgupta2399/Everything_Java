import java.util.Scanner;

public class BankAccountObjectAndClasses {
    // account - name, address, number, amount
    // withdraw, deposit
    // FD - 6%
    // 2 account - account details
    private String name;
    private String address;
    private int accountNumber;
    private int balance;

    public void FD(float FixedDeposit){
        float newBalance = this.balance -FixedDeposit;
        if (newBalance <= 10000){
            System.out.println("Insufficient Money");
        }else {
            System.out.println("Your FD is " + FixedDeposit * 1.06 + " for 12 months 1 day");
            this.balance = (int) newBalance;
        }
    }
    public void withdraw(float amount){
        float newBalance = this.balance - amount;
        if (newBalance >= 10000){
            this.balance = (int) newBalance;
        }else{
            System.out.println("Cannot Withdraw");
        }
    }

    public void deposit(float amount){
        float balance= this.balance + amount;
        System.out.println(balance);
    }

    public void set(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter your address");
        address = scanner.nextLine();
        System.out.println("Enter your Account Number");
        accountNumber = scanner.nextInt();
        System.out.println("Enter your amount");
        balance = scanner.nextInt();
    }

    public void showDetails(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.accountNumber);
        System.out.println(this.balance);
    }

    public class Main{
        public static void main(String[] args) {
            BankAccountObjectAndClasses b1 = new BankAccountObjectAndClasses();
            b1.set();
            b1.showDetails();
            b1.deposit(500);
            b1.showDetails();
            b1.withdraw(900);
            b1.showDetails();
            b1.FD(5000);
            b1.showDetails();
        }
    }
}

