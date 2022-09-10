package com.example.informatindisplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView phone = findViewById(R.id.phone);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");

        TextView textname = findViewById(R.id.textViewname);
        TextView textage = findViewById(R.id.textViewage2);

        textname.setText(name);
        textage.setText(age);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "2424924023", null));
                startActivity(intent);
            }
        });
    }
}