package com.qtt.designpatterns.observer;
/**
 * 创建被观察者接口
 * @author Administrator
 *
 */
public interface WeatherSubject {
	//注册观察者
	void registerObserver(Observer o);
	//移出观察者
    void removeObserver(Observer o);
    //通知观察者
    void notifyObservers();
}
