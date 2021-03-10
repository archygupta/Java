package com.cop.part3.theSynchronizedKeyword;

public class App {

	int count = 0;

	private synchronized void increment() {
		count++;
	}

	public static void main(String args[]) {
		App app = new App();
		app.doYourWork();
	}

	public void doYourWork() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}

		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(count);
	}
}
