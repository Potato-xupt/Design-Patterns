package singleton.lazy.safe.doubleCheck;

public class Singleton {
	public Singleton() {
		
	}
	
	private static volatile Singleton uniqueInstance;
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized(Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
