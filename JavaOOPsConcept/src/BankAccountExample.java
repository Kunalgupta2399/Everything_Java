public class BankAccountExample {
    int accNo;
    String name;
    float amount;

    public void insert(int ac, String n, float a) {
        accNo = ac;
        name = n;
        amount = a;
    }

    public void deposit(float a) {
        amount = amount + a;
        System.out.println(a + "deposited");
    }

    public void withdraw(float a) {
        if (amount < a) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - a;
            System.out.println(a + "Withdraw");
        }
    }

    public void balanceCheck() {
        System.out.println("Balance is" + amount);
    }

    public void print() {
        System.out.println(accNo + "" + name + "" + amount);
    }

    public static void main(String[] args) {
        BankAccountExample b1 = new BankAccountExample();
        b1.insert(2399 , "Kunal" , 98790);
        b1.print();
        b1.balanceCheck();
        b1.deposit(456);
        b1.print();
        b1.withdraw(9878);
        b1.balanceCheck();

    }
}
