package Inheritance_example_two;

 /*
 This Coding demo shows us the uses of  Inheritance+ Super keyword
 */

class Account{
    // creating private String,Long field
    private String name;
    private long amount;

    // constructors
    public Account(String name, long amount){
        this.name = name;
        this.amount = amount;
    }

    //getMethod for name
    public String getName() {
        return name;
    }

    //void method
    public void deposit(long amount){
        this.amount = this.amount+amount;
    }

    //getAmount method for amount
    public long getAmount(){
        return amount;
    }

    // SetAmount method for amount
    public void setAmount(long amount) {
        this.amount = amount;
    }


}
//Inheriting from previous class
class SavingAccount extends Account {

    //child class constructors
    SavingAccount(String name, long amount){
        super(name,amount);  //super keyword

          /*
            The super keyword refers to superclass (parent) objects.
            It is used to call superclass methods, and to access the superclass constructor.
         */

    }
}

public class TestAccount {

    public static void main(String[] args) {
        SavingAccount sc=new SavingAccount("Abir",12000);
        sc.deposit(12000);
        System.out.println(sc.getAmount());

    }
}
