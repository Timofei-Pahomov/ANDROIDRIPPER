package com.example.ripper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }
    public void openinfo(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }
    public void opentools(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }
}
