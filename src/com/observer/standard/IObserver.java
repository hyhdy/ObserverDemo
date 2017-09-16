package com.observer.standard;

public interface IObserver {
	/***
	 * 定义观察者的更新行为
	 * @param abstractObservable:抽象被观察者类
	 * @param object:传递的额外信息
	 */
	public void update(AbstractObservable abstractObservable,Object object);
}