package singleton;


public class Singleton {
	public Singleton() {
		
	}
	/**
	 * 在静态初始化器（static initializen）中创建单例
	 * 这段代码保证了线程安全
	 */
	private static Singleton uniqueInstance = new Singleton();
	
	public static Singleton getInstance() {
		return uniqueInstance ;
	}
}
