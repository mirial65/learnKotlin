package com.example.kotlintest.fourthstage

/**
 * Description : 内部类（Inner class）,使用inner关键字，相当于Java中的非静态内部类
 * 内部类会持有外部类的引用，所以能访问到外部类的属性，而嵌套类不行
 * Time : 2020/8/17 14:35
 * Author : zengkun
 */


class Outer2 {
    private var str: String = "hello world"

    inner class Inner {
        private var str: String = "内部类"
        fun method():String {
            val str: String = "局部变量"
            //this@Outer2 表示的是Outer的一个对象
            //Java是这样的: Outer.this.str
            println(this.str)
            println(str)
            return this@Outer2.str;

        }
    }
}

fun main() {
    val inner: Outer2.Inner = Outer2().Inner()
    println(Outer2().Inner().method())
}