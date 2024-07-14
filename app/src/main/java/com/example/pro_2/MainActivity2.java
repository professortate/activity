package com.example.pro_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
txt1=findViewById(R.id.txt1);
txt2=findViewById(R.id.txt2);
txt3=findViewById(R.id.txt3);

        Intent i=getIntent();
     String str1=i.getStringExtra("str1");
     String str2=i.getStringExtra("str2");
     String str3=i.getStringExtra("str3");

     txt1.setText(str1);
     txt2.setText(str2);
     txt3.setText(str3);


    }
}