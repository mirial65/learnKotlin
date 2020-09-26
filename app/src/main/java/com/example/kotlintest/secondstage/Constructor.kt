package com.example.kotlintest.secondstage

import java.util.*

/**
 * Description : 正式介绍kotlin面向对象的特性
 * Time : 2020/8/13 10:38
 * Author : zengkun
 */

/*
  怎么对类实例化呢? 注意kotlin中是没有new关键字的,只需要去掉new
 */
fun main() {
    //没有new关键字
    val constructor = Constructor("zhangsan")
    println(constructor.username)
}

/*
    在kotlin中，一个类可以有一个primary构造方法，及一个或多个secondary构造方法
    primary构造方法，可以有若干参数，初始化是写在init代码块中 或者 可以是赋值给类中的属性
    如果primary构造方法没有任何 注解 或者是  可见性的修饰符  ，则constructor关键字可省略，注意：不是属性有没有修饰符
    注意：构造方法中的参数一定要有类型
 */
class Constructor (username: String) {
    val username = username.toUpperCase(Locale.CHINA)

    //初始化代码块，用于初始化
    // 可以使用primary构造方法中的参数
    init {
        //请注意这里，两个username指的不是同一个
        println(username)
        //this指当前对象
        println(this.username)
    }
}

