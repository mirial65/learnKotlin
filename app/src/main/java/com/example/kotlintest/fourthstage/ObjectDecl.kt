package com.example.kotlintest.fourthstage

/**
 * Description :
 * Time : 2020/9/15 19:06
 * Author : zengkun
 */

//对象声明，会得到一个对象
/*
    关于对象表达式和对象声明的区别
    1.对象表达式时立刻初始化或是执行的
    2.对象声明式延迟初始化的，在首次访问的时候进行
    3.伴生对象是其所对应的类被加载时初始化的，对应于java的静态初始化代码块
 */
object MyObject{
    fun method() = "hello world"
}

fun main() {
    println(MyObject.method())
}