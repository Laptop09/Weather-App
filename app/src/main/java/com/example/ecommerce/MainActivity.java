package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Username = (TextView) findViewById(R.id.Username);
        TextView password = (TextView) findViewById(R.id.Password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn) ;

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                Toast.makeText(MainActivity.this,"LOGIN FAILED!!!",Toast.LENGTH_SHORT).show();

            }


        });

        }

}