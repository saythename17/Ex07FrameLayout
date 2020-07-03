package com.icandothisallday2020.ex07framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout france,italy,russia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        france=findViewById(R.id.layout_france);
        italy=findViewById(R.id.layout_italy);
        russia=findViewById(R.id.layout_russia);
    }
    public void click(View v){//v point clicked button
        //화면이미지가 겹치지않도록 전부 INVISIBLE 처리
        france.setVisibility(View.INVISIBLE);
        italy.setVisibility(View.INVISIBLE);
        russia.setVisibility(View.INVISIBLE);

        //<Button> 의 onClick 속성을 통해 Listener 없이 버튼 이벤트 처리
        //클릭된 버튼 구별을 위해 아이디를 얻어옴
        int id=v.getId();
        switch (id){
            case R.id.btn01:
                france.setVisibility(View.VISIBLE);
                break;
            case R.id.btn02:
                italy.setVisibility(View.VISIBLE);
                break;
            case R.id.btn03:
                russia.setVisibility(View.VISIBLE);
                break;
        }


    }
}
