package com.qtt.designpatterns.singleton;

/**
 * ��������ģʽ �������ʱ���ʹ���ʵ�������������ٶ�����������ʱ��ȡ������ٶȿ�
 * 
 * @author Administrator
 *
 */
public class EagerSingleton {
	// ��̬˽�г�Ա���ѳ�ʼ��
	private static EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {
		// ˽�й��췽��,�����ⲿ����ʵ��
	}

	// ��̬������ͬ���������ʱ�ѳ�ʼ���������ж��̵߳����⣩
	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}

}
