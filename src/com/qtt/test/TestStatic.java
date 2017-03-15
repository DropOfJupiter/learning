package com.qtt.test;
public class TestStatic {
	private static int a;// 静态变量
	private int b;// 实例变量
	private static final int c=99;// 静态常量
	private final static int d=100;// 静态常量
	// 代码块可以有多个，JVM将按照它们在类中出现的先后顺序依次执行它们，每个代码块只会被执行一次
	static {
		TestStatic.a = 3;
		TestStatic.ff();
		System.out.println("第一个static："+a);
		System.out.println("第一个static："+c);
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
		System.out.println("第二个static："+a);
		System.out.println("第二个static："+c);
	}
	public void f() {
		System.out.println("解释代码块");
	}
	public static void ff() {
		System.out.println("解释代码块ff");
	}
}
