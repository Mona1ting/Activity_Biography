package com.example.activitybiography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button button=(Button)findViewById(R.id.button2);
         button.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              Intent intent=getIntent();
              String name=intent.getStringExtra("name");//获取Activity传来的数据
              Integer age=intent.getIntExtra("age",20);
              Toast.makeText(AnotherActivity.this, name+age, Toast.LENGTH_SHORT).show();
              intent.putExtra("result","姓名："+name+"年龄"+age);//给Activity传数据
              setResult(0,intent);//设置button2的请求码
              finish();
          }
      });


    }
}

/*
Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age",10);
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();
/////////////////
button.setOnClickListener(new View.OnClickListener(){

             public void onClick(View v){
                Intent intent=new Intent(AnotherActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });*/