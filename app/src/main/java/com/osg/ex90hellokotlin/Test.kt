package com.osg.ex90hellokotlin

import android.widget.Toast

//코틀린 언어 기초문법

//문법적 주요 특징
//      1. 문장의 끝을 나타내는 ; 을 사용하지 않는다(써도 무시됨)
//      2. 변수를 만들 때 자료형을 사용하지 않는다. 대신에 var라는 키워드를 사용한다. (자료형이 없는 것은 아님!!, 자동 형변환도 안됨, 즉 정적타입언어)
//      3. kotlin은 함수형 언어이다 : 함수를 객체처럼 사용-> 변수에 저장(참조), 파라미터로 넘겨주는 등 작업 가능. (객체지향 X)

//1) 프로그램의 시작함수인 main함수 존재
//2) 함수를 정의할 때 리턴타입 위치에 'fun(function)' 키워드를 사용함
fun main(){

    //3) 화면 출력
    println("Hello Kotlin")
    println(10)
    println(10.5)
    println('A')
    println(true)
    println(5+3)
    println()



    //4) 자료형과 변수
    //4-1) 기본 자료형 : Boolean, Char, Byte, Short, Int, Long, Float, Double, String, Any(Java의 Object와 비슷)
    //                  | 기본적으로 모든 변수가 객체임 - 즉, 모든 변수가 참조변수

    //4-2) 변수 선언 문법( var키워드) : ;가 없어서 변수의 초기화가 없으면 에러(변수가 끝났는지 판단이 불가능함)
    var a = 10
    var b = 10.5
    var c = 3.14f
    var d = "즐거운 하루"
    var e = true
    //주의! 자료형이 없는 게 아니라 값이 대입되는 순간 자료형이 결정됨!
    //변수니까 값 변경도 가능!
    a = 20
    b = 20.5
    println(a)
    println(b)
    println()
    //자료형이 있기 때문에 다른 자료형은 대입 불가능함 - 큰 자료형에 작은 자료형(double에 int)도 불가능함!! 즉, 자동 형변환 개념이 존재하지 않음
    //b = 20 에러

    //명시적 형변환은 가능 - () 문법은 없음 .toXXX()로 변환
    a = 3.14.toInt()
    b = 5.toDouble()
    println(a)
    println(b)
    println()

    //자료형은 변수 선언시에 명시할 수도 있음
    var a2:Int = 10
    var b2:Double = 3.14
    var c2:Boolean //자료형을 명시하면 초기화를 안해도 됨
    println(a2)
    println(b2)
    println()
    //println(c2) //에러. 초기화 되어있지 않으면 쓰레기값 에러

    //좀 특별한 정수 표현식
    var a3 = 10_000_000 //자리수 표기법

    //화면 출력 format 만들기
    println("이름 : " + a)
    //println(10 + "aaa") //+를 쓴다고 정수가 자동으로 String이 되지 않음
    println(10.toString() + "aaa") //정식 표현
    println("aaa" + 10) //문자열이 먼저 있으면 가능
    println(""+ 10+ "aaa") //꼼수

    //즉, 이런 특징으로 인해 정수 숫자 2개 덧셈식 출력하는 것
    var num1 = 10
    var num2 = 20
    //println(num1 + " + " +  num2 + " = " +(num1+num2)) //안됨
    println(num1.toString()+"+"+num2.toString() + "  = "+ (num1+num2)) //정식 표기법
    println("" + num1 +" + " + num2 + " = " + (num1+num2)) //꼼수 1
    println("$num1 + $num2 = ${num1+num2} ") //마치 php처럼... 훨씬 편함!!!
    println()

    //종함하면
    var name ="sam"
    var age = 20
    println("이름 : $name \n나이 : $age")
    println()

    //Any타입 : 타입이 없음, 아무거나
    var v:Any
    v = 10
    println(v)
    v= 10.5
    println(v)
    v='A'
    println(v)
    v="hello"
    println(v)
    println()
    //좋아보이지만.... 코드가 길어지면 구분하기 어려워진다(자료형을 특정하기 어려운 경우 필요할 때는 쓰되, 선호하지는 말 것)

    //****null값에 대한 특이점****
    var n= null
    println(n)

    //자료형을 명시하는 null값 지정은 안됨 (null도 자료형으로 인지가 됨)
    //var n2:Int = null //에러
    //var s:String = null //역시 에러

    //null을 저장하고 싶으면 그것을 말해줘야 함 (null을 가질 수 있다!)
    var n3:Int? = null
    var s2:String? = null
    println(n3)
    println(s2)

    //상수
    val N = 10
    //N=50 //에러!
    //상수에 자료형을 사용하면 다음에 값을 넣어도 됨
    val K:Int
    K = 100
    //K=200 //ERROR



    //5. 연산자 특이점
    //   숫자 타입들 간에는 자동 형변환이 일어남 (작은->큰)
    println()
    println(10 + 3.14)
    //숫자가 아닌 자료형과는 자동형변환 안됨
    //println(10+true)//ERROR
    //println(10+ 'A') //ERROR (c에서는 됐었음!!)

    //새로운 연산자 is (자료형 검사)
    var n4 = 10
    if(n4 is Int){
        println("n4 는 정수입니다")
    }

    //다른 자료형 검사는 안됨
    //if(n4 is String){    } //물어보는 것 자체가 ERROR
    //의미가 없어 보이지만..Any 타입일 때 효과가 있다
    var obj:Any
    obj = 10
    if(obj is Int) println("$obj 는 Int")
    if(obj is Double) println("$obj 는 Doubld")
    println()

    //마치 자바의 Instanceof 처럼..


    //사용자 정의 클래스
    class Person{
        //코틀린에서는 멤버변수라는 표현 ㄴㄴ, 멤버변수를 '속성(Property)'이라 말함
        var name = "robin"
        //var age:Int //ERROR, property( 멤버변수)는 자료형 명시와 상관없이 반드시 초기화가 되어있어야 함
        var age:Int = 30

    }

    //객체 만들기!! new 키워드가 아예 없음!!!
    var p = Person()
    if(p is Person){
        println("이름 : ${p.name} \n나이 : ${p.age}")
    }

    obj = Person() //객체 생성 (obj는 위에서 만든 Any타입)
    if(obj is Person){}
    println()



    //6. 제어문 변경사항
    //6-1) 삼항 연산자가 없음
    //var str = (10>5) ? "aaa" : "bbb"// 연산자 존재 ㄴㄴㄴ
    //대신, if문을 삼항연산자처럼..
    var str = if(10>5) "aaa" else "bbb"
    println(str)

    str = if(10>5){
        "aaa"
        println("과연 str에는 어떤 값이 들어갈까요?")
        "kkk" //여러 줄이 있으면 마지막 값이 들어감..
    }else{
        "bbb"
    }
    println(str) //출력값 kkk
    println()

    //이런 특징때문에 if문을 코틀린에서는 제어문의 범주에 넣지 않음 (기존 방법 + 새로운 방법)
    //'if 표현식' 이라고 말한다

    //6-2) switch 문법이 사라짐 - when절로 대체
    var h:Any?=null
//    h=10
//    switch(h){
//        case 10:
//        break;
//    }                 ERROR!!

    //이것을 대신해주는 녀석 -> when
    var n5 = 30
    h = 100
    when(h){
        10-> println("aaa")
        20-> println("bbb")
        //자료형이 다른 것도 동시체크 가능
        "Hello"-> println("ccc")
        true -> println("ddd")

        n4-> println("eee") //변수명을 when문에 넣는 것 가능!

        //두 개 이상의 조건을 묶을 수도 있음
        40, 50 -> println("fff") //40 또는 50일 때 조건에 걸림

        //default 같은 역할 [여러줄이면?
        else -> {
            println("조건에 걸린게 없습니다")
            println("중괄호로 여러 줄도 가능!")
        }
    }

    //when을 특정 수식으로 제어 가능 : 수식 비교할 때는 ()가 없어야 함
    h = 85
    when{
        h>=90 && h<100 -> println("A 학점")
        h>=80 -> println("B 학점")
        h>=70 -> println("c 학점")
        h>=60 -> println("e 학점")
        h>=50 -> println("e 학점")

        else -> println("F 학점")
    }
    println()

    //when도 if문처럼 변수에 저장 가능함 :  else가 필수임!!
    h=20
    var result = when(h){
        10 -> "nice"
        20 -> "Hello"

        else -> "Good"
    }
    println(result)
    println()

    //when에서 is연산자 사용 가능
    when (h){
        is Int -> println("it is type Int")
        is Double -> println("it is type Double")

    }
    println()

    //6-3) 반복문 다 바뀜
    //for(var i=0;i<4;i++) //에러
    //  for-each문과 비슷하게 써야함
    for (i in 0..5){ //0부터 5까지 찍어라
        println(i)
    }
    println()

    //for ()안에는 지역변수, 위의 변수명과 겹쳐도 상관 없음
    for (a in 3..10){
        println(a+1)
    }
    println()

    // 반복문을 마지막 숫자 전까지만 하고싶다면? ex (i<5)
    for (i in 0 until 10){
        println(i)
    }
    println()

    //2씩 증가
    for(i in 0..10 step 2){ //2씩 스텝을 뛰어라
        println(i)
    }
    println()

    //값의 감소
    for (i in 10 downTo 0){
        println(i)
    }
    println()

    //값을 2씩 감소
    for(i in 10 downTo 0 step 2){
        println(i)
    }
    println()



    //7. 배열 Array
    //생성방법 변경됨
    var arr =arrayOf(10, 20, 30)
    println(arr[0])
    println(arr[1])
    println(arr[2])
    println()

    //값변경도 그대로..
    arr[0] = 100
    arr[1] = 200
    arr[2] = 300

    //배열의 특별한 점 - ArrayList처럼 get(), set() 메소드를 보유하고 있음
    println(arr.get(0))
    println(arr.get(1))
    println(arr.get(2))
    println()

    arr.set(0, 200) //0번 방에 200 설정

    //배열 길이 - size
    println("배열의 길이 ${arr.size}")

    //출력 반복문
    for(n in arr) println(n)
    println()

    //반복문을 인덱스 값으로.. arr.인덱스 복수형
    for(i in arr.indices) println(i)
    println()

    //인덱스와 값을 같이 나오도록.. (인덱스, 값)
    for((i, v) in arr.withIndex()) println("$i : $v")
    println()

    //배열 값을 넣을 때 자료형을 명시하지 않으면 자동 Any 타입임
    var arr2 = arrayOf(10, "Hello", 3.14) //모든 타입이 가능하기 때문에 배열에 다른 자료형도 가능함
    for (t in arr2) println(t)
    println()

    arr2[1] = 20 //Any 타입이기 때문에 String이었던 변수에 다른 자료형을 넣는 것도 가능함 ㅇㅇ
    for (t in arr2) println(t)
    println()

    //단, 배열의 타입을 지정하는 것도 가능하다
    var arr3 = arrayOf<Int>(10, 20, 30) //Int형으로 타입 지정
    //타입을 지정하면 다른 자료형과 함께 사용 불가
    //var arr4 = arrayOf<Int>(10, "Hello", true) //Error

    //자료형 명시적 배열 다른 방법 - Boolean ~ Double까지 (기본 자료형만..)
    var arr5 = intArrayOf(100, 200, 300) //Int형 arrayOf

    var arr6 = doubleArrayOf(3.14, 3.0, 5.5)
    //단, String은 없음. <> 사용해야함

    //초기값 없이 null값으로 배열 만들기
    var arr7 = arrayOfNulls<String>(5) //제네릭<>과 배열 개수를 필수로 요구함
    for(t in arr7){
        println(t)
    }
    println()

    //배열 변수를 상수로 만들기
    val arr8 = arrayOf(10, 20, 30) //상수로 변한 것은 arr8이라는 배열 참조변수이지 참조변수가 가리키는 값이 아니다,
    arr8[0] = 100 //가능
    //arr8 = arrayOf(100, 200, 300)//ERROR, 즉, 다른 배열을 참조할 수는 없음

    //ArrayList만들기 - 배열 요소의 추가, 삭제가 가능함
    val arrList = arrayListOf<String>()
    val arrList2 = arrayListOf(5) //<>에 자료형을 명시하거나, 뒤에 길이를 지정하는 식으로 가능
    val arrList3 = arrayListOf(10, "Hello")

    //특정 위치에 추가하기
    arrList3.add("Nice")
    for (i in arrList3) println(i)
    println()

    //add 할 때 주의할 점 : 처음에 넣었던 자료형 외에는 추가 불가능함
    //arrList3.add(3.14) //기존에 넣었던 자료형이 아니라서 추가 안됨

    //삭제하기
    arrList3.removeAt(0) //인덱스 번호로 지우는 방법임
    for (e in arrList) println(e)
    println()

    arrList3.remove("Nice" )// 해당 값을 지움

    //set, get이 있음
    println("요소 개수 : ${arrList3.size}")
    arrList3.set(0, 20)
    println("0번요소 값 : ${arrList3.get(0)}")
    println()

    //2차원 배열
    val arrays = arrayOf(arrayOf(10, 20, 30), arrayOf("aa", "bb"), arrayOf(true, false))

    for(ar in arrays){
        for (e in ar){
            print(e)
            print(",")
        }
        println()
    }
    println()



    //8. 함수
    //  8-1) 기본함수 호출 (리턴타입 X, 파라미터 X)
    show()
    println()

    //  8-2) 함수에 파라미터 전달하면서 함수 호출
    output(100, "Hello", 3.14)
    println()

    //  8-3) 리턴 받기
    var sum = add(5, 3)
    println("sum : $sum")
    println()

    //**참고
    var x  = display()
    println(x) //출력 형식 : display \n kotlin.Unit - 하나의 객체가 리턴된 느낌


}//main함수



//8.1에서 호출하는 함수
//함수 정의시에는 무조건 fun 키워드
fun show(){
    println("show function")
}

//8.2 파라미터 전달받기 (위에서 전달해준 인트형 100)
//주의!! 매개변수를 만들 때에는 var 키워드 사용 금지 (변수명:자료형)
fun output(a:Int, b:String, c:Double){
    println(a)
    println(b)
    println(c)
}

//8-3, 리턴하기 (리턴타입을 함수() 다음에  { 사이에 :하고 작성
fun add(x:Int, y:Int):Int {
    return x+y
}

//**참고
//리턴타입을 쓰지 않으면 void가 아니라, 새로운  타입 -     Unit이 리턴됨
fun display(){
    println("display")
}

