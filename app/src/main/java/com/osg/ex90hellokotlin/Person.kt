package com.osg.ex90hellokotlin

//주생성자 파라미터에 var 키워드를 삽입하면 바로 멤버변수가 됨
open class Person constructor(var name:String?, var age:Int) {
    init {
        println("Person클래스 성성")
    }

    open fun show(){
        println("name : $name    age : $age")
    }
}