package com.example.ripper;

import androidx.appcompat.app.AppCompatActivity;import android.content.Intent;
import android.net.Uri;
import android.view.View;

import android.os.Bundle;

public class tools extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}