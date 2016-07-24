package org.fzy.study.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/fzy/study/spring/autowiring/application_autowire.xml");
		Person person = ctx.getBean(Person.class);
		
		System.out.println(person);
	}
}
