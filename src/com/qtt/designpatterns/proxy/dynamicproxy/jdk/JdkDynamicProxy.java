package com.qtt.designpatterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类 角色3：代理类
 * 
 * @author Administrator
 *
 */
public class JdkDynamicProxy implements InvocationHandler {
	private Object jdkDynamicRealSubject;// 委托类

	// 构造方法，给我们要代理的真实对象赋初值
	public JdkDynamicProxy(Object obj) {
		this.jdkDynamicRealSubject = obj;
	}

	/**
	 * Object proxy：指被代理的对象(委托类)
	 * Method method：我们所要调用被代理对象的某个方法的Method对象 Object[]
	 * args：被代理对象某个方法调用时所需要的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 在代理真实对象操作前 我们可以添加一些自己的操作  
		System.out.println("jdkDynamicProxy start to work");
		method.invoke(jdkDynamicRealSubject, args);// 内部引用真实主题类的方法
		 // 在代理真实对象操作后 我们也可以添加一些自己的操作
		System.out.println("jdkDynamicProxy stop working");
		return null;
	}

}
