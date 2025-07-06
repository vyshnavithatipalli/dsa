package com.practice.dsa.dsImplementation;

import java.util.ArrayList;

public class DequeWithArrayList {

	ArrayList<String> list;
	public DequeWithArrayList() {
		list=new ArrayList<String>();
	}
	
	public int size() {
		return list.size();
	}
	
	public void addFirst(String s) {
		list.add(0,s);
		
	}
	public void addLast(String s) {
		list.add(s);
	}
	public String removeFirst() {
		return list.isEmpty()?null:list.remove(0);
	}
	
	public String removeLast() {
		return list.isEmpty()?null:list.remove(list.size()-1);
		
	}
	public String peekFirst() {
		return list.isEmpty()?null:list.get(0);
	}
	public String peekLast() {
		return list.isEmpty()?null:list.get(list.size()-1);
	}

	@Override
	public String toString() {
		return "DequeWithArrayList [list=" + list + "]";
	}

}
