package com.example.tp3application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton btn1=(RadioButton)findViewById(R.id.homme);
        final RadioButton btn2= (RadioButton)findViewById(R.id.femme);
        Button btn3= (Button)findViewById(R.id.hommefemme);
        findViewById(R.id.exercice2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Main2Activity();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btn1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Homme",Toast.LENGTH_LONG).show();
                }
                else if(btn2.isChecked())
                    Toast.makeText(getApplicationContext(),"Femme",Toast.LENGTH_LONG).show();
            }
        });

    }
    public void Main2Activity(){
        Intent intent= new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
}
