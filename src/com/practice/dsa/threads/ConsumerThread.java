package com.practice.dsa.threads;

import java.util.LinkedList;

public class ConsumerThread implements Runnable {
private final ThreadSafeQueue<Integer> que;


	public ConsumerThread(ThreadSafeQueue<Integer> que) {
	
	this.que = que;
}


	@Override
	public void run() {
		
		while(true) {
			try {
				int val=que.threadsafeDequeue();
				System.out.println("consumed"+val);
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		// TODO Auto-generated method stub
		
	}

	

}
