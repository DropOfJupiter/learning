package com.qtt.designpatterns.proxy.dynamicproxy.cglib;

/**
 * ��cglibʵ�ֵĶ�̬����ģʽ ��ɫ1��ί���ࣨû��ʵ�����κνӿڣ�
 * 
 * @author Administrator
 *
 */
public class CglibDynamicRealSubject{

	public void doSomething(String name) {
		System.out.println("hello "+name+","
				+ "this is realSubject's method called doSomething by Cglib dynamic");
	}

}
