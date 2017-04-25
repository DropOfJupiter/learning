package com.qtt.designpatterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������ ��ɫ3��������
 * 
 * @author Administrator
 *
 */
public class JdkDynamicProxy implements InvocationHandler {
	private Object jdkDynamicRealSubject;// ί����

	// ���췽����������Ҫ�������ʵ���󸳳�ֵ
	public JdkDynamicProxy(Object obj) {
		this.jdkDynamicRealSubject = obj;
	}

	/**
	 * Object proxy��ָ������Ķ���(ί����)
	 * Method method��������Ҫ���ñ���������ĳ��������Method���� Object[]
	 * args�����������ĳ����������ʱ����Ҫ�Ĳ���
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// �ڴ�����ʵ�������ǰ ���ǿ������һЩ�Լ��Ĳ���  
		System.out.println("jdkDynamicProxy start to work");
		method.invoke(jdkDynamicRealSubject, args);// �ڲ�������ʵ������ķ���
		 // �ڴ�����ʵ��������� ����Ҳ�������һЩ�Լ��Ĳ���
		System.out.println("jdkDynamicProxy stop working");
		return null;
	}

}
