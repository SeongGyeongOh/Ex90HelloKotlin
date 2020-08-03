package com.osg.ex90hellokotlin

//상속받아온 name과 age는 매개변수로 전달만 받고, 직접 받을 major은 멤버변수로..
open class Student constructor( name:String?, age:Int, var major:String?) : Person(name, age){
    init {
        println("Student클래스가 만들어 졌습니다")
    }

    //override 키워드 주의하기 (override는 자동 open)
    override fun show(){
//        super.show()
        println("name : $name    age : $age    major : $major")
    }
}