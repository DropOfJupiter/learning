package com.qtt.factory.abstractmode;
/**���幤����2
 * 
 * @author Administrator
 *
 */
public class Creator2 extends AbstractCreator {
	// ֻ������Ʒ�ȼ�Ϊ1�Ĳ�Ʒ
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
