package com.osg.ex90hellokotlin

fun main(){
    //코틀린의 상속
    var obj=Second()
    obj.show() //오버라이드된 Second의 show()가 출력됨

    //상속의 최종 연습
    val p = Person("sam", 20)
    p.show()

    val s = Student("robin", 29, "Android")
    s.show()

    val pro = Professor("hong", 50, "optimization")
    pro.show()

    val alba = AlbaStudent("kim", 26, "Java", "management")
    alba.show()
}

//상속해줄 부모 클래스
//상속해주는 부모 클래스는 반드시!! open 이라는 키워드 사용 (나를 상속해 주겠다는 의미)
//즉, open이 없으면 자바의 final 클래스와 같은 것이 된다(상속 불가)
open class First{
    var a:Int=10

    //오버라이드 해줄 메소드는 반드시 open키워드가 있어야 한다(즉, open이 없으면 자바의 final 메소드와 동일)
    open fun show(){
        println("a : $a")

    }
}

//상속 문법 - class 클래스명 : 부모클래스(){} <- 부모클래스명 뒤에 주생성자 호출() 필수 주의!
class Second : First(){
    var b:Int=20

    //상속받은 메소드의 기능을 변경하고 싶을 때 - 오버라이드 (기존 메소드와 같은 이름과 파라미터로 만든 메소드)
    //오버라이드를 하려면 반드시 override 키워드 추가
    override fun show(){
        //부모 출력은 부모가 알아서 하자
        super.show()
        println("b : $b")
    }
}

