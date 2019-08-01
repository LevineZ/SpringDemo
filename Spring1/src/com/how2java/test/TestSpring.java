package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

		Category c = (Category) context.getBean("c");         //由Spring创建对象

		System.out.println(c.getName());
	}
}
//public static void main (String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
//	Category c = (Category) context.getBean("c");
//	System.out.println(c.getName());
//}