package com.example.studentlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText e1;
    RadioGroup r1;
    RadioButton rb1;
    CheckBox playing,dancing,singing,sleeping,travelling,drawing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void onSigningUp(View view) {
        e1 = findViewById(R.id.editAddress);
        r1 = findViewById(R.id.group);

        StringBuilder result;
        result = new StringBuilder();
        Intent intent2 = new Intent(SignUp.this,MainActivity.class);
        startActivity(intent2);

        int ID = r1.getCheckedRadioButtonId();
        rb1 = findViewById(ID);

        playing = findViewById(R.id.checkBoxPlay);
        dancing = findViewById(R.id.checkBoxDance);
        drawing = findViewById(R.id.checkBoxDraw);
        singing = findViewById(R.id.checkBoxSing);
        sleeping = findViewById(R.id.checkBoxSleep);
        travelling = findViewById(R.id.checkBoxTravel);

        result.append("Your hobbies are:");
        if(playing.isChecked()){
            result.append("\nPlaying");
        }

        if(dancing.isChecked()){
            result.append("\nDancing");
        }

        if(sleeping.isChecked()){
            result.append("\nSleeping");
        }

        if(travelling.isChecked()){
            result.append("\nTravelling");
        }

        if(drawing.isChecked()){
            result.append("\nDrawing");
        }

        if(singing.isChecked()){
            result.append("\nSinging");
        }


        String gender = rb1.getText().toString();
        String address = e1.getText().toString();
        Toast.makeText(getApplicationContext(),"Your address is:"+address+
                "\n"+gender+"\n"+result.toString(),Toast.LENGTH_LONG).show();

    }
}
