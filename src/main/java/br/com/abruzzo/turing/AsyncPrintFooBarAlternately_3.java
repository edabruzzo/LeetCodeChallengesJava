package br.com.abruzzo.turing;

public class AsyncPrintFooBarAlternately_3 {

    private int n;
    boolean isFooPrintChance = true;

    public AsyncPrintFooBarAlternately_3(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if(isFooPrintChance) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                isFooPrintChance = false;
                notify();
            } else {
                wait();
                i--;
            }
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if(!isFooPrintChance) {
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                isFooPrintChance = true;
                notify();
            } else {
                wait();
                i--;
            }
        }
    }
}

