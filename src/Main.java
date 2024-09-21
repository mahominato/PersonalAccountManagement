public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Cholpon");

        account.deposit(1000);
        account.withdraw(200);
        account.withdraw(500);  // This will print insufficient balance message
        account.printTransactionHistory();
        System.out.println("Current balance: " + account.getBalance());
    }
}
