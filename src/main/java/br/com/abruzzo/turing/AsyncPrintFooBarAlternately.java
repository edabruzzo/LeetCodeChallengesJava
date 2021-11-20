package br.com.abruzzo.turing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @link https://leetcode.com/problems/print-foobar-alternately/discuss/1502790/Java-Reentrant-Lock-Solution
 */
public class AsyncPrintFooBarAlternately {

    private static final String FOO = "foo";
    private static final String BAR = "bar";

    private AtomicReference<String> lastProcessedString = new AtomicReference<>(BAR);
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private int n;

    public AsyncPrintFooBarAlternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            process(FOO, printFoo);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            process(BAR, printBar);
        }
    }

    private void process(String method, Runnable job) throws InterruptedException
    {
        lock.lock();
        try
        {
            while(lastProcessedString.get() == method)
            {
                condition.await();
            }
            job.run();
            lastProcessedString.set(method);
            condition.signalAll();
        }
        finally
        {
            lock.unlock();
        }
    }
}