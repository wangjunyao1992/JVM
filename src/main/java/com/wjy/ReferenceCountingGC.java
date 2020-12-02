package com.wjy;

/**
 * -XX:PrintGC  ：  控制台打印GC日志
 * testGC()方法执行后，objA和objB会不会被回收呢？
 * @author wangjunyao
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年12月02日 11:41:00
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC(){
        ReferenceCountingGC objA = new ReferenceCountingGC();

        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }

}
