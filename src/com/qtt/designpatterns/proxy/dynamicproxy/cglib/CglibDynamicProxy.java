package com.qtt.designpatterns.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * ʹ��Cglibʵ�ֵĶ�̬������ ��ɫ2��������
 * 
 * @author Administrator
 *
 */
public class CglibDynamicProxy implements MethodInterceptor {
	private Object cglibDynamicRealSubject; // ί����

	/**
	 * �����������
	 * 
	 * @param target
	 *            ������Ķ���ί���ࣩ
	 * @return
	 */
	public Object getProxyInstance(Object target) {
		this.cglibDynamicRealSubject = target;
		// ������ǿ��ʵ��
		Enhancer enhancer = new Enhancer();
		// ���ñ��������ֽ��룬CGLIB�����ֽ������ɱ������������
		enhancer.setSuperclass(this.cglibDynamicRealSubject.getClass());
		// ����Ҫ��������������ص���������һ���������� new MethodInterceptor()
		enhancer.setCallback(this);
		// ����������� ʵ��
		return enhancer.create();
	}

	public Object intercept(Object obj, Method arg1, Object[] args, MethodProxy proxy) throws Throwable {
		 // �ڴ�����ʵ�������ǰ ���ǿ������һЩ�Լ��Ĳ���  
        System.out.println("ǰ�ô���,��ǿ����");           
        proxy.invokeSuper(obj, args);           
        // �ڴ�����ʵ��������� ����Ҳ�������һЩ�Լ��Ĳ���  
        System.out.println("���ô���,��ǿ����");  
        return null;  
	}

}
