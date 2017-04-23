package com.qtt.designpatterns.observer;
/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface Observer {
	void update(String temperature,String humidity,String pressure);
}
