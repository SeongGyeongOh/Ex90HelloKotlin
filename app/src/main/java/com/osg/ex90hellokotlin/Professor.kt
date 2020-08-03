package com.osg.ex90hellokotlin

//보조생성자 사용 - java와 비슷한 느낌
class Professor : Person {
    var subject:String? = null

    //보조생성자
    //보조생성자는 파라미터로 멤버변수를 만들 수 없음(var 불가) -> 원래 우리가 알던 방법으로 만들어야 함
    constructor(name:String, age:Int, subject:String):super(name, age){ //부모클래스의 생성자도 여기서 호출
        this.subject = subject
        println("Professor 생성됨")
    }

    override fun show(){
        println("name : $name    age : $age    subject : $subject")
    }

}