package com.qtt.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ����վʵ�ֱ��۲��߽ӿ�
 * @author Administrator
 *
 */
public class ConcreteWeatherSubject implements WeatherSubject {
	// ������Ϣ
    private String weatherContent;
    // �۲����б�
    private List<Observer> observers=new ArrayList<Observer>();
    public String getWeatherContent() {
		return weatherContent;
	}
	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//˵���������ݸ����ˣ�֪ͨ���й۲���
		notifyObservers();
	}
	/**
     * ע��۲���
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
	 * ɾ���۲���
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
	 * ֪ͨ���й۲���,�������صĹ۲����б�ִ�����ǵ�update����
	 */
	public void notifyObservers() {
        for(Observer o: observers){
        	//��ģ��
            //o.update(this);
            //��ģ��
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
