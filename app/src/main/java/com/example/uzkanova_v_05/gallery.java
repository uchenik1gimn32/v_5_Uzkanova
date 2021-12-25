package com.example.uzkanova_v_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class gallery extends AppCompatActivity implements OnClickListener {


    Button btnAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        btnAndroid =  findViewById(R.id.btnAndroid);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
        startActivity(i);
    }
}