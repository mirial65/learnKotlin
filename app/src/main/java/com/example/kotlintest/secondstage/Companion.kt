package com.example.kotlintest.secondstage

/**
 * Description : kotlin中伴生对象（很重要）的讲解，主要是针对于kotlin中没有static关键字，主要就是用来编写单例的
 * 使用伴生对象实际上是在这个类内部创建了一个名为Companion的静态单例内部类，
 * 伴生对象中定义的属性会直接编译为  外部类  的静态字段，而函数会被编译为  伴生对象  的方法。
 * Time : 2020/8/13 17:18
 * Author : zengkun
 */

/*
    字节码文件
 */
//public final class MyTest {
//   private static int a = 10;
//   public static final MyTest.Companion Companion = new MyTest.Companion((DefaultConstructorMarker)null);

//   public static final class Companion {
//      public final int getA() {
//         return MyTest.a;
//      }
//
//      public final void setA(int var1) {
//         MyTest.a = var1;
//      }
//
//      public final void method() {
//         String var1 = "method invoked";
//         boolean var2 = false;
//         System.out.println(var1);
//      }
//
//      private Companion() {
//      }
//
//      // $FF: synthetic method
//      public Companion(DefaultConstructorMarker $constructor_marker) {
//         this();
//      }
//   }
//}


//companion object   伴生对象，每一个类只允许有一个伴生对象
// 伴生对象在编译后生成一个静态内部类
//在kotlin中，与java不同的是，类是没有static方法的
//注意：虽然伴生对象的成员看起来像java中的静态成员，但在运行期，他们依旧是真实对象的成员 --> 看它的字节码文件
//在JVM上，可以将伴生对象的成员真正生成类的静态方法与属性，这是通过@JvmStatic注解来实现的
//在字节码表示为:    @JvmStatic
//                  public static final void method() {
//                      Companion.method();
//                  }
class MyTest {
    //如果不提供伴生对象的名字，那么编译器就会提供一个默认的名字，Companion
    companion object {
        var a: Int = 10

        @JvmStatic
        fun method() {
            println("method invoked")
        }
    }
}

fun main() {
    val c = C()
    c.method()
    println("--------")
    //直接通过类名调用
    println(MyTest.a) //类似于静态属性
    MyTest.method() //类似于静态方法
    println("--------")
    val v = MyTest.Companion
    println("--------")
    println(v::class.java)
}
