package org.fzy.study.javabase;

public class MyFanxing<E> {
	
	private E e;
	
	public MyFanxing(E ee) {
		e = ee;
	}
	
	public E getObj() {
		return this.e;
	}
}
