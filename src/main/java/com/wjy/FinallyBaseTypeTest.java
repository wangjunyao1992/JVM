package com.wjy;

/**
 * 基本类型的finally语句块
 * @author wangjunyao
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月26日 17:08:00
 */
public class FinallyBaseTypeTest {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(test1(num));//第一个输出
        System.out.println(test2(num));//第二个输出
    }

    public static int test1(int a){
        try{
            a += 20;
            return a;
        }finally {
            a += 30;
            return a;
        }
    }

    public static int test2(int b){
        try{
            b += 20;
            return b;
        }finally {
            b += 30;
            System.out.println(b);//第二个输出
        }
    }
}
