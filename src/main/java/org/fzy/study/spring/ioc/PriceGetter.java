package org.fzy.study.spring.ioc;

public class PriceGetter {

	public float getPrice() {
		return (float) Math.random();
	}
	
	public float getPrice(Car car) {
		return (float) Math.random();
	}
	
	public String getPriceDanwei() {
		return "dollar";
	}
}
