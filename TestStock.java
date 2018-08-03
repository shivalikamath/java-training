import stock.lti.Broker;
import stock.lti.Holder;
import stock.lti.StockSingleton;

public class TestStock {
	public static void main(String[] args) {
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		Broker b = StockSingleton.getStock();
		b.getQuote();
		b.viewQuote();
		System.out.println(h == b);
	}
}
