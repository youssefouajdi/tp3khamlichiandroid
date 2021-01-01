package com.example.tp3application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ListView liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        liste = (ListView) findViewById(R.id.liste);
        liste.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        Button btn = (Button) findViewById(R.id.buttonactivity2);
        final TextView texte = (TextView) findViewById(R.id.textView);
        String[] Modules = {"Intelligence Artificille", "Réseaux Informatiques", "Développement web", "Administration systéme",
                "Administration des Bases de données"};

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, Modules);
        liste.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                texte.setText(liste.getItemAtPosition(liste.getCheckedItemPosition()).toString());
            }
        });
    }
}