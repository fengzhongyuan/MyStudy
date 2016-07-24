package org.fzy.study.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person{
	
	
	private String name;
	
	@Autowired(required=false)
	private Car car;
	
//	private Map<String, Car> carMap;
	
	public Person() {
		System.out.println("Person init method!");
	}

	public void init() {
		System.out.println("person init");
	}
	
	public void destroyMet() {
		System.out.println("person destroyed");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}


	

}
