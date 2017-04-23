package com.qtt.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站实现被观察者接口
 * @author Administrator
 *
 */
public class ConcreteWeatherSubject implements WeatherSubject {
	// 气象信息
    private String weatherContent;
    // 观察者列表
    private List<Observer> observers=new ArrayList<Observer>();
    public String getWeatherContent() {
		return weatherContent;
	}
	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//说明天气内容更新了，通知所有观察者
		notifyObservers();
	}
	/**
     * 注册观察者
     */
	public synchronized void registerObserver(Observer o) {
		if(o==null){
			 throw new NullPointerException();
		}
		if(!observers.contains(o)){
			observers.add(o);
		}
	}
	/**
	 * 删除观察者
	 */
	public synchronized void removeObserver(Observer o) {
		if(o==null){
			 throw new NullPointerException();
		}
		if(observers.indexOf(o)>0){
			observers.remove(o);
		}

	}
	/**
	 * 通知所有观察者,遍历本地的观察者列表，执行它们的update方法
	 */
	public void notifyObservers() {
        for(Observer o: observers){
        	//拉模型
            //o.update(this);
            //推模型
            o.update(weatherContent);
        
        }
	}
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
