package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }
        );

        EditText editText01 = findViewById(R.id.editText1);

        EditText editText02 = findViewById(R.id.editText2);
        Button btn_teste = findViewById(R.id.btn_fill);
        Button btn_limpar = findViewById(R.id.btn_clear);

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText01.setText("");
                editText02.setText("");
            }
        });

        btn_teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText01.setText("Ciência da Computação");
                editText02.setText("Programação Para Dispositivos Móveis");
            }
        });

    }
}