package com.example.aplicacionrojas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MaterialAdapter extends RecyclerView.Adapter<MaterialAdapter.ViewHolder> {

    private List<Material> materiales;
    private LayoutInflater inflater;

    public MaterialAdapter(Context context, List<Material> data) {
        this.inflater = LayoutInflater.from(context);
        this.materiales = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_material, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Material material = materiales.get(position);
        holder.tvNombre.setText(material.getNombre());
        holder.tvCantidad.setText("Cantidad: " + material.getCantidad());
        holder.tvCostoUnitario.setText("Costo Unitario: $" + material.getCostoUnitario());
    }

    @Override
    public int getItemCount() {
        return materiales.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvCantidad, tvCostoUnitario;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvCantidad = itemView.findViewById(R.id.tvCantidad);
            tvCostoUnitario = itemView.findViewById(R.id.tvCostoUnitario);
        }
    }
}



