package com.qtt.test;

import com.qtt.designpatterns.observer.ConcreteWeatherObserver;
import com.qtt.designpatterns.observer.ConcreteWeatherSubject;

/**
 * 测试观察者模式
 * 
 * @author Administrator
 *
 */
public class TestObserver {

	public static void main(String[] args) {
		//1.创建被观察者
		ConcreteWeatherSubject weatherSubject=new ConcreteWeatherSubject();
		//2.创建观察者
		ConcreteWeatherObserver observerGirl=new ConcreteWeatherObserver("女朋友", "是我们的第一次约会，地点街心公园，不见不散哦");
		ConcreteWeatherObserver observerMum=new ConcreteWeatherObserver("老妈", "是个购物的好日子，适合去逛街");
		//3.注册到被观察者中
		weatherSubject.registerObserver(observerGirl);
		weatherSubject.registerObserver(observerMum);
		//4.被观察者更新
		weatherSubject.setWeatherContent("明天是4月24日，天气晴朗，蓝天白云，气温28度");
	}
}
