package com.qtt.designpatterns.proxy.dynamicproxy.jdk;

/**
 * ��JDKʵ�ֵĶ�̬����ģʽ ��ɫ2��ί���ࣨ��ʵ�����࣬ʵ��JdkDynamicSubject�ӿڣ�
 * 
 * @author Administrator
 *
 */
public class JdkDynamicRealSubject implements JdkDynamicSubject {

	public void doSomething(String name) {
		System.out.println("hello "+name+",this is realSubject's method called doSomething by JDK dynamic");
	}

}
