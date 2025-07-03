package com.example.projeto_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class TelaAnos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_anos);

        getWindow().setStatusBarColor(android.graphics.Color.BLACK);

        setupButton(R.id.button_fund1, "Fundamental I");
        setupButton(R.id.button_fund2, "Fundamental II");
        setupButton(R.id.button_medio1, "Ensino Médio 1");
        setupButton(R.id.button_medio2, "Ensino Médio 2");
        setupButton(R.id.button_medio3, "Ensino Médio 3");

        ImageButton homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private void setupButton(int buttonId, String ano) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            Intent intent;
            if (ano.equals("Fundamental I") || ano.equals("Fundamental II")) {
                intent = new Intent(this, TelaDisciplina.class); // tela para Fund I e II
            } else {
                intent = new Intent(this, TelaDisciplina2.class); // tela para Ensinos Médios
            }
            intent.putExtra("ano", ano);
            startActivity(intent);
        });
    }

}
