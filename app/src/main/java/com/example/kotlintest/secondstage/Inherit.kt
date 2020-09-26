package com.example.kotlintest.secondstage

/**
 * Description : 关于继承：属性和方法都能够被重写，而java中属性是不能被重写的。
 * Time : 2020/8/13 11:59
 * Author : zengkun
 */

/*
    在kotlin中，所有类在默认情况下都是无法继承的;换句话说，在kotlin中，所有类在默认情况下都是final类
    open关键字的含义和final是相反的
 */
open class Animal(private var name: String) {
    private var age: Int = 20

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    //open代表可以重写这个方法
    open fun name() {
        println("animal's name")
    }

    //如果没有open关键字，子类会自动实现父类的这个方法，这和java一样
    fun age() {
        println("animal's age")
    }

    //不允许这个方法被重写,默认不能被重写
    fun eat() {
        println("animal eat")
    }

    //属性,类型 val
    open val weight = "animal's weight"
}

//继承Animal类，注意参数是从Cat传到Animal中
open class Cat(private var name: String) : Animal(name) {
    //override关键字表示重写这个方法
    override fun name() {
        super.name()
        println("cat's name: ${this.name}")
    }

    //val 可以 重写 al
    //var 可以 重写 val, val 不可以 重写 var
    //val相当于get方法，var相当于set，get方法
    override var weight: String = "cat's weight is 5kg"
}

//继承Cat类
class WhiteCat(name: String) : Cat(name) {
    //如果它的父类的name方法  有显式的final修饰符，那么就不能重写这个方法了
    override fun name() {
        super.name()
    }
}

fun main() {
    val cat = Cat("jerry")
    //这里只有name方法被继承了
    cat.name()
    cat.eat()
    cat.age()
    println(cat.weight)
}