package com.example.applicationtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ToastMethod(View view) {
        Toast.makeText(  this, "ALREADY HAVE AN ACCOUNT",Toast.LENGTH_LONG).show();
    }
}