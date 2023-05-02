package com.example.mylab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class JoinActivity extends AppCompatActivity {

    private DatabaseReference mRootRef;
    private Button delete, btn;
    private EditText join_name, join_email,join_password;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super. onCreate (savedInstanceState);
        setContentView(R.layout.activity_join);


        join_name = (EditText) findViewById(R.id.join_name);
        join_email = (EditText) findViewById(R.id.join_email);
        join_password = (EditText) findViewById(R.id.join_password) ;
        btn = (Button)findViewById(R.id.join_button);
        delete = (Button) findViewById(R.id.delete);

        mRootRef = FirebaseDatabase.getInstance().getReference();

        //condRef2 = mRootRef.child("email");
    }

    @Override
    protected void onStart() {
        super.onStart();

        //취소버튼
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLoginIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(goLoginIntent);

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info info = new Info(join_name.getText().toString(),join_email.getText().toString(),
                        join_password.getText().toString());

                mRootRef.child("ASDF").setValue(info);

            }
        });
    }
}

