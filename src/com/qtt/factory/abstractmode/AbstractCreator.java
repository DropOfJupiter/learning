package com.qtt.factory.abstractmode;
/**
 * 抽象工厰類角色
 * @author Administrator
 *
 */
public abstract class AbstractCreator {
	// 创建产品A家族
	public abstract AbstractProductA createProductA();

	// 创建产品B家族
	public abstract AbstractProductB createProductB();
}
