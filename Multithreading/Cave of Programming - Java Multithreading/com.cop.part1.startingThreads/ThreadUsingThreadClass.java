package com.cop.part1.startingThreads;

class App extends Thread{
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
public class ThreadUsingThreadClass {
	public static void main(String args[]) {
		App threadObj1 = new App();
		threadObj1.start();
		
		App threadObj2 = new App();
		threadObj2.start();
	}
}
