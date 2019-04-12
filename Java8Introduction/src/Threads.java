public class Threads {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Threading th = new Threading(i);
			th.start();
		}

	}

}

class Threading extends Thread {

	private int threadId;

	public Threading(int threadId) {
		this.threadId = threadId;
	}

	public void run() {

		int avg = 2;

		for (int i = 0; i < 10; i++) {
			avg = avg + i;
			System.out.println("From thread " + threadId
					+ " the calculation is " + avg);
		}

	}
}
