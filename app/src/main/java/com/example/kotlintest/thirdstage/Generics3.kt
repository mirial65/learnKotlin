package com.example.kotlintest.thirdstage

/**
 * Description :  上一个例子可能不是很清楚
 * Time : 2020/9/14 14:45
 * Author : zengkun
 */

/*
    协变,只将泛型类型作为方法的**返回类型**，而不能作为方法的  参数  类型
 */
class Fruit<out T>(private var name: T) {
    fun get(): T =  this.name
}
/*
    逆变,只将泛型类型作为方法的**参数类型**，而  不能  作为方法的  返回  类型
 */
class Fish<in T>(private var age: T) {
    fun set(t: T) {
        this.age = t
        println("age = ${age}岁")
    }

}
fun main() {
    val fruit1 = Fruit("apple")
    val fruit2: Fruit<Any> = fruit1
    println(fruit2.get())
    println("----------")
    val fish1 = Fish<Number>(10)
    val fish2: Fish<Int> = fish1
    fish2.set(10)
}