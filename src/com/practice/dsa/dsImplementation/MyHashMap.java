package com.practice.dsa.dsImplementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<K,V> {

	public static class Entry<K,V>{
		
		K key;
		V value;
		public Entry(K key,V value) {
			this.key=key;
			this.value=value;
		}
	}
	
	private static final int INITIAL_CAPACITY=16;
	ArrayList<LinkedList<Entry<K,V>>> buckets;
	
	public MyHashMap() {
		this.buckets=new ArrayList<>(INITIAL_CAPACITY);
		for(int i=0;i<INITIAL_CAPACITY;i++) {
			//buckets.add(null);
				buckets.add(new LinkedList<>());
				
	}
	
	}
private int getBucketIndex(K key) {
	
	int index=Math.abs(key.hashCode()%INITIAL_CAPACITY);
	
	return index;
		
	}



public void put(K key,V value) {
	LinkedList<Entry<K, V>> idx=buckets.get(getBucketIndex(key));
	
	for(Entry<K,V> entry:idx) {
	if(Objects.equals(key,entry.key)) {
		entry.value=value;
		return;
	}
	}
	idx.add(new Entry<>(key, value));
	//buckets.add(idx);

	
}

public V get(K key) {
    int index = getBucketIndex(key);
    for (Entry<K, V> entry : buckets.get(index)) {
        if (Objects.equals(entry.key, key)) {
            return entry.value;
        }
    }
    return null;
}

public void remove(K key) {
    int index = getBucketIndex(key);
    buckets.get(index).removeIf(entry -> Objects.equals(entry.key, key));
}

public boolean containsKey(K key) {
    return get(key) != null;
}

}
