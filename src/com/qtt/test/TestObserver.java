package com.qtt.test;

import com.qtt.designpatterns.observer.ConcreteWeatherObserver;
import com.qtt.designpatterns.observer.ConcreteWeatherSubject;

/**
 * ���Թ۲���ģʽ
 * 
 * @author Administrator
 *
 */
public class TestObserver {

	public static void main(String[] args) {
		//1.�������۲���
		ConcreteWeatherSubject weatherSubject=new ConcreteWeatherSubject();
		//2.�����۲���
		ConcreteWeatherObserver observerGirl=new ConcreteWeatherObserver("Ů����", "�����ǵĵ�һ��Լ�ᣬ�ص���Ĺ�԰��������ɢŶ");
		ConcreteWeatherObserver observerMum=new ConcreteWeatherObserver("����", "�Ǹ�����ĺ����ӣ��ʺ�ȥ���");
		//3.ע�ᵽ���۲�����
		weatherSubject.registerObserver(observerGirl);
		weatherSubject.registerObserver(observerMum);
		//4.���۲��߸���
		weatherSubject.setWeatherContent("������4��24�գ��������ʣ�������ƣ�����28��");
	}
}
