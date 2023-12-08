package com.example.firsttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

// 툴바를 이 임포트를 사용하면 활성화가 안되니 주의!!!
//import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 첫화면이 바뀌어야하니 내가 보여줄 레이아웃으로 수정했다.
        setContentView(R.layout.view_class2)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        // 툴바의 내용도 바뀌어야해서 스트링에 새로운 타이틀을 저장 후 불러왔다.
        toolbar.title = getString(R.string.app_title2)

        // 레이아웃에 있는 텍스트 영역. (처음엔 ??? 였다가 클릭하면 캐릭터이름으로 바뀐다)
        var character_name = findViewById<TextView>(R.id.character_name)

        // 각 이미지버튼의 아이디 값을 불러온다.
        var sponge_bob  = findViewById<ImageButton>(R.id.spongebob)
        var patrick = findViewById<ImageButton>(R.id.patrick)
        var squidward = findViewById<ImageButton>(R.id.squidward)

        // 불러온 아이디 값으로 클릭이벤트를 부여한다. (스펀지밥)
        sponge_bob.setOnClickListener() {
            character_name.text = getString(R.string.sponge_bob)
            character_name.setTextColor(ContextCompat.getColor(this, R.color.yellow))
        }

        // 불러온 아이디 값으로 클릭이벤트를 부여한다. (뚱이)
        patrick.setOnClickListener() {
            character_name.text = getString(R.string.patrick)
            character_name.setTextColor(ContextCompat.getColor(this, R.color.pink))
        }

        // 불러온 아이디 값으로 클릭이벤트를 부여한다. (징징이)
        squidward.setOnClickListener() {
            character_name.text = getString(R.string.squidward)
            character_name.setTextColor(ContextCompat.getColor(this, R.color.paleturquoise))
        }
    }
}