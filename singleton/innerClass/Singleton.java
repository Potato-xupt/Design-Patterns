package singleton.innerClass;

public class Singleton {
	public Singleton() {
		
	}
	private static class SingletonHolder {
		private static final Singleton uniqueInstance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.uniqueInstance;
	}
}
