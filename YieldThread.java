
public class YieldThread extends Thread {

	static class HelloThread extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.println("hello");
				yield();
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//				}

			}
		}
	}

	static class WorldThread extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.println("world");
			yield();
				//try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//				}

			}
		}
	}

	public static void main(String[] args) {
		HelloThread hello = new HelloThread();
		WorldThread world = new WorldThread();

		hello.start();
		world.start();
	}
}
