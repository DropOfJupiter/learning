package com.qtt.test;

import com.qtt.designpatterns.factory.method.Human;
import com.qtt.designpatterns.factory.method.HumanFactory;
import com.qtt.designpatterns.factory.method.IHumanFactory;
import com.qtt.designpatterns.factory.method.Man;
import com.qtt.designpatterns.factory.method.Woman;

public class TestMethodFactory {

	public static void main(String[] args) {
		//ͨ�����ĵĳ��󹤳�����ʵ�������帺���������ֲ�Ʒ��ʵ��������
		//�ѶԲ�Ʒ��ʵ�����ӳٵ��˾���������ȥ
		IHumanFactory HumanFactory = new HumanFactory();
		// ʹ�õ�һ�ַ�ʽ����������̬ʵ��������
		Human man1 = HumanFactory.createHuman("man");
		man1.say();
		Human woman1 = HumanFactory.createHuman("woman");
		woman1.say();
		// ʹ�õڶ��ַ�ʽ����������̬ʵ��������
		Human man2 = HumanFactory.createHuman(Man.class);
		man2.say();
		Human woman2 = HumanFactory.createHuman(Woman.class);
		woman2.say();

	}

}
