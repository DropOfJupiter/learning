package com.qtt.factory.method;

public class HumanFactory extends IHumanFactory {
	// 第一种方式是使用逻辑判断的方式实现的
	public Human createHuman(String type) {
		if (type.equals("man")) {
			Human man = new Man();
			return man;
		} else if (type.equals("woman")) {
			Human woman = new Woman();
			return woman;
		} else {
			System.out.println("生产不出来");
			return null;
		}
	}

	// 第二方式是使用java的放射实现的
	@SuppressWarnings("rawtypes")
	public Human createHuman(Class c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("不支持抽象类或接口");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("没有足够权限，即不能访问私有对象");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("类不存在");
			e.printStackTrace();
		}
		return human;
	}
}
