package com.qtt.test;

import com.qtt.designpatterns.strategy.AdvancedMemberStrategy;
import com.qtt.designpatterns.strategy.MemberStrategy;
import com.qtt.designpatterns.strategy.PriceContext;

/**
 * ���Բ���ģʽ
 * 
 * @author Administrator
 *
 */
public class TestStrategy {
	public static void main(String[] args) {
		// 1.ѡ�񲢴�����Ҫʹ�õĲ��Զ���
		MemberStrategy strategy = new AdvancedMemberStrategy();
		// 2.��������
		PriceContext price = new PriceContext(strategy);
		// 3.����۸�
		double quote = price.quote(300);
		System.out.println("ͼ������ռ۸�Ϊ��" + quote);
	}
}
