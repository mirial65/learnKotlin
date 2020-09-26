package com.example.kotlintest.fourthstage;

/**
 * Description :
 * Time : 2020/9/15 15:13
 * Author : zengkun
 */

public class Test {
    private  ObjectExp2 myTest2() {
        return new ObjectExp2() {
            @Override
            public void addOtherMethod() {

            }

            public void myPrint2() {
                String var1 = "myPrint2 invoked";
                System.out.println(var1);
            }
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.myTest2().myPrint2();
    }
}