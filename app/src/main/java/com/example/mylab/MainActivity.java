package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText stu_id ,password ;
    private Button btn_login ,btn_join ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stu_id = (EditText) findViewById(R.id.stu_id);
        password = (EditText) findViewById(R.id.password);

        btn_login = (Button) findViewById(R.id.login);
        btn_join = (Button) findViewById(R.id.asdas);

    }

    @Override
    protected void onStart() {
        super.onStart();


        //login button
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this, "학번: "+ stu_id.getText(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "password: " + password.getText(), Toast.LENGTH_SHORT).show();

                //DB or 서버 정보와 일치 여부 판단하는 코드 작성 & intent
            }
        });


        // 회원가입 버튼
        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, JoinActivity.class);
                startActivity(myIntent);
                finish();
            }
        });


        // password 찾기 버튼
    }
}