package com.example.kotlintest.secondstage

/**
 * Description : 在jvm上，如果类的primary构造方法的所有参数都拥有默认值，那么kotlin编译器就会为这个类生成一个  不带参数  的构造方法
 * 这个构造方法会使用这些参数的默认值，这样做的目的是可以与主流的框架更好的集成
 * Time : 2020/8/13 11:30
 * Author : zengkun
 */

class Constructor3 constructor(
    //修饰符为private，则外部不能直接访问到这个属性；没有修饰符默认是public
    private var username: String = "zhangsan",
    private var age: Int = 20
) {
    //下面这句是错的，因为我在构造方法中己声明这个属性了
    // private val username = "afa"

    fun printInfo() {
        println("username: ${this.username}, age: ${this.age}")
    }
}

fun main() {
    val constructor3 = Constructor3()
    //这里会打印出默认值
    constructor3.printInfo()
    val constructor = Constructor3("wangwu", 30)
    constructor.printInfo()
}

