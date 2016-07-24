package org.fzy.study.spring.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Person implements InitializingBean, DisposableBean{
	
	
	private String name;
	private List<Car> cars;
	
	private Map<String, Car> carMap;
	
	private Properties prop;
	
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

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
		System.out.println("set car for person");
	}

	public Map<String,Car> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Car> carMap) {
		this.carMap = carMap;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cars=" + cars + ", carMap=" + carMap + ", prop=" + prop + "]";
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set in initialingBean!");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy in DisposableBean!");
	}
	
	
	
}
