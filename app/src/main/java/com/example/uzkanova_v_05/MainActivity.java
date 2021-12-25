package com.example.uzkanova_v_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk =  findViewById(R.id.btnOk);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, gallery.class);
        startActivity(intent);
    }
}