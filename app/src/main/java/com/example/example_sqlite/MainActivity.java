package com.example.example_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.example_sqlite.db.MyDbManager;

public class MainActivity extends AppCompatActivity {

    private MyDbManager myDbManager;
    private EditText edTitle, edDisc;
    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDbManager = new MyDbManager(this);
        edTitle = findViewById(R.id.edTitle);
        edDisc = findViewById(R.id.edDisk);
        tvTest = findViewById(R.id.tvTest);
    }

    @Override
    protected void onResume() {
        super.onResume();
        myDbManager.openDB();
        for (String title : myDbManager.getFromDb()) { // считывание данных
            tvTest.append(title);
            tvTest.append("\n");
        }
    }

    public  void onClickSave (View view){
        tvTest.setText(""); // очистка
        myDbManager.insertToDB(edTitle.getText().toString(),edDisc.getText().toString()); // запись в базу данных
        for (String title: myDbManager.getFromDb()) { // считывание данных
            tvTest.append(title);
            tvTest.append("\n");
        }
    }
    @Override
    protected void onDestroy() {
            super.onDestroy();
            myDbManager.closeDb();
        }
}