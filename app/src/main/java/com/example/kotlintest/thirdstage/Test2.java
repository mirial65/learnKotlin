package com.example.kotlintest.thirdstage;

/**
 * Description : 协变与逆变的测试
 * PECS: Producer Extends, Consumer Super
 * Time : 2020/9/14 15:13
 * Author : zengkun
 */
public class Test2 {
    public static void main(String[] args) {
       /*
        List<String> list = new ArrayList<>();
        List<Object> list2 = list;
        list2.add(3);
        String str = list2.get(0); //假设上面那行代码成立，那么这一行就是错误的，因为不能把Object赋给String的对象，除非强转
        */


//        List<Cat> cats = new ArrayList<>();
//        //这样赋值是成立的，这就是协变(只能读取，不能写入)
//        List<? extends Animal> animals = cats;
//        animals.add(new Cat());  //这行为什么是错的， 因为我并不知道'?'是什么类型，我只知道它是Animal及以下。而且既然能add cat， 那么也应该能add dog， 那么get时，得到的是cat还是dog呢？/

        /*
        List<Animal> animals = new ArrayList<>();
        //这样赋值是成立的，这就是逆变(只能写入，不能读取)
        //'?'代表Animal及以上的类型
        List<? super Animal> list2 = animals;
        list2.add(new Cat()); //这里Cat类明显在Animal类型以下，为什么也可以，因为这里用了多态
        list2.add(new Object()); //这里为什么不行呢？因为list2真正指向的是Animal类型的，并没有上升到Object层次
        Animal animal = list2.get(0); //和上面协变的add，错误的原因差不多，因为我并不知道'?'是什么类型，我只知道它是Animal及以上。并不一定是Animal类型
        Object object = list2.get(0);
        */
    }
}

class Animal {

}
class Cat extends  Animal{

}
class  Dog extends Animal{

}