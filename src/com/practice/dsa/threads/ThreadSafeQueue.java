package com.practice.dsa.threads;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {
	
private  final Queue<T> queue=new LinkedList<T>();
private final int capacity;
ThreadSafeQueue(int capacity){
	this.capacity=capacity;
}
public  synchronized void threadsafeEnqueue(T item) throws InterruptedException {
	if(queue.size()==capacity) {
		wait();
	}
	queue.add(item);
	
	notifyAll();
	
}
public  synchronized T threadsafeDequeue() throws InterruptedException {
	if(queue.isEmpty()) {
		wait();
	}
	T item1=queue.poll();
	notifyAll();
	return item1;
	
}

}
