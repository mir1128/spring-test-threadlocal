package com.loobo.utils;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class HelloThreadLocal {
    private ThreadLocal<String> threadLocal = new ThreadLocal<>().withInitial(() -> new String("init"));

    public String get() {
        return threadLocal.get();
    }

    public void set() {
        System.out.println(threadLocal.get());
        threadLocal.set(Thread.currentThread().getName());
        int a = 0;
    }
}
