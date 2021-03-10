package com.cop.part4.multipleLocksUsingSynchronizedCode;

import java.util.*;

public class Worker {

	private Random random = new Random();

	List<Integer> list1 = new ArrayList();
	List<Integer> list2 = new ArrayList();

	Object lock1 = new Object();
	Object lock2 = new Object();

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void main() {
		System.out.println("Starting");
		long start = System.currentTimeMillis();

		process();

		long end = System.currentTimeMillis();

		System.out.println("Taken time: " + (end - start));
		System.out.println("list1 size: " + list1.size() + ", list2 size: " + list2.size());

	}
}
