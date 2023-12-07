package com.example.aplicacionrojas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;


public class EmpleadosActivity extends AppCompatActivity {
    private List<String> listaEmpleados;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empleados);


        listaEmpleados = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaEmpleados);

        EditText editTextNombre = findViewById(R.id.editTextNombre);
        Button btnGuardarEmpleado = findViewById(R.id.btnGuardarEmpleado);
        ListView listViewEmpleados = findViewById(R.id.listViewEmpleados);

        // Configurar el adaptador para el ListView
        listViewEmpleados.setAdapter(adapter);

        btnGuardarEmpleado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreEmpleado = editTextNombre.getText().toString();

                if (!nombreEmpleado.isEmpty()) {
                    listaEmpleados.add(nombreEmpleado);
                    editTextNombre.getText().clear();
                    adapter.notifyDataSetChanged(); // Notificar al adaptador que los datos han cambiado
                    Toast.makeText(EmpleadosActivity.this, "Empleado guardado: " + nombreEmpleado, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(EmpleadosActivity.this, "Ingresa un nombre de empleado válido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}