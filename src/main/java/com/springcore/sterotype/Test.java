package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	                 	
         	ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/sterotype/configstero.xml");
         	student student =  con.getBean("Student",student.class); 
        System.out.println(student);
	}

}
