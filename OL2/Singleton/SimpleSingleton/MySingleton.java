
public class MySingleton {
	static MySingleton instance=new MySingleton();
	private MySingleton() {
		System.out.println("I am the only instance\n\n\n");
	}
	
	public static MySingleton getInstance() {
		if(instance==null) {
			synchronized(MySingleton.class) {
				if(instance == null) {
					instance = new MySingleton();
					System.out.println("New instance created:"+instance);
				}
			}
			
		}
			
		else System.out.println("returning the same instance:"+instance);
		return instance;
	}

}
