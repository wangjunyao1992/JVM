package com.wjy;

/**
 * @author wangjunyao
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月27日 11:00:00
 */
public class TestString {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = "hel" + "lo";
        String d = new String("hello");
        String e = "hel";
        String f = "lo";
        String g = e + f;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == g);
    }

}
