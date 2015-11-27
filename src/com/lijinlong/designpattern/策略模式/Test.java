package com.lijinlong.designpattern.策略模式;

import com.lijinlong.designpattern.策略模式.Ibehavior.impl.FlyWithRocket;

public class Test {

	public static void main(String[] args) {
		
		//将对象的具体行为封装为对象, 由该对象去实现行为
		Duck d = new Duck1();
		d.performFly();
		d.setFly(new FlyWithRocket());
		d.performFly();
	}
}
