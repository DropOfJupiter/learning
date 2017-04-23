package com.qtt.designpatterns.observer;

//import java.util.Observable;
import com.qtt.designpatterns.observer.Observer;

/**
 * ����ͳ��ʵ�ֹ۲��߽ӿ�
 * 
 * @author Administrator
 *
 */
public class ConcreteWeatherObserver implements Observer {
	// ������Ϣ �ӱ��۲����л�ȡ
	private String weatherContent;
	//�۲�������
	private String observerName;
	//�۲��߲�������
	private String observerOperation;
	
	public ConcreteWeatherObserver(String observerName, String observerOperation) {
		super();
		this.observerName = observerName;
		this.observerOperation = observerOperation;
	}
	/**
	 * ��Ŀ�������Ϊupdate�����Ĳ��������ǵ��͵ġ���ģ�͡�
	 */
	public void update(ConcreteWeatherSubject weatherSubject) {
		weatherContent=weatherSubject.getWeatherContent();
		System.out.println(observerName+"�յ���"+weatherContent+","+observerOperation);
	}
	/**
	 * ��Ŀ����������������Ϊupdate�����Ĳ��������ǵ��͵ġ���ģ�͡�
	 */
	public void update(String content) {
		weatherContent=content;
		System.out.println(observerName+"�յ���"+weatherContent+","+observerOperation);
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
