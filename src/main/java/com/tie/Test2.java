package com.tie;

public class Test2 {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("测试");

        String s = threadLocal.get();

        new Thread(){
            @Override
            public void run() {
                String s1 = threadLocal.get();
                System.out.println(Thread.currentThread().getName() + ":" +s1);
            }
        }.start();
    }
}
