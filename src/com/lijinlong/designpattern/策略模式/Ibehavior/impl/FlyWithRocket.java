package com.lijinlong.designpattern.策略模式.Ibehavior.impl;

import com.lijinlong.designpattern.策略模式.Ibehavior.FlyBehavior;

public class FlyWithRocket implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("搭载火箭进行飞行");
		
	}

}
