
class Account {
    private int acc_id;
    private String name;
    private double balance;
    
    public void setName(String name){
        this.name = name;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}


public class main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAcc_id(1);
        a1.setName("Peter Belish");
        a1.setBalance(1000000);

        System.out.println("This account is of "+a1.getName()+"\nAccount number is "+a1.getAcc_id()+" \nBalance is "+a1.getBalance());
    }
}
