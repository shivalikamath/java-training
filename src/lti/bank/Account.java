package lti.bank;

public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	protected double od;
	private static int autogen = INIT_ACNT_NO;

	protected Transaction[] txns;
	protected CurrentTransaction[] ctxns;
	protected int idx, cidx;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.setAcntNo(autogen++);
		this.holder = holder;
		this.balance = balance;
		// instantiating Transaction array for the account
		txns = new Transaction[10];
		// adding opening account transaction
		txns[idx++] = new Transaction("OB", balance, balance);
	}

	public void summary() {
		System.out.println("A/C no:" + getAcntNo());
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void statement() {
		System.out.println("Statement of account of:" + getAcntNo());
		for (int i = 0; i < idx; i++) {
			System.out.println(txns[i]);
		}
	}

	public int getAcntNo() {
		return acntNo;
	}

	public void setAcntNo(int acntNo) {
		this.acntNo = acntNo;
	}
}
