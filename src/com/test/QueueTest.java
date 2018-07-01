package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String args[]) {
		QueueOperations q = new QueueOperations();
		QueueOperations1 q1 = new QueueOperations1();
		Thread thread1 = new Thread(q);
		Thread thread2 = new Thread(q1);
		thread1.start();
		thread2.start();
	}
}

class QueueOperations implements Runnable {

	@Override
	public void run() {
		Queue<Integer> integerQueue = new LinkedList<>();
		for(int i=0; i<110; i++) {
			integerQueue.add(i);
			System.out.println("head of the queue"+integerQueue.peek());
		}
	}
}

class QueueOperations1 implements Runnable {

	@Override
	public void run() {
		Queue<Integer> integerQueue = new LinkedList<>();
//		for(int i=0; i<10; i++) {
//		}
//		System.out.println("Head of the queue"+integerQueue.poll());
	}
}
