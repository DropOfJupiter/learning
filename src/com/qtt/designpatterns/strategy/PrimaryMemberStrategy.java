package com.qtt.designpatterns.strategy;
/**
 * ����ģʽ ��ɫ2����������ࣨ������Ա��
 * @author Administrator
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {
	
	public double calcPrice(double booksPrice) {
		System.out.println("���ڳ�����Ա��û���ۿ�");
        return booksPrice;
	}

}
