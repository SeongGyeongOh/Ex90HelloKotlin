package com.osg.ex90hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* //activity_main에 있는 모든 뷰들을 의미적으로 갖고오겠다! (알아서 find 해주겠다)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //오버라이드(필수) 함수 onCreate(변수명: 함수)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clickBtn(view: View) {
        //XML에서 뷰에 지정한 id를 변수명으로 생각하라!?
        //주의! import kotlinx.android.synthetic.main.activity_main.*가 필수임
        tv.setText("Nice to mee you, Kotlin!")
    }

    //Override 메소드는 반드시 fun앞에 override 키워드와 있어야 함
    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
    }
}