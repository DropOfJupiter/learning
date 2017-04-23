package com.qtt.designpatterns.strategy;
/**
 * 策略模型 角色3：环境角色类
 * 
 * @author Administrator
 *
 */
public class PriceContext {

	private MemberStrategy memberStategy;

	public PriceContext(MemberStrategy memberStategy) {
		super();
		this.memberStategy = memberStategy;
	}
	/**
	 * 计算图书的价格
	 * @param booksPrice
	 *            图书的原价
	 * @return 计算出打折后的价格
	 */
	public double quote(double booksPrice) {
		return this.memberStategy.calcPrice(booksPrice);
	}
}
