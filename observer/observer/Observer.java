package observer.observer;

public interface Observer {
	/**
	 * 所有的观察者都必须是实现update()方法，以实现观察者接口。
	 * 
	 * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者。
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temperature, float humidity, float pressure);
}
