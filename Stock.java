package stock.lti;

public class Stock implements Exchange {

	@Override
	public void getQuote() {
		System.out.println("getting stock quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("viewing stock quote");
	}

	@Override
	public void setQuote() {
		System.out.println("setting stock quote");
	}

}
