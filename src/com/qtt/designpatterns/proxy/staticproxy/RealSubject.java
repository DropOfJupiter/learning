package com.qtt.designpatterns.proxy.staticproxy;
/**
 * ��̬������ ��ɫ2��ί���ࣨ��ʵ�����࣬ʵ��Subject�ӿڣ�
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	public void doSomething() {
		System.out.println("this is realSubject's method called doSomething");
	}

}
