package com.qtt.designpatterns.strategy;
/**
 * ����ģʽ ��ɫ2����������ࣨ�м���Ա��
 * @author Administrator
 *
 */
public class IntermediateMemberStrategy implements MemberStrategy {
	
	public double calcPrice(double booksPrice) {
		System.out.println("�����м���Ա���ۿ�Ϊ10%");
        return booksPrice*0.9;
	}

}
