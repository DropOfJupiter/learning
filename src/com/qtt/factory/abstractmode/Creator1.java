package com.qtt.factory.abstractmode;
/**
 * ���幤����1
 * @author Administrator
 *
 */
public class Creator1 extends AbstractCreator {
	// ֻ������Ʒ�ȼ�Ϊ1�Ĳ�Ʒ
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
