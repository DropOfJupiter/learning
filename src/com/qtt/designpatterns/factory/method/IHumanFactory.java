package com.qtt.designpatterns.factory.method;

public abstract class IHumanFactory {
	// ��һ�ַ�ʽ��ʹ���߼��жϵķ�ʽʵ�ֵ�
	public abstract  Human createHuman(String type);

	// �ڶ���ʽ��ʹ��java�ķ���ʵ�ֵ�
	public abstract  Human createHuman(Class c);
}
