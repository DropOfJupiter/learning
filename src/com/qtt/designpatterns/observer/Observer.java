package com.qtt.designpatterns.observer;
/**
 * �۲��߽ӿ�
 * @author Administrator
 *
 */
public interface Observer {
	/**
	 * ��Ŀ�������Ϊupdate�����Ĳ��������ǵ��͵ġ���ģ�͡�
	 * @param weatherSubject
	 */
	void update(ConcreteWeatherSubject weatherSubject);
	/**
	 * ��Ŀ����������������Ϊupdate�����Ĳ��������ǵ��͵ġ���ģ�͡�
	 * @param weatherSubject
	 */
	void update(String  weatherContent);
}
