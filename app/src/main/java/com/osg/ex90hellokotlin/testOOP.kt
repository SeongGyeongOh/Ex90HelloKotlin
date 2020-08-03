package com.osg.ex90hellokotlin

//언제나 시작은 main부터~
fun main(){
    //1. 클래스 선언 및 객체 생성 : new 키워드가 사라짐
    var obj = MyClass()
    obj.show()

    //1.1 다른 .kt 파일에 class 만들기 (확장자는 .kt)
    var obj2 = MyKtClass()
    obj2.show()

    //2. 생성자 - 많이 다름..
    // 코틀린에 생성자는 2종류가 있음 - 주생성자, 보조생성자
    //2.1 주생성자 : Primary constructor
    var s = Simple() //생성자 호출~

    //2.2 주생성자의 값들 전달하기 (주생성자는 오버로딩이 안됨!)
    var s2 = Simple2(10, 20)
    s2.show()

    //2.3 생성자 오버로딩을 구현하고싶다면?
    // 보조생성자Secondary 사용(c 또는 java와 흡사함)
    var s3 = Simple3()//주생성자가 없으면 보조생성자가 알아서 발동함
    println()
    var s4 = Simple3(10)// 오버로딩 함수 호출
    println()

    //2.4 주생성자와 보조생성자 동시 사용(주생성자를 만들어놓고 나중에 오버로딩을 하고싶다면..)
    var s5 = Simple4()
    println()
    var s6 = Simple4(100) //오버로딩된 보조생성자가 호출됨 - 이녀석은 주생성자도 무조건 같이 불른다

    //참고
    var s7 = Simple5()

}



//2.4 주생성자 보조생성자 동시 사용
class Simple4 constructor(){
    init {
        println("Simple4 init")
    }
    //보조생성자를 추가하고 싶다면..명시적으로 주생성자를 호출하는 코드가 옆에 있어야함
    constructor(num:Int):this(){
        println("Simple4 Secondary Constructor")
        println()
    }
}

//2.3 보조생성자 : constructor()블럭 구현
//보조생성자를 구현해도 주생성자는 원래 존재함!
class Simple3{
    init {
        println("Simple3의 Primary 생성자로 객체를 처음 만들때 무조건 실행된다^^")
    }
    //보조생성자
    constructor(){
        println("Simple3의 Secondary 생성자")
    }
    //보조생성자는 Overloading이 가능함 (보조생성자는 var 키워드로 한번에 멤버변수로 만드는건 불가능함. 오직!! 주생성자에서만 가능함)
    constructor(num:Int){
        println("Simple3의 Secondary 생성자 : 매개변수로 받아온 $num")
    }

}

//2.2 주생성자 파라미터 받기(오버로딩은 안됨, 즉 파라미터 있는것과 없는것 두 개의 생성자를 만들 수가 없음)
class Simple2 constructor(var num:Int, num2:Int){ //(var num:Int) var 키워드를 사용하면 매개변수가 아니라 멤버변수!즉 받아오는 즉시 멤버변수화 시킴 (지금 뒤에 num2)는 매개변수임!!
    init {
        println("Simple2 생성")
        println("num: $num")
        println("num2: $num2") //생성자 안이라 매개변수(주생성자 지역변수) num2 인식 가능
    }

    fun show(){
        println("show 메소드 num : $num") //num이 매개변수가 아니라 멤버변수임을 확실히! 알 수 있다
        //println("show method num2 : $num2")//파라미터로 받아온 num2는 멤버가 아니라 매개라 불가능함
    }

    //멤버변수에 매개변수값 대입을 생성자 블록에서 안해도 괜찮음
    var n:Int = num2 //변수 대입하듯이 주생성자의 매개변수 대입 가능
}



//2-1. 주생성자 : 클래스명 옆에 constructor()라고 명시...?
class Simple constructor(){
    //주생성자는 중괄호가 없어서 코드를 작성할 수가 없다
    //주생성자를 위한 별도의 초기화 블록이 존재함 - init{}
    init {
        println("Simple 주생성사 실행!")
        println()
    }

}


//1. 클래스 선언 (기본 모습은 비슷한데, 멤버변수(Field)를 Property(속성)이라 부른다)
class MyClass{
    //멤버변수(Property) - 반드시 초기화가 되어있어야 함
    var a:Int = 10

    //메소드 : 용어 변경 없음(클래스 밖에 있으면 함수, 안에 있으면 메소드, 그냥 둘 다 함수라고도 함)
    fun show(){
        println("show : ${a}")
        println()
    }
}


//참고 : constructor 키워드는 특별한 접근제한자나 어노테이션이 없다면 생략이 가능ㅎ하다
class Simple5 () {
    init{
        println("Simple5 주생성자")
    }

}