package com.example.kotlintest.fourthstage

/**
 * Description : 嵌套类 (nested class)， 相当于Java中的静态内部类
 * Time : 2020/8/17 14:27
 * Author : zengkun
 */

//public final class Outer {
//   private final String string = "hello world";

//   public static final class Nested {
//      private int a = 5;
//
//      @NotNull
//      public final String method() {
//         return "welcome";
//      }
//
//      public final int getA() {
//         return this.a;
//      }
//
//      public final void setA(int var1) {
//         this.a = var1;
//      }
//   }
//}
class Outer {
    private val string: String = "hello world"

    class Nested {
        fun method() = "welcome"
        var a = 5
    }
}

fun main() {
    //注意它的类型
    val nested: Outer.Nested = Outer.Nested()
    println(Outer.Nested().method())
}