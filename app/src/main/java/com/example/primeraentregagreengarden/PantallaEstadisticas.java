package com.example.primeraentregagreengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaEstadisticas extends AppCompatActivity {
    private Button btnRegreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_estadisticas);
        inicializar();
        btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresoIntento=new Intent(PantallaEstadisticas.this,PantallaPerfil.class);
                startActivity(regresoIntento);
            }
        });
    }
    private void inicializar(){
        btnRegreso=findViewById(R.id.btnRegresarEstadisticas);
    }
}