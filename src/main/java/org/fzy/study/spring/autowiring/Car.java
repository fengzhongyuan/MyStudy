package org.fzy.study.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private String changshang;
	private String chexing;
	private int speed;
	private float price;
	
	public Car() {
		
	}
	
	public Car(String changshang, String chexing, int speed) {
		this.changshang = changshang;
		this.chexing = chexing;
		this.speed = speed;
	}
	
	public Car(String changshang, String chexing, float price) {
		this.changshang = changshang;
		this.chexing = chexing;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [changshang=" + changshang + ", chexing=" + chexing + ", speed=" + speed + ", price=" + price + "]";
	}
	
	public String getChangshang() {
		return changshang;
	}
	public void setChangshang(String changshang) {
		this.changshang = changshang;
	}
	public String getChexing() {
		return chexing;
	}
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
