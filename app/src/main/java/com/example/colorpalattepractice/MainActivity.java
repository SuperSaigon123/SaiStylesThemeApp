package com.example.colorpalattepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.newButton);
        butoon = findViewById(R.id.newButoon);

        newText = findViewById(R.id.helloText);
        newEdit = findViewById(R.id.editTest);
    }

    public void counter(){
        count++;
    }

    public void switchScreens(View view) {
        newText.setText(count);
        String name = newEdit.getText().toString();
        Intent intent = new Intent(this, SecondScreen.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
        
    }
}