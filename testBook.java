import lti.book.*;
import stock.lti.Holder;public class testBook {
	public static void main(String args[]) {
		Book alc = new Book("alchemist");
		Holder m1 = new Holder("abc");
		alc.issueBook(m1);
		
	}
}
