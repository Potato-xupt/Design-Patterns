package singleton.lazy.safe.syn;

public class Singleton {
	public Singleton() {
		
	}
	
	private static Singleton uniqueInstance ;
	
	private static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance ;
	}
}
