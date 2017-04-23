package com.qtt.designpatterns.observer;

//import java.util.Observable;
import com.qtt.designpatterns.observer.Observer;

/**
 * 气象统计实现观察者接口
 * 
 * @author Administrator
 *
 */
public class ConcreteWeatherObserver implements Observer {
	// 气象信息 从被观察者中获取
	private String weatherContent;
	//观察者名称
	private String observerName;
	//观察者操作内容
	private String observerOperation;
	
	public ConcreteWeatherObserver(String observerName, String observerOperation) {
		super();
		this.observerName = observerName;
		this.observerOperation = observerOperation;
	}
	/**
	 * 将目标对象作为update方法的参数，这是典型的“拉模型”
	 */
	public void update(ConcreteWeatherSubject weatherSubject) {
		weatherContent=weatherSubject.getWeatherContent();
		System.out.println(observerName+"收到了"+weatherContent+","+observerOperation);
	}
	/**
	 * 将目标对象的天气内容作为update方法的参数，这是典型的“推模型”
	 */
	public void update(String content) {
		weatherContent=content;
		System.out.println(observerName+"收到了"+weatherContent+","+observerOperation);
	}
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getObserverOperation() {
		return observerOperation;
	}

	public void setObserverOperation(String observerOperation) {
		this.observerOperation = observerOperation;
	}



	
}
