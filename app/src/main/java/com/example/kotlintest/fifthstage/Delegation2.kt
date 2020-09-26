package com.example.kotlintest.fifthstage

import kotlin.reflect.KProperty

/**
 * Description : 委托属性(delegation property)
 * 有四种情况在实际开发中比较有用
 * 1. 延迟属性
 * 2. 可观测属性
 * 3. 非空属性
 * 4. map属性
 * Time : 2020/9/15 19:35
 * Author : zengkun
 */
/*
    委托转换规则：
    比如说：对于某个属性prop，Kotlin编译器所生成的隐含的属性名为prop$delegate的属性，然后对原有的prop属性的访问都
    委托给了Kotlin编译器所生成的这个属性
 */

//public final class MyProperty {
//   // $FF: synthetic field
//   static final KProperty[] $$delegatedProperties = new KProperty[]{(KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(MyProperty.class), "str", "getStr()Ljava/lang/String;"))};
//   @NotNull
//   private final MyDelegate str$delegate = new MyDelegate();
//
//   @NotNull
//   public final String getStr() {
//      return this.str$delegate.getValue(this, $$delegatedProperties[0]);
//   }
//
//   public final void setStr(@NotNull String var1) {
//      Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
//      this.str$delegate.setValue(this, $$delegatedProperties[0], var1);
//   }
//}
class MyProperty {
    //属性的set和get方法会委托给MyDelegate
    var str: String by MyDelegate()

}

/*
    自定义的委托类
 */
class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        "${thisRef}, your delegated property is ${property.name}"

    //哪一个类，哪个属性，替换成什么值
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef, new value is $value")
    }
}

fun main() {
    val myProperty = MyProperty()
    myProperty.str = "zhangsan"
    println(myProperty.str)
}