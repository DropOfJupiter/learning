package com.qtt.designpatterns.observer;
/**
 * �������۲��߽ӿ�
 * @author Administrator
 *
 */
public interface WeatherSubject {
	//ע��۲���
	void registerObserver(Observer o);
	//�Ƴ��۲���
    void removeObserver(Observer o);
    //֪ͨ�۲���
    void notifyObservers();
}
