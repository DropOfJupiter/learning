package com.qtt.designpatterns.strategy;
/**
 * ����ģʽ��ɫ1�����������
 * @author Administrator
 *
 */
public interface MemberStrategy {
	/**
     * ����ͼ��ļ۸�
     * @param booksPrice    ͼ���ԭ��
     * @return    ��������ۺ�ļ۸�
     */
    public double calcPrice(double booksPrice);
}
