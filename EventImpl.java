
public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("1st event implementation");
	}

	public static class InnerEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("2nd event implementation");
		}

	}

	public void doingSomething() {
		class InnerMostImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("3rd event implementation");
			}

		}
		;
		new InnerMostImpl().doSomething();
	}

	public void doingSomethingAgain() {
		Event e=new Event() {

			@Override
			public void doSomething() {
				System.out.println("4th event implementation");
			}

		};
		e.doSomething();

	}
	public void doingSomethingOneLastTime() {
		Event e=()->System.out.println("5th event implementation");
		e.doSomething();
	}
	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		impl.doSomething();

		InnerEventImpl innerImpl = new EventImpl.InnerEventImpl();
		// InnerEventImpl innerImpl = impl.new InnerEventImpl(); For nonstatic inner
		// class

		innerImpl.doSomething();
		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();
	}
}
