package com.example.aplicacionrojas;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CotisacionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotisaciones);
        EditText editTextHonorarios = findViewById(R.id.editTextHonorarios);
        EditText editTextGastosGenerales = findViewById(R.id.editTextGastosGenerales);
        EditText editTextMateriales = findViewById(R.id.editTextMateriales);
        EditText editTextManoObra = findViewById(R.id.editTextManoObra);
        EditText editTextPermisos = findViewById(R.id.editTextPermisos);
        EditText editTextContingencias = findViewById(R.id.editTextContingencias);
        EditText editTextImpuestos = findViewById(R.id.editTextImpuestos);

        Button btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validarEntrada(editTextHonorarios) && validarEntrada(editTextGastosGenerales)
                        && validarEntrada(editTextMateriales) && validarEntrada(editTextManoObra)
                        && validarEntrada(editTextPermisos) && validarEntrada(editTextContingencias)
                        && validarEntrada(editTextImpuestos)) {

                    try {
                        // Obtener los valores ingresados por el usuario
                        double honorarios = Double.parseDouble(editTextHonorarios.getText().toString());
                        double gastosGenerales = Double.parseDouble(editTextGastosGenerales.getText().toString());
                        double materiales = Double.parseDouble(editTextMateriales.getText().toString());
                        double manoObra = Double.parseDouble(editTextManoObra.getText().toString());
                        double permisos = Double.parseDouble(editTextPermisos.getText().toString());
                        double contingencias = Double.parseDouble(editTextContingencias.getText().toString());
                        double impuestos = Double.parseDouble(editTextImpuestos.getText().toString());

                        // Calcular la cotización sumando todos los valores
                        double cotizacionTotal = honorarios + gastosGenerales + materiales + manoObra + permisos + contingencias + impuestos;

                        // Mostrar el resultado de la cotización
                        Toast.makeText(CotisacionesActivity.this, "Cotización Total: " + cotizacionTotal, Toast.LENGTH_SHORT).show();

                    } catch (NumberFormatException e) {
                        // Manejar error si no se puede convertir a double
                        Toast.makeText(CotisacionesActivity.this, "Error en el formato de los números", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    // Mostrar mensaje de error si algún campo está vacío
                    Toast.makeText(CotisacionesActivity.this, "Todos los campos deben contener valores numéricos", Toast.LENGTH_SHORT).show();
                }
            }    });
    }
    private boolean validarEntrada(EditText editText) {
        // Validar que el campo no esté vacío
        return !TextUtils.isEmpty(editText.getText().toString());
    }
}