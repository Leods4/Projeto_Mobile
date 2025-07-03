package com.example.projeto_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class TelaDisciplina extends AppCompatActivity {

    private String anoSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_disciplina);

        getWindow().setStatusBarColor(android.graphics.Color.BLACK);

        anoSelecionado = getIntent().getStringExtra("ano");

        setupButton(R.id.button_matematica, "Matemática");
        setupButton(R.id.button_portugues, "Língua Portuguesa");
        setupButton(R.id.button_lingua_estrangeira, "Língua Estrangeira");
        setupButton(R.id.button_artes, "Artes");
        setupButton(R.id.button_historia, "História");
        setupButton(R.id.button_geografia, "Geografia");
        setupButton(R.id.button_ciencias, "Ciências");
        setupButton(R.id.button_outras, "Outras");
        setupButton(R.id.button_educacao_fisica, "Educação Física");          // novo
        setupButton(R.id.button_ensino_religioso, "Ensino Religioso");        // novo

        ImageButton homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, TelaAnos.class);
            startActivity(intent);
            finish();
        });
    }

    private void setupButton(int buttonId, String disciplina) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, TelaComplexidade.class);
            intent.putExtra("ano", anoSelecionado);
            intent.putExtra("disciplina", disciplina);
            startActivity(intent);
        });
    }
}
