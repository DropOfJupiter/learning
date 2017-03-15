package com.qtt.test;

import com.qtt.designpatterns.factory.abstractmode.AbstractCreator;
import com.qtt.designpatterns.factory.abstractmode.AbstractProductA;
import com.qtt.designpatterns.factory.abstractmode.AbstractProductB;
import com.qtt.designpatterns.factory.abstractmode.Creator1;
import com.qtt.designpatterns.factory.abstractmode.Creator2;

public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractCreator creator1 = new Creator1();  
        AbstractCreator creator2 =new Creator2();  
        //����A1����  
        AbstractProductA a1 = creator1.createProductA();  
        a1.doSomething();
        //����A2����  
        AbstractProductA a2 = creator2.createProductA();  
        a2.doSomething();
        //����B1����  
        AbstractProductB b1= creator1.createProductB();
        b1.doSomething();
        //����B2����  
        AbstractProductB b2 =creator2.createProductB(); 
        b2.doSomething();

	}

}
