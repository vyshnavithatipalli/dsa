package com.practice.dsa.dsImplementation;

import java.util.LinkedList;

public class Deque {

	LinkedList<String> list;
	public Deque() {
		this.list=new LinkedList<>();
	}
	
	public int size() {
		return list.size();
	}
	
	public void addFirst(String s) {
		list.addFirst(s);
	}
	
	public void addLast(String s) {
		list.addLast(s);
	}
	
	public String removeFirst() {
		return list.isEmpty()?null:list.removeFirst();
	}
	public String removeLast() {
		return list.isEmpty()?null:list.removeLast();
		
	}
	public String peekFirst() {
		return list.isEmpty()?null:list.peekFirst();
	}
	
	public String peekLast() {
		return list.isEmpty()?null:list.peekLast();
	}

	@Override
	public String toString() {
		return "Deque [list=" + list + "]";
	}
	
	
}



