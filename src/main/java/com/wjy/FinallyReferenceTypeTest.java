package com.wjy;

/**
 * 引用类型的finally代码块
 * @author wangjunyao
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年11月26日 18:23:00
 */
public class FinallyReferenceTypeTest {

    public static void main(String[] args) {
        Person person1 = test1();
        System.out.println("Person:{age = " + person1.age + ", name = " + person1.name + "}");
        Person person2 = test2();
        System.out.println(person2);
        Person person3 = test3();
        System.out.println("Person:{age = " + person3.age + ", name = " + person3.name + "}");
    }

    public static Person test1(){
        Person person = new Person();
        try{
            return person;
        }finally {
            person = null;
        }
    }

    public static Person test2(){
        Person person = new Person();
        try{
            return person;
        }finally {
            person = null;
            return person;
        }
    }

    public static Person test3(){
        Person person = new Person();
        try{
            return person;
        }finally {
            person.age = 100;
            person.name = "world";
        }
    }

    static class Person{
        int age = 10;
        String name = "hello";
    }
}
