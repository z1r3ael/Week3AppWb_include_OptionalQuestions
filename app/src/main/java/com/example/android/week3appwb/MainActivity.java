package com.example.android.week3appwb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    /*
        1) Смотрим расход памяти при открытии каждого макета по отдельности:
            -ConstraintLayout
                -макет 1 - 70,1 МБ
                -макет 2 - 71,1 МБ
                -макет 3 - 72,2 Мб
                -макет 4 - 100,8 МБ
            -LinearLayout
                -макет 1 - 69,9 МБ
                -макет 2 - 69,7 Мб
                -макет 3 - 71,2 МБ
                -макет 4 - 100 МБ
            На макеты, сделанный с помощью LinearLayout, требуется меньший расход памяти

        2) Смотрим время отрисовки при открытии каждого макета по отдельности:
            -ConstraintLayout
                -макет 1 - 342 мс
                -макет 2 - 206 мс
                -макет 3 - 148 мс
                -макет 4 - 114 мс
            -LinearLayout
                -макет 1 - 244 мс
                -макет 2 - 157 мс
                -макет 3 - 133 мс
                -макет 4 - 92 мс
            Макеты, сделанный с помощью LinearLayout, отрисовываются немного быстрее

        3) Я сделал два отдельных проекта. Один с макетами на ConstraintLayout, другой с такими же макетами,
        но на LinearLayout. Заблидл у каждого проекта APK и сравнил размеры этих APK:
            ConstraintLayout - 4 260 806 байт
            LinearLayout - 4 262 634 байт
         Различия в размере APK незначительны ~2000 байт

         4) ConstraintLayout предазначен для верстки сложных макетов, чтобы избежать вложенности
         (чтобы иерархия вьюх была более плоской). Так как ConstraintLayout не более производителен,
         чем другие лейауты, то везде использовать его не следует. Если макет досаточно простой и
         можно спокойно обойтись LinearLayout, то лучше использовать LinearLayout

    */

public class MainActivity extends AppCompatActivity {

    private Button _1ScreenConstraintLayoutButton, _2ScreenConstraintLayoutButton,
            _3ScreenConstraintLayoutButton, _4ScreenConstraintLayoutButton,
            _1ScreenRelativeLayoutButton, _2ScreenRelativeLayoutButton,
            _3ScreenRelativeLayoutButton, _4ScreenRelativeLayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
        buttonListener();
    }

    private void initialization() {
        _1ScreenConstraintLayoutButton = findViewById(R.id._1ScreenConstraintLayoutButton);
        _2ScreenConstraintLayoutButton = findViewById(R.id._2ScreenConstraintLayoutButton);
        _3ScreenConstraintLayoutButton = findViewById(R.id._3ScreenConstraintLayoutButton);
        _4ScreenConstraintLayoutButton = findViewById(R.id._4ScreenConstraintLayoutButton);
        _1ScreenRelativeLayoutButton = findViewById(R.id._1ScreenRelativeLayoutButton);
        _2ScreenRelativeLayoutButton = findViewById(R.id._2ScreenRelativeLayoutButton);
        _3ScreenRelativeLayoutButton = findViewById(R.id._3ScreenRelativeLayoutButton);
        _4ScreenRelativeLayoutButton = findViewById(R.id._4ScreenRelativeLayoutButton);

    }

    private void buttonListener() {
        _1ScreenConstraintLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen1ConstraintLayoutActivity.class));
            }
        });

        _2ScreenConstraintLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen2ConstraintLayoutActivity.class));
            }
        });

        _3ScreenConstraintLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen3ConstraintLayoutActivity.class));
            }
        });

        _4ScreenConstraintLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen4ConstraintLayoutActivity.class));
            }
        });

        _1ScreenRelativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen1RelativeLayoutActivity.class));
            }
        });

        _2ScreenRelativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen2RelativeLayoutActivity.class));
            }
        });

        _3ScreenRelativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen3RelativeLayoutActivity.class));
            }
        });

        _4ScreenRelativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen4RelativeLayoutActivity.class));
            }
        });
    }
}