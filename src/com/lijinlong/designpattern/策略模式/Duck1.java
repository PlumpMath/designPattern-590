package com.lijinlong.designpattern.策略模式;

import com.lijinlong.designpattern.策略模式.Ibehavior.impl.FlyWithWings;

public class Duck1 extends Duck {

	
	
	public Duck1(){
		this.fly = new FlyWithWings();
	}
	
	
	@Override
	public void display() {
		
		System.out.println("this is duck1");
	}
	
	
}
