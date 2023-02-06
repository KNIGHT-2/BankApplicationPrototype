package bank;

public class Account {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public Account() {}

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {return accountNumber;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {return firstName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {return lastName;}

    public void depositMoney(double balance) {
        this.balance += balance;
    }
    public void withdrawMoney(double balance) {
        this.balance -= balance;
    }
    public String getBalance() {return String.format("%.2f", balance);}

	/*public String showAccountInformations() {
		return "Nome: " + firstName + " " + lastName
				+ "\nNúmero da conta: " + accountNumber
				+ "\nSaldo: " + String.format("%.2f", balance) + " R$";
	}*/

    @Override
    public String toString() {
        return 	  "Número da conta: " + accountNumber
                + "\nNome: " + firstName + " " + lastName
                + "\nSaldo: " + String.format("%.2f", balance)
                + "\n";
    }

}