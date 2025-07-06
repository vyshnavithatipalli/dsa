package com.practice.dsa.threads;

public class TwoThreadsToPrintEvenAndOdd {

	
	 private int number = 1;
	    private final int max = 10;

	    public synchronized void printOdd() {
	        while (number <= max) {
	            if (number % 2 == 0) {
	                try {
	                    wait();  // wait on "this"
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            } else {
	                System.out.println("Odd: " + number);
	                number++;
	                notify();  // notify thread waiting on "this"
	            }
	        }
	    }

	    public synchronized void printEven() {
	        while (number <= max) {
	            if (number % 2 != 0) {
	                try {
	                    wait();  // wait on "this"
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            } else {
	                System.out.println("Even: " + number);
	                number++;
	                notify();  // notify thread waiting on "this"
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	TwoThreadsToPrintEvenAndOdd printer = new TwoThreadsToPrintEvenAndOdd();

	       // Thread t1 = new Thread(printer::printOdd);
	        Thread t1=new Thread(()->printer.printOdd());
	        Thread t2 = new Thread(printer::printEven);

	        t1.start();
	        t2.start();
	    }

}
