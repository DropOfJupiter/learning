package com.qtt.test;

import com.qtt.designpatterns.proxy.staticproxy.Proxy;
import com.qtt.designpatterns.proxy.staticproxy.RealSubject;

/**
 * 测试静态代理模式
 * 
 * @author Administrator
 *
 */
public class TestStaticProxy {
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		Proxy p = new Proxy(subject);
		p.doSomething();
	}
}
