package com.lijinlong.designpattern.策略模式.Ibehavior.impl;

import com.lijinlong.designpattern.策略模式.Ibehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		
		System.out.println("使用翅膀进行飞行");
		
	}

}
