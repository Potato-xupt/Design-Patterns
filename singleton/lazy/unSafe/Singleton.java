package singleton.lazy.unSafe;

public class Singleton {
	private Singleton() {
		
	}
	private static Singleton uniqueInstance;
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
