package com.lijinlong.designpattern.观察者模式.subject;

import com.lijinlong.designpattern.观察者模式.observer.ObServer;

/**
 * 观察者模式:主题对象
 * @author lijinlong
 *
 */
public interface Subject {

	public void registerObserver(ObServer obServer);
	
	public void removeObserver(ObServer obServer);
	
	public void notifyObservers();
}
