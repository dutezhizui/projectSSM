package com.seed.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by OL on 2017/7/19.
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
