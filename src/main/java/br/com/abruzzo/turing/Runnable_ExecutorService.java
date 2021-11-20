/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abruzzo.turing;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author emmanuel
 */
public class Runnable_ExecutorService {
    
    
    public static void foo(String[] args) {


        AsyncPrintFooBarAlternately_1 printFooBar = new AsyncPrintFooBarAlternately_1(3);

        Runnable printFoo = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };


        Runnable printBar = new Runnable() {
            @Override
            public void run() {
                System.out.println("bar");
            }
        };

        printFoo.run();
        printBar.run();
        executeTask(printFoo);
        executeTask(printBar);


        //--------------------------------------------------------------------------------------

        AsyncPrintFooBarAlternately_3 asyncPrint = new AsyncPrintFooBarAlternately_3(3);

        try {
            asyncPrint.foo(printFoo);
            asyncPrint.bar(printBar);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    //------------------------------------------------------------------------------------------

        AsyncPrintFooBarAlternately_4 asyncPrint4 = new AsyncPrintFooBarAlternately_4(4);

        try {
            asyncPrint4.foo(printFoo);
            asyncPrint4.bar(printBar);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    public static void executeTask(Runnable task) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(task);
        executorService.shutdown();
    }


    static void streams(){
        List<String> countries = Arrays.asList("Germany", "England","China", "Denmark", "Brazil","France", "Australia");
        Optional<String> cname = countries.stream().reduce((c1,c2)->c1.length()>c2.length() ? c1:c2);
        cname.ifPresent(System.out::println);
        String a = null;
        System.out.println(a);

    }
    
    
}
