package com.qtt.designpatterns.observer;
/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface Observer {
	/**
	 * 将目标对象作为update方法的参数，这是典型的“拉模型”
	 * @param weatherSubject
	 */
	void update(ConcreteWeatherSubject weatherSubject);
	/**
	 * 将目标对象的天气内容作为update方法的参数，这是典型的“推模型”
	 * @param weatherSubject
	 */
	void update(String  weatherContent);
}
