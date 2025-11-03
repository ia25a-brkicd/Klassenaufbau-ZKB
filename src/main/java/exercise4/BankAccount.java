package exercise4;

public class BankAccount {

  private String name;
  private String surname;
  private int accountNumber;
  double balance;
  private int limit;

  public BankAccount(String name, String surname, int accountNumber, double balance, int limit) {
      this.name = name;
      this.surname = surname;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.limit = limit;
  }

  public void withdraw(double withdrawAmount) {
      if (withdrawAmount > balance || withdrawAmount > limit) {
          System.out.println("Insufficient funds!");
      }
      else{
          balance -= withdrawAmount;
      }
  }

  public void printBalance() {
    System.out.println(balance);
  }

  public String toString() {
      return name + ", " + surname + ", " + accountNumber + ", " + balance +  ", " + limit;
  }

  public void deposit(int i) {
      balance += i;
  }
}
