package ru.startandroid.lesson21twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnActTwo;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Нахожу View

        btnActTwo = (Button) findViewById(R.id.btnActTwo);

        //Присваиваю обработчик
        btnActTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                //создаю и инициализирую Intent, указываю с какой и на какую activity переходит пользователь
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
        }
    }
}
