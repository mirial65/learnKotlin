package com.example.kotlintest.fifthstage

import java.util.*
import kotlin.properties.Delegates

/**
 * Description : 委托
 * Time : 2020/9/15 20:00
 * Author : zengkun
 */

//延迟属性：指的是属性只在   第一次   访问时才会计算，之后会将之前的结果缓存起来供后续使用
//这里应该还要注意一点：by lazy只对val类型的属性有效
val myLazy: Int by lazy {
    println("init")
    30
}

//非空属性,适合于那些无法在初始化就确定属性值
class Person {
    //notnull方法返回的是一个ReadWriteProperty
    //notnull后面有一个泛型，但kotlin能自动推断出来
    //如果：Trying to read the property before the initial value has been assigned results in an exception
    var address: String by Delegates.notNull()
}

//可观测属性(observable)
class Person2 {
    var age: Int by Delegates.observable(20) { prop, oldValue, newValue ->
        println("${prop.name}, oldValue: ${oldValue}, newValue: $newValue")
    }
    var weight: Int by Delegates.vetoable(45) { _, oldValue, newValue ->
        when {
            //If the callback returns `true` the value of the property is being set to the new value
            //自己写的判断条件
            oldValue < newValue -> true
            else -> false
        }
    }
}

/*
    map委托
    一种常见的应用场景是将属性值存到map中
    在这种情况下，你可以将map实例作为委托，作为类中属性的委托
    注意： map中的key的名字要与类中属性的名字一样
    如果是读写属性'var'， 那么就要用到'MutableMap', 'MutableMapOf'
 */
class Person3(map: Map<String, Any?>) {
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

fun main() {
    println(myLazy)
    println(myLazy)
    println("-------")
    var person = Person()
    person.address = "beijing"
    println(person.address)
    println("-------")
    val person2 = Person2()
    person2.age = 30
    person2.age = 40
    println("-------")
    person2.weight = 50
    println(person2.weight)
    person2.weight = 30
    println(person2.weight)
    println("-------")
    val person3 = Person3(
        mapOf(
            //'to'是中缀表达式
            "name" to "zhangsan",
            "address" to "beijing",
            "age" to 20,
            "birthday" to Date()
        )
    )
    println(person3.name)
    println(person3.address)
    println(person3.age)
    println(person3.birthday)
}