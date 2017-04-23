package com.qtt.designpatterns.strategy;
/**
 * 策略模式 角色2：具体策略类（中级会员）
 * @author Administrator
 *
 */
public class AdvancedMemberStrategy implements MemberStrategy {
	
	public double calcPrice(double booksPrice) {
		System.out.println("对于高级会员的折扣为20%");
        return booksPrice*0.8;
	}

}
