package com.example.projeto_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(android.graphics.Color.BLACK);

        // Find the EditText and Button views
        editTextUsername = findViewById(R.id.editText_username);
        editTextPassword = findViewById(R.id.editText_password);
        Button buttonEntrar = findViewById(R.id.button_entrar);

        buttonEntrar.setOnClickListener(v -> {
            // Get the input from EditTexts
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            // Hardcoded credentials for testing
            String hardcodedUsername = "admin";
            String hardcodedPassword = "admin";

            // Check if the entered username and password match the hardcoded ones
            if (username.equals(hardcodedUsername) && password.equals(hardcodedPassword)) {
                // If correct, navigate to the next activity
                Intent intent = new Intent(MainActivity.this, TelaAnos.class);
                startActivity(intent);
            } else {
                // Show a Toast message if the credentials don't match
                Toast.makeText(MainActivity.this, "Credenciais Invalidas.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
