package com.test;

/**
 * Created by windSnow on 2018/11/4.
 */
public class TestJava {
    public void run() {
        System.out.println("hello run");
    }
    public static void main(String[] args) {
        System.out.println("nihao");
        TestJava t = new TestJava();
        t.run();
    }
}
