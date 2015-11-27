package com.lijinlong.designpattern.策略模式.Ibehavior.impl;

import com.lijinlong.designpattern.策略模式.Ibehavior.FlyBehavior;


public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("根本不会飞行");
	}

}
