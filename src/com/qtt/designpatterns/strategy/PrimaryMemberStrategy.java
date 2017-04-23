package com.qtt.designpatterns.strategy;
/**
 * 策略模式 角色2：具体策略类（初级会员）
 * @author Administrator
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {
	
	public double calcPrice(double booksPrice) {
		System.out.println("对于初级会员的没有折扣");
        return booksPrice;
	}

}
