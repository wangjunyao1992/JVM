package com.wjy;

/**
 * jps
 * jstack pid
 * @author wangjunyao
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年12月25日 16:13:00
 */
public class LockTest {

    public static final Object lock = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                synchronized (lock){
                    System.out.println("获得锁");
                }
            }
        }).start();
        synchronized (lock){
            System.out.println("main...");
            while (true){}
        }
    }



}
