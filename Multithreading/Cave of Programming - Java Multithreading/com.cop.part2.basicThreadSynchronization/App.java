package com.cop.part2.basicThreadSynchronization;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
	}
}

public class App {
	public static void main(String args[]) {
		Processor proc1 = new Processor();
		proc1.start();
		System.out.println("process is running.");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		proc1.shutdown();
	}
}
