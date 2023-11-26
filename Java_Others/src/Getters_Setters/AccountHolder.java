package Getters_Setters;

public class AccountHolder {
    public static void main(String[] args) {

        Bank b = new Bank();
        int min = b.getMinBalance();
        System.out.println(min);

        b.setMinBalance(1000);
        min = b.getMinBalance();
        System.out.println(min);
    }
}
