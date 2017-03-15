package com.qtt.factory.abstractmode;
/**
 * 具体工厂类1
 * @author Administrator
 *
 */
public class Creator1 extends AbstractCreator {
	// 只生产产品等级为1的产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
