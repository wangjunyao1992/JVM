package com.wjy;

/**
 * @author wangjunyao
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月24日 22:00:00
 */
public class TestPlusPlus {

    public static void main(String[] args) {
        test1(); //   9
        test2(); //   8
        test3(); //   9
    }

    public static void test1(){
        int i = 8;
        i = i + 1;
        System.out.println(i);
    }

    public static void test2(){
        int i = 8;
        i = i++;
        System.out.println(i);
    }

    public static void test3(){
        int i = 8;
        i = ++i;
        System.out.println(i);
    }

}
