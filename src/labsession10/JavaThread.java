package labsession10;

public class JavaThread extends Thread{
		public void start() {
			System.out.println("Hello, World!");
		}

	public static void main(String[] args) {
		JavaThread thread = new JavaThread();
		thread.start();

	}

}
