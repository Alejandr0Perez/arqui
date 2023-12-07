package com.example.aplicacionrojas;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MaterialesActivity extends AppCompatActivity {
    private List<Material> listaMateriales;
    private MaterialAdapter materialAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materiales);
        listaMateriales = new ArrayList<>();
        materialAdapter = new MaterialAdapter(this, listaMateriales);

        EditText editTextNombreMaterial = findViewById(R.id.editTextNombreMaterial);
        EditText editTextCantidad = findViewById(R.id.editTextCantidad);
        EditText editTextCostoUnitario = findViewById(R.id.editTextCostoUnitario);
        Button btnGuardarMaterial = findViewById(R.id.btnGuardarMaterial);

        // Configurar el adaptador para mostrar la lista de materiales (puedes personalizar esto según tus necesidades)
        // materialAdapter = new MaterialAdapter(this, listaMateriales);
        // recyclerView.setAdapter(materialAdapter);

        btnGuardarMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validarEntrada(editTextNombreMaterial) && validarEntrada(editTextCantidad) && validarEntrada(editTextCostoUnitario)) {

                    try {
                        // Obtener los valores ingresados por el usuario
                        String nombreMaterial = editTextNombreMaterial.getText().toString();
                        double cantidad = Double.parseDouble(editTextCantidad.getText().toString());
                        double costoUnitario = Double.parseDouble(editTextCostoUnitario.getText().toString());

                        // Crear un objeto Material y agregarlo a la lista
                        Material nuevoMaterial = new Material(nombreMaterial, cantidad, costoUnitario);
                        listaMateriales.add(nuevoMaterial);

                        // Limpiar los campos después de guardar
                        editTextNombreMaterial.getText().clear();
                        editTextCantidad.getText().clear();
                        editTextCostoUnitario.getText().clear();

                        // Notificar al adaptador que los datos han cambiado
                        materialAdapter.notifyDataSetChanged();

                        // Puedes mostrar un mensaje o actualizar la vista de la lista aquí
                        Toast.makeText(MaterialesActivity.this, "Material guardado: " + nuevoMaterial.getNombre(), Toast.LENGTH_SHORT).show();

                    } catch (NumberFormatException e) {
                        // Manejar error si no se puede convertir a double
                        Toast.makeText(MaterialesActivity.this, "Error en el formato de los números", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    // Mostrar mensaje de error si algún campo está vacío
                    Toast.makeText(MaterialesActivity.this, "Todos los campos deben contener valores", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private boolean validarEntrada(EditText editText) {
        // Validar que el campo no esté vacío
        return !TextUtils.isEmpty(editText.getText().toString());
    }
}
