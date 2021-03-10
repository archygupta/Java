package com.cop.part1.startingThreads;

class RunnableApp implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread "+i+" running.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadUsingRunnableInterface {
	public static void main(String args[]) {
		RunnableApp runnableObj1 = new RunnableApp();
		Thread threadObj1 = new Thread(runnableObj1);
		threadObj1.start();
		
		Thread threadObj2 = new Thread(new RunnableApp());
		threadObj2.start();	
	}
}
