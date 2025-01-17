package com.example.rayzlstore1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class signUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); // Hubungkan ke layout Sign Up

        // Referensi ke elemen UI
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText nameEditText = findViewById(R.id.nameEditText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText emailEditText = findViewById(R.id.emailEditText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText passwordEditText = findViewById(R.id.passwordEditText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button signUpButton = findViewById(R.id.signUpButton);

        // Aksi untuk tombol Sign Up
        signUpButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Mohon isi semua data!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Sign Up Berhasil untuk: " + name, Toast.LENGTH_SHORT).show();
                finish(); // Kembali ke MainActivity
            }
        });
    }
}
