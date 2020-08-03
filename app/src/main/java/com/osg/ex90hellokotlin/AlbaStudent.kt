package com.osg.ex90hellokotlin

//주생성자 constructor 키워드 생략 가능
class AlbaStudent (name:String, age:Int, major:String, var task:String): Student(name, age, major){
    init {
        println("AlbaStudent 생성")
    }

    override fun show() {
        println("name : $name    age : $age    major : $major    task : $task")
    }

}