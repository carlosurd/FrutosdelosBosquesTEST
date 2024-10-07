package com.example.frutosdelosbosques;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configura la pantalla de inicio
        setContentView(R.layout.activity_splash);

        // Espera 3 segundos y luego abre MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la SplashActivity
            }
        }, 3000); // 3000 milisegundos = 3 segundos
    }
}