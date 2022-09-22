package com.example.colorpalattepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.Object;


public class MainActivity extends AppCompatActivity {

    Button button;
    Button butoon;
    TextView newText;
    EditText newEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.newButton);
        butoon = findViewById(R.id.newButoon);

        newText = findViewById(R.id.helloText);
        newEdit = findViewById(R.id.editTest);
        
    }
}