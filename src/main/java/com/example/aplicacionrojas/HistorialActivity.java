package com.example.aplicacionrojas;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class HistorialActivity extends AppCompatActivity {
    private List<Registro> historial;
    private ArrayAdapter<Registro> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        historial = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historial);

        ListView listViewHistorial = findViewById(R.id.listViewHistorial);
        listViewHistorial.setAdapter(adapter);
    }
}
