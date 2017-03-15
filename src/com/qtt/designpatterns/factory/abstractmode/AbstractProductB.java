package com.qtt.designpatterns.factory.abstractmode;
/**
 * 抽象产品类B
 * @author Administrator
 *
 */
public abstract class AbstractProductB {
	//每个产品公有的方法  
    public void shareMethod(){  
          
    }  
    //每个产品相同方法，不同实现  
    public abstract void doSomething(); 
}
