package com.lijinlong.designpattern;

import org.junit.Test;

import com.lijinlong.designpattern.观察者模式.display.UserDisyplay;
import com.lijinlong.designpattern.观察者模式.observer.ObServer;
import com.lijinlong.designpattern.观察者模式.subject.Subject;
import com.lijinlong.designpattern.观察者模式.subject.UserSubject;

public class TestDesingPattern {

	
	/**
	 * 观察者模式测试
	 */
	@Test
	public void testObserver(){
		UserSubject s = new UserSubject();
		s.setData("Tom", 22);
		UserDisyplay display = new UserDisyplay(s);
		display.display();
		s.setData("Jerry", 23);
		//display.display();
		s.setData("Jack", 30);
		//display.display();
	}
}
