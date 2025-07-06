package com.practice.dsa.threads;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeQueue<Integer> queue = new ThreadSafeQueue<>(5);

        Thread producer1 = new Thread(new ProducerThread(queue));
       // Thread producer2 = new Thread(new ProducerThread(queue));
        Thread consumer1 = new Thread(new ConsumerThread(queue));
       // Thread consumer2 = new Thread(new ConsumerThread(queue));

        producer1.start();
      //  producer2.start();
        consumer1.start();
       // consumer2.start();
	}

}
