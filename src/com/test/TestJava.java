package com.test;

/**
 * Created by windSnow on 2018/11/4.
 */
public class TestJava {
    public void run() {
        System.out.println("run1");
    }
    public static void main(String[] args) {
        System.out.println("TestJava");
        TestJava t = new TestJava();
        t.run();
        t.run2();
    }
    public void run2() {
        System.out.println("run43");
    }
}
