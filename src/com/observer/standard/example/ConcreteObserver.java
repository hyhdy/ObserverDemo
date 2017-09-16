package com.observer.standard.example;

import com.observer.standard.AbstractObservable;
import com.observer.standard.IObserver;

public class ConcreteObserver implements IObserver {

	@Override
	public void update(AbstractObservable abstractObservable, Object object) {
		if(abstractObservable instanceof ConcreteObservable) {
			//1.将抽象被观察对象强转成具体被观察对象
			ConcreteObservable concreteObservable=(ConcreteObservable) abstractObservable;
			
			//2.获取具体被观察对象的相关数据
			
			//3.处理相关业务逻辑
		}
	}
	

}
