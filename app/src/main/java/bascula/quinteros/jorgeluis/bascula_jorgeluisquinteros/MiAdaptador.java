package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shinigami Online on 08/12/2017.
 */

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {
    LayoutInflater inflador;
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public MiAdaptador(Context context,ArrayList<Producto> productos){
        this.listaProductos = productos;
        inflador = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = inflador.inflate(R.layout.producto_ticket,parent,false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titulo.setText(listaProductos.get(position).nomProducto.toString());
        holder.descripcion.setText(String.valueOf(listaProductos.get(position).cantidad));
        holder.imagen.setImageResource(listaProductos.get(position).idImage);
        holder.subTotal.setText(String.valueOf(listaProductos.get(position).subTotal) + " €");
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView descripcion;
        TextView subTotal;
        ImageView imagen;

        public ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.tituloProducto);
            descripcion = (TextView) itemView.findViewById(R.id.descripcionProducto);
            imagen = (ImageView) itemView.findViewById(R.id.imagenProducto);
            subTotal = (TextView) itemView.findViewById(R.id.txtSubTotal);

        }
    }
}
