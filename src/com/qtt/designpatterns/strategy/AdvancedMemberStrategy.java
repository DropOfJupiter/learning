package com.qtt.designpatterns.strategy;
/**
 * ����ģʽ ��ɫ2����������ࣨ�м���Ա��
 * @author Administrator
 *
 */
public class AdvancedMemberStrategy implements MemberStrategy {
	
	public double calcPrice(double booksPrice) {
		System.out.println("���ڸ߼���Ա���ۿ�Ϊ20%");
        return booksPrice*0.8;
	}

}
