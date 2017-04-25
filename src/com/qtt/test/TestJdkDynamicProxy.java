package com.qtt.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.qtt.designpatterns.proxy.dynamicproxy.jdk.JdkDynamicProxy;
import com.qtt.designpatterns.proxy.dynamicproxy.jdk.JdkDynamicRealSubject;
import com.qtt.designpatterns.proxy.dynamicproxy.jdk.JdkDynamicSubject;

/**
 * ����ʹ��JDKʵ�ֵĶ�̬����ģʽ
 * 
 * @author Administrator
 *
 */
public class TestJdkDynamicProxy {
	public static void main(String[] args) {
		//ʵ����ί����
		JdkDynamicSubject realSubject = new JdkDynamicRealSubject();
		//����Ҫ�����ĸ�ί���࣬�ͽ��ö��󴫽�ȥ�������ͨ������ʵ������÷�����  
		InvocationHandler handler = new JdkDynamicProxy(realSubject); 		
		 /* 
         * ͨ��Proxy��newProxyInstance��������̬�������ǵĴ��������������������������<br/> 
         * ����һ����������ʹ��handler������ClassLoader�������������ǵĴ������<br/> 
         * ����������������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�еĽӿڣ���ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ�����<br/> 
         * ���������������ｫ������������������Ϸ��� InvocationHandler ��������� 
         */  
		JdkDynamicSubject proxyInstance = (JdkDynamicSubject)Proxy.newProxyInstance(
				handler.getClass().getClassLoader(),   
				JdkDynamicRealSubject.class.getInterfaces(),   
                handler);  
        proxyInstance.doSomething("qiutt"); 
	}
}
