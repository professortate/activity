package com.example.pro_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2,edt3;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
edt1=findViewById(R.id.edt1);
edt2=findViewById(R.id.edt2);
edt3=findViewById(R.id.edt3);

btn=findViewById(R.id.btn);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String str1=edt1.getText().toString();
        String str2=edt2.getText().toString();
        String str3=edt3.getText().toString();

        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("str1",str1);
        i.putExtra("str2",str2);
        i.putExtra("str3",str3);
        startActivity(i);

    }
});


    }
}