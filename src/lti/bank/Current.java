package lti.bank;

public class Current extends Account {
	protected double overDraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.od = OVERDRAFT_AMT;
		ctxns = new CurrentTransaction[10];
		ctxns[cidx++] = new CurrentTransaction("OB", balance, balance, od);
	}

	public void withdraw(double amount) {

		if (amount <= balance) {
			balance -= amount;
			System.out.println("Balance" + balance);
		} else if (amount <= od) {
			od -= (amount - balance);
			balance = 0;
		} else
			System.out.println("insufficient funds");
		ctxns[idx++] = new CurrentTransaction("Debit", amount, balance, od);
	}

	@Override
	public void summary() {
		super.summary();
	}

	@Override
	public void statement() {
		System.out.println("Statement of account of:" + getAcntNo());
		for (int i = 0; i < idx; i++) {
			System.out.println(ctxns[i]);
		}
	}

	public void deposit(double amount) {
		if (od < OVERDRAFT_AMT) {
			od = od + amount;
			if (od > OVERDRAFT_AMT) {
				balance = balance + (od - OVERDRAFT_AMT);
				od = od - (od - OVERDRAFT_AMT);
			} else
				balance += amount;
		}
		ctxns[idx++] = new CurrentTransaction("Credit", amount, balance, od);
	}
}
