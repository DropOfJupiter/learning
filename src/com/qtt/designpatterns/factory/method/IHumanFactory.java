package com.qtt.designpatterns.factory.method;

public abstract class IHumanFactory {
	// 第一种方式是使用逻辑判断的方式实现的
	public abstract  Human createHuman(String type);

	// 第二方式是使用java的放射实现的
	public abstract  Human createHuman(Class c);
}
