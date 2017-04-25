package com.qtt.designpatterns.proxy.staticproxy;
/**
 * ��̬������ ��ɫ3��������
 * @author Administrator
 *
 */
public class Proxy implements Subject {
	
	private RealSubject realSubject;//������ʵ������
	
	public Proxy(RealSubject realSubject) {
		super();
		this.realSubject = realSubject;
	}

	public void doSomething() {
		System.out.println("proxy start to work");
		realSubject.doSomething();//�ڲ�������ʵ������ķ���
		System.out.println("proxy stop working");
	}

}
