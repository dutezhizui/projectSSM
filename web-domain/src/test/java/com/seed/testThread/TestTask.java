package com.seed.testThread;

import java.util.concurrent.*;

/**
 * Created by OL on 2017/2/17.
 */
public class TestTask {
    public static void main(String args[]){
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(10,10,2222, TimeUnit.MICROSECONDS,new LinkedBlockingDeque<>());

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        
        System.err.println(Thread.currentThread().getName());
        for (int i=0;i<30;i++){
            Task task=new Task("Tom",i);
            Future future=executorService.submit(task);
            Thread.yield();
        }
        System.exit(0);
    }
}
