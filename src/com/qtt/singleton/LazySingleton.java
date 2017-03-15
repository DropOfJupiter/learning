package com.qtt.singleton;
/**
 * ��������ģʽ
 * �Ƚ������������ʱ��������ʵ�������������ٶȿ죬������ʱ��ȡ������ٶ���
 * ����ģʽ���ӳټ��ص�ʵ������Զ��̷߳���ʱ����Ҫ����ͬ������飬Ϊ������Ч�ʣ���Ҫʹ��˫���ж�
 * @author Administrator
 *
 */
public class LazySingleton {
	private static LazySingleton lazySingleton= null;//��̬˽�ó�Ա��û�г�ʼ��

	private LazySingleton() {
		//˽�й��췽��,�����ⲿ����ʵ��
	}

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			synchronized(LazySingleton.class){
				if (lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
