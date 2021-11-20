package br.com.abruzzo.turing;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @link https://leetcode.com/problems/print-foobar-alternately/
 * @link https://leetcode.com/problems/print-foobar-alternately/discuss/1584839/print-foobar-alternately-Simpleclean-Java-code-beats-100
 */
public class AsyncPrintFooBarAlternately_1 {

    private int n;

    public AsyncPrintFooBarAlternately_1(int n) {
        this.n = n;
    }

    // 1. Using ReentrantLock
    private final Lock lock = new ReentrantLock();
    private final Condition foo = lock.newCondition();
    private final Condition bar = lock.newCondition();
    private boolean willPrintFoo = true;

    public void foo(Runnable printFoo) throws InterruptedException {
        lock.lock();
        try {
            for (int i = 0; i < n; i++) {
                while (!willPrintFoo) foo.await();
                printFoo.run();

                willPrintFoo = false;
                bar.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        lock.lock();
        try {
            for (int i = 0; i < n; i++) {
                while (willPrintFoo) bar.await();
                printBar.run();

                willPrintFoo = true;
                foo.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    // 2. Using Semaphore
    /*
    private final Semaphore sem1 = new Semaphore(0);
    private final Semaphore sem2 = new Semaphore(1);

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            sem2.acquire();
        	printFoo.run();
            sem1.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            sem1.acquire();
        	printBar.run();
            sem2.release();
        }
    }
    */
}
