
public class SingletonDemo {

	public static void main(String[] args) {
		MyThread newThread = new MyThread();
		MyThread newThread1 = new MyThread();
		newThread.start();
		newThread1.start();
		MySingleton singleInstance = MySingleton.getInstance();
		
	}

}
