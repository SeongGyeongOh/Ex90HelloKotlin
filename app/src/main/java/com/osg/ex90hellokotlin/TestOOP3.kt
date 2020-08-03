package com.osg.ex90hellokotlin

fun main(){
    //안드로이드에서 제일 많이 사용되는 이너클래스 & 인터페이스 & 익명클래스

    //1. 이너클래스는 아웃터 객체만 생성할 수 있다
    val obj = AAA()
    val obj2 = obj.getBBBInstance()

    obj2.show()

    //2. 인터페이스(추상메소드만 보유하는 클래스)
//    val obj3 = ClickListener//인터페이스는 직접 객체 생성 불가(이름밖에 없음)
    //인터페이스를 사용하려면 인터페이스를 구현한 클래스를 만들어서 그 클래스 안에서 인터페이스의 추상메소드를 오버라이드 해야함함
    val obj3 = Clicker()
    obj3.onClick()

    //3. 익명클래스(Java와 문법이 아예 다름 : object키워드 사용)
    val obj4 = object : ClickListener{  //괄호 없음
        override fun onClick() {
            println("Anonymous class onClick")
        }
    }

    obj4.onClick()

}



//2. 인터페이스
interface ClickListener{
    //추상메소드
    fun onClick()
}

//인터페이스 구현 클래스 ( class 클래스명 : 인터페이스    -> 상속과 동일)
class Clicker : ClickListener{
    override fun onClick() {
        println("click!")
        println()
    }

}



//1. inner class
class AAA{
    var a:Int = 0
    fun show(){
        println("AAA의 show")
        println()

    }

    fun getBBBInstance():BBB{
        val obj = BBB() //아웃터는 이너객체 생성 가능능
        return obj
    }

    //이너클래스 : 아웃터의 멤버를 내 것인양..
    //자바와 다르게, inner키워드가 없으면 아웃터의 멤버를 내것인양 가져다 쓸 수 없음
    inner class BBB{
        fun show(){
            println("아웃터 클래스의 프로퍼티(멤버변수)값 출력 a : $a")

            //이너 안에서 아웃터의 this 사용
            this@AAA.show()
        }
    }

}