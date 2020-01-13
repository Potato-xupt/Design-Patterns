package observer.observer;

public interface Observer {
	/**
	 * ���еĹ۲��߶�������ʵ��update()��������ʵ�ֹ۲��߽ӿڡ�
	 * 
	 * ������۲�ֵ�ı�ʱ����������Щ״ֵ̬���������Ĳ��������͸��۲��ߡ�
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temperature, float humidity, float pressure);
}
