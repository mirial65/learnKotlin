package com.example.kotlintest.secondstage

/**
 * Description : primary与secondary构造方法的关系
 * Time : 2020/8/13 11:01
 * Author : zengkun
 */

/*
    在这个primary构造方法中的参数表示类中的属性，而不仅仅是一个参数，就是说，能这么访问到username：
    /*
        println(this.username)
    */
    有时候不希望外部直接访问构造方法(也就是不希望在其他类中对它实例化)，可以在primary构造方法前加一个private修饰符
 */
class Constructor2 constructor(private var username: String) {
    //java可以不用初始化变量,因为java的变量是有默认值的;而kotlin必须初始化属性
    private var age: Int
    private var address: String

    //java中是自动初始化，而kotlin中是把构造方法和初始化分开了
    init {
        age = 20
        address = "wuhan"
    }

    fun printUserName() {
        println(this.username)
    }
    //secondary构造方法必须直接或间接调用primary构造方法，加上":"表示
    //调用到primary构造方法时，有些参数的值会被覆盖
    //this中的参数名字要和primary构造方法中的参数名字一样
    constructor(username: String, age: Int) : this(username) {
        this.age = age
        this.address = "shanghai"
    }

    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
    }

    //用字符串模板打印出来
    fun printInfo() {
        println("username: $username, age: $age, address: ${this.address}")
    }
}

fun main() {
    //注意实例化是没有new的
    val person1 = Constructor2("zhangsan")
    val person2 = Constructor2("lisi", 20)
    val person3 = Constructor2("wangwu", 21, "beijing")
    person1.printInfo()
    person2.printInfo()
    person3.printInfo()
}