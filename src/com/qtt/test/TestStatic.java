package com.qtt.test;
public class TestStatic {
	private static int a;// ��̬����
	private int b;// ʵ������
	private static final int c=99;// ��̬����
	private final static int d=100;// ��̬����
	// ���������ж����JVM���������������г��ֵ��Ⱥ�˳������ִ�����ǣ�ÿ�������ֻ�ᱻִ��һ��
	static {
		TestStatic.a = 3;
		TestStatic.ff();
		System.out.println("��һ��static��"+a);
		System.out.println("��һ��static��"+c);
		TestStatic t = new TestStatic();
		t.f();
		t.b = 1000;
		System.out.println(t.b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(d);
	}
	static {
		TestStatic.a = 4;
		System.out.println("�ڶ���static��"+a);
		System.out.println("�ڶ���static��"+c);
	}
	public void f() {
		System.out.println("���ʹ����");
	}
	public static void ff() {
		System.out.println("���ʹ����ff");
	}
}
