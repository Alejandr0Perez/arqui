package com.example.aplicacionrojas;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class lista_materiales extends AppCompatActivity {

    private List<Material> listaMateriales;
    private ArrayAdapter<Material> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_materiales);

        listaMateriales = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaMateriales);

        ListView listViewMateriales = findViewById(R.id.listViewMateriales);
        listViewMateriales.setAdapter(adapter);
    }
}