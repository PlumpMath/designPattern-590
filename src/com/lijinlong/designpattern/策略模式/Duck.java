package com.lijinlong.designpattern.策略模式;

import com.lijinlong.designpattern.策略模式.Ibehavior.FlyBehavior;

public abstract class Duck {
	
	protected FlyBehavior fly;
	public Duck(){}
	public abstract void display();
	
	public void performFly(){
		fly.fly();
	}
	public FlyBehavior getFly() {
		return fly;
	}
	public void setFly(FlyBehavior fly) {
		this.fly = fly;
	}
}
