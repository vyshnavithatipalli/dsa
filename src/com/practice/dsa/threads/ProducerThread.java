package com.practice.dsa.threads;

public class ProducerThread implements Runnable{
private final ThreadSafeQueue<Integer> que;


	public ProducerThread(ThreadSafeQueue<Integer> que) {
	
	this.que = que;
}


	@Override
	public void run() {
		int x=0;
		while(true) {
			try {
				que.threadsafeEnqueue(x);
				System.out.println("produced"+x);
				x++;
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}

	

}
