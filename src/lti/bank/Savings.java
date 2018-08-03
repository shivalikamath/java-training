package lti.bank;

public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	public void withdraw(double amount) {
		txns[idx++] = new Transaction("Debit", balance, balance);
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			System.out.println("Balance" + balance);
		} else
			System.out.println("insufficient funds");
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transaction("Credit", amount, balance);
		System.out.println("balance after deposit" + balance);
	}

}
