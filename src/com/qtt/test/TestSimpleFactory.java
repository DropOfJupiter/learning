package com.qtt.test;

import com.qtt.factory.simple.Human;
import com.qtt.factory.simple.HumanFactory;
import com.qtt.factory.simple.Man;
import com.qtt.factory.simple.Woman;

public class TestSimpleFactory {

	public static void main(String[] args) {
		// 使用第一种方式根据类名动态实例化对象
		Human man1 = HumanFactory.createHuman("man");
		man1.say();
		Human woman1 = HumanFactory.createHuman("woman");
		woman1.say();
		// 使用第二种方式根据类名动态实例化对象
		Human man2 = HumanFactory.createHuman(Man.class);
		man2.say();
		Human woman2 = HumanFactory.createHuman(Woman.class);
		woman2.say();

	}

}
