package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AsyncPrintFooBarAlternately_4 {

    private final int n;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition fooCanPrint = lock.newCondition();
    private final Condition barCanPrint = lock.newCondition();
    private final AtomicBoolean fooPrinted = new AtomicBoolean(false);

    public AsyncPrintFooBarAlternately_4(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (fooPrinted.get()) {
                    fooCanPrint.await();
                }
                printFoo.run();
                fooPrinted.set(true);
                barCanPrint.signal();
            } finally {
                lock.unlock();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (!fooPrinted.get()) {
                    barCanPrint.await();
                }
                printBar.run();
                fooPrinted.set(false);
                fooCanPrint.signal();
            } finally {
                lock.unlock();
            }
        }
    }
}