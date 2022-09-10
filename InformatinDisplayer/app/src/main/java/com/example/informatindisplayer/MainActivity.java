package com.example.informatindisplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = this;

        EditText textname = findViewById(R.id.TextViewName);
        EditText textage = findViewById(R.id.editTextage);

        Button next = findViewById(R.id.buttonnext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String a = textname.getText().toString();
              String b = textage.getText().toString();
                if (a.equals("") && b.equals("")){
                    Toast.makeText(c, "Please enter the missing information", Toast.LENGTH_SHORT).show();

                }
                else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("name", a);
                    intent.putExtra("age", b);

                    startActivity(intent);
                }
            }
        });
    }
}