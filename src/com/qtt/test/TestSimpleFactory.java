package com.qtt.test;

import com.qtt.factory.simple.Human;
import com.qtt.factory.simple.HumanFactory;
import com.qtt.factory.simple.Man;
import com.qtt.factory.simple.Woman;

public class TestSimpleFactory {

	public static void main(String[] args) {
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
