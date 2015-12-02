package com.lijinlong.designpattern.观察者模式.subject;

import java.util.ArrayList;

import com.lijinlong.designpattern.观察者模式.observer.ObServer;
/**
 * 自定义主题
 * @author lijinlong
 *
 */
public class UserSubject implements Subject {

	private ArrayList observers;
	
	private String name;
	
	private Integer age;
	
	public UserSubject(){
		this.observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(ObServer obServer) {
		observers.add(obServer);
	}

	@Override
	public void removeObserver(ObServer obServer) {
		int i = observers.indexOf(obServer);
		if(i>=0){
			observers.remove(obServer);
		}
	}

	@Override
	public void notifyObservers() {
		int j=observers.size();
		ObServer o;
		for(int i=0; i<j; i++){
			o = (ObServer) observers.get(i);
			o.update(name, age);
		}
		
	}
	//当数据改变时, 此方法被调用
	public void change(){
		notifyObservers();
	}
	//设置数据
	public void setData(String name, Integer age){
		this.name = name;
		this.age = age;
		change();
	}

}
