package com.qtt.test;

import com.qtt.designpatterns.factory.method.Human;
import com.qtt.designpatterns.factory.method.HumanFactory;
import com.qtt.designpatterns.factory.method.IHumanFactory;
import com.qtt.designpatterns.factory.method.Man;
import com.qtt.designpatterns.factory.method.Woman;

public class TestMethodFactory {

	public static void main(String[] args) {
		//通过核心的抽象工厂类来实例化具体负责生产哪种产品的实例工厂，
		//把对产品的实例化延迟到了具体子类中去
		IHumanFactory HumanFactory = new HumanFactory();
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
