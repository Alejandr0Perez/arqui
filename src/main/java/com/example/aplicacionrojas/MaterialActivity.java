package com.example.aplicacionrojas;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MaterialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);

        Button btnVerListaMateriales = findViewById(R.id.btnVerListaMateriales);
        Button btnAgregarMateriales = findViewById(R.id.btnAgregarMateriales);

        btnVerListaMateriales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialActivity.this, lista_materiales.class);
                startActivity(intent);
            }
        });

        btnAgregarMateriales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para el botón "Agregar Materiales"
                Intent intent = new Intent(MaterialActivity.this, MaterialesActivity.class);
                startActivity(intent);
            }
        });
    }
}