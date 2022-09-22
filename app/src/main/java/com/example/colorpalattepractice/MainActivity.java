package com.example.colorpalattepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.ViewGroup.MarginLayoutParams;

import com.google.android.material.snackbar.Snackbar;

import java.lang.Object;


public class MainActivity extends AppCompatActivity {

    Button button;
    Button butoon;
    TextView newText;
    EditText newEdit;
    TextView invisibleText;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.newButton);
        butoon = findViewById(R.id.newButoon);

        newText = findViewById(R.id.helloText);
        newEdit = findViewById(R.id.editTest);
        invisibleText = findViewById(R.id.newInvisibletext);

        count = 0;
        
    }

    public void showSnackbar(View view){
        invisibleText.setVisibility(View.INVISIBLE);
        count++;
        Snackbar.make(view, "counted: " + count, 2000).show();
    }

    public void showCount(View view){
        invisibleText.setText(count + "");
        invisibleText.setVisibility(View.VISIBLE);
    }
}