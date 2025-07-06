package com.practice.dsa.dsImplementation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque d=new Deque();
d.addFirst("first");
d.addLast("last");
System.out.println(d.removeLast());
System.out.println(d.removeFirst());
System.out.println(d.size());

System.out.println("__________________________________");
DequeWithArrayList de=new DequeWithArrayList();
de.addFirst("first with array");
de.addLast("last with array");
de.addFirst("test");
System.out.println(de.peekFirst());
System.out.println(de.peekLast());
System.out.println(de.removeFirst());
System.out.println(de.removeLast());
System.out.println(de);
System.out.println("___________________________________________");
MyHashMap<String, Integer> map = new MyHashMap<>();
map.put("apple", 1);
map.put("banana", 2);
System.out.println(map.get("apple")); // Output: 1
map.remove("apple");
System.out.println(map.containsKey("apple")); // Output: false
	}

}
