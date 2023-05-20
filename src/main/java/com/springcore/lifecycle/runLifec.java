package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class runLifec {

	public static void main(String[] args) {
		
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/lifecycle/configlifecy.xml");
	Testlifec  s1 = (Testlifec) context.getBean("sum");
	System.out.println(s1);

	}

}
