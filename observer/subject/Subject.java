package observer.subject;

import observer.observer.Observer;

public interface Subject {
	/**
	 * ��������������Ҫһ���۲�����Ϊ�������ù۲���������ע���ɾ���ġ�
	 */
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	/**
	 * ������״̬�ı�ʱ����������ᱻ���ã���֪ͨ���еĹ۲��ߡ�
	 */
	public void notifyObservers();
}
