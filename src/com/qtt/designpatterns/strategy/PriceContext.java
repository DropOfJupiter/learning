package com.qtt.designpatterns.strategy;
/**
 * ����ģ�� ��ɫ3��������ɫ��
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
	 * ����ͼ��ļ۸�
	 * @param booksPrice
	 *            ͼ���ԭ��
	 * @return ��������ۺ�ļ۸�
	 */
	public double quote(double booksPrice) {
		return this.memberStategy.calcPrice(booksPrice);
	}
}
