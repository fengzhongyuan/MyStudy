package org.fzy.study.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/fzy/study/spring/ioc/application.xml");
		Car car = (Car) ctx.getBean("car1");
		System.out.println(car);
		
		Person person1 = (Person) ctx.getBean("person1");
		System.out.println(person1);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
	
	
}
