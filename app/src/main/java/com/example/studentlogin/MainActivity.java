package com.example.studentlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button b1;
    public EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClicking(View view) {
        b1 = findViewById(R.id.buttonSignUp);
        e1 = findViewById(R.id.editUsername);
        String userName = e1.getText().toString();

        Intent intent = new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Welcome"+"\n"+userName,Toast.LENGTH_LONG).show();
    }
}
