package singleton;


public class Singleton {
	public Singleton() {
		
	}
	/**
	 * �ھ�̬��ʼ������static initializen���д�������
	 * ��δ��뱣֤���̰߳�ȫ
	 */
	private static Singleton uniqueInstance = new Singleton();
	
	public static Singleton getInstance() {
		return uniqueInstance ;
	}
}
