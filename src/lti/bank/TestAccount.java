package lti.bank;

public class TestAccount {
	public static void main(String[] args) {

		Bank s = AccountFactory.openAccount("current", "Polo");
		s.summary();
		s.deposit(2000);
		s.deposit(4000);
		s.withdraw(7000);
		s.withdraw(7000);
		s.statement();
	}

}
