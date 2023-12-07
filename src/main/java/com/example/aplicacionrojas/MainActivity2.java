package com.example.aplicacionrojas;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Obtén referencias a los botones
        Button btnCotizaciones = findViewById(R.id.btnCotizaciones);
        Button btnMateriales = findViewById(R.id.btnMateriales);
        Button btnEmpleados = findViewById(R.id.btnEmpleados);

        // Configura el comportamiento de los botones
        btnCotizaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, CotisacionesActivity.class);
                startActivity(intent);
            }
        });

        btnMateriales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para el botón de Materiales
                Intent intent = new Intent(MainActivity2.this, MaterialActivity.class);
                startActivity(intent);
            }
        });

        btnEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para el botón de Empleados
                Intent intent = new Intent(MainActivity2.this, EmpleadosActivity.class);
                startActivity(intent);
            }
        });
        Button btnVerHistorial = findViewById(R.id.btnVerHistorial);
        btnVerHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, HistorialActivity.class);
                startActivity(intent);
            }
        });
    }
}