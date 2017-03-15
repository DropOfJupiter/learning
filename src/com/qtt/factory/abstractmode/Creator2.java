package com.qtt.factory.abstractmode;
/**具体工厂类2
 * 
 * @author Administrator
 *
 */
public class Creator2 extends AbstractCreator {
	// 只生产产品等级为1的产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
