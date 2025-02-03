public class BankAccount{
    public static void main(String[] args){
        double bobbalance = 2175.37;
        bobbalance -= 302.50;
        bobbalance += 50.03;
        bobbalance /= 2.00;
        bobbalance += 20.00;
        bobbalance -= 1.00;
        bobbalance *= 2.00;
        bobbalance += 1.00;
        System.out.printf("Bob's new balance is: " + "%.2f", bobbalance); // %.2f is an identifier to format the balance
    }
}
