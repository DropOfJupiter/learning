package com.qtt.factory.method;

public class HumanFactory extends IHumanFactory {
	// ��һ�ַ�ʽ��ʹ���߼��жϵķ�ʽʵ�ֵ�
	public Human createHuman(String type) {
		if (type.equals("man")) {
			Human man = new Man();
			return man;
		} else if (type.equals("woman")) {
			Human woman = new Woman();
			return woman;
		} else {
			System.out.println("����������");
			return null;
		}
	}

	// �ڶ���ʽ��ʹ��java�ķ���ʵ�ֵ�
	@SuppressWarnings("rawtypes")
	public Human createHuman(Class c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("��֧�ֳ������ӿ�");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("û���㹻Ȩ�ޣ������ܷ���˽�ж���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�಻����");
			e.printStackTrace();
		}
		return human;
	}
}
