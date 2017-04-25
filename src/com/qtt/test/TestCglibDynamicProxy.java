package com.qtt.test;

import com.qtt.designpatterns.proxy.dynamicproxy.cglib.CglibDynamicProxy;
import com.qtt.designpatterns.proxy.dynamicproxy.cglib.CglibDynamicRealSubject;
import com.qtt.designpatterns.proxy.dynamicproxy.jdk.JdkDynamicRealSubject;

/**
 * ����ʹ��Cglibʵ�ֵĶ�̬����ģʽ
 * 
 * @author Administrator
 */
public class TestCglibDynamicProxy {
	public static void main(String[] args) {
		CglibDynamicProxy cglib=new CglibDynamicProxy();
		//ʹ��Cglib��̬����û��ʵ�ֽӿڵ�ί����
		CglibDynamicRealSubject cglibDynamicRealSubject=(CglibDynamicRealSubject) 
				cglib.getProxyInstance(new CglibDynamicRealSubject());
		cglibDynamicRealSubject.doSomething("������");
		//ʹ��Cglib��̬����ʵ�ֽӿڵ�ί����
		JdkDynamicRealSubject jdkDynamicRealSubject=(JdkDynamicRealSubject) 
				cglib.getProxyInstance(new JdkDynamicRealSubject());
		jdkDynamicRealSubject.doSomething("������");
	}
}
