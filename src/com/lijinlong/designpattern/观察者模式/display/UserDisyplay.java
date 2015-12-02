package com.lijinlong.designpattern.观察者模式.display;

import com.lijinlong.designpattern.观察者模式.observer.ObServer;
import com.lijinlong.designpattern.观察者模式.subject.Subject;

public class UserDisyplay implements DisplayElement,ObServer{

	private Subject subject;
	
	private String name;
	
	private Integer age;
	
	public UserDisyplay(Subject subject){
		this.subject = subject;
		subject.registerObserver(this);
		display();
	}
	
	
	@Override
	public void update(String name, Integer age) {
		this.name = name;
		this.age = age;
		display();
	}

	@Override
	public void display() {
		System.out.println("这是一个观察者模式: name="+name+", age="+age);
	}

}
