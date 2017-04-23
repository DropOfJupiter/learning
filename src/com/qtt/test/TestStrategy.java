package com.qtt.test;

import com.qtt.designpatterns.strategy.AdvancedMemberStrategy;
import com.qtt.designpatterns.strategy.MemberStrategy;
import com.qtt.designpatterns.strategy.PriceContext;

/**
 * 测试策略模式
 * 
 * @author Administrator
 *
 */
public class TestStrategy {
	public static void main(String[] args) {
		// 1.选择并创建需要使用的策略对象
		MemberStrategy strategy = new AdvancedMemberStrategy();
		// 2.创建环境
		PriceContext price = new PriceContext(strategy);
		// 3.计算价格
		double quote = price.quote(300);
		System.out.println("图书的最终价格为：" + quote);
	}
}
