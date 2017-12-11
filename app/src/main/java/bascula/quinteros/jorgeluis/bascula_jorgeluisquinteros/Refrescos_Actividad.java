package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Vespertino on 28/11/2017.
 */

public class Refrescos_Actividad extends AppCompatActivity{
    private ImageView cocacola;
    private ImageView fantaNaranja;
    private ImageView fantaLimon;
    private ImageView agua;
    private ImageView volver;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refrescos);
        cocacola = (ImageView) findViewById(R.id.id_cocacola);
        fantaNaranja = (ImageView) findViewById(R.id.id_fantanaranja);
        fantaLimon = (ImageView) findViewById(R.id.id_fantalimon);
        agua = (ImageView) findViewById(R.id.id_agua);
        volver = (ImageView) findViewById(R.id.id_volver_Refrescos);

cocacola.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ArrayList<String> datos = new ArrayList<String>();
        datos.add("Coca-Cola");
        datos.add("1");
        datos.add("Refresco");
        datos.add(String.valueOf(R.drawable.coca_cola));
        double total = calcularprecio(null,1.20);
        datos.add(String.valueOf(total));
        respuesta(datos);
    }
    });

        fantaNaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("Fanta Naranja");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.fanta_naranja));
                double total = calcularprecio(null,1.20);
                datos.add(String.valueOf(total));
                respuesta(datos);
            }
        });
        fantaLimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("Fanta Limon");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.fanta_limon));
                double total = calcularprecio(null,1.20);
                datos.add(String.valueOf(total));
                respuesta(datos);
            }
        });
        agua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("Agua");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.agua));
                double total = calcularprecio(null,1.20);
                datos.add(String.valueOf(total));
                respuesta(datos);
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });


    }

    private void respuesta(ArrayList<String> datos){
        Intent intentRespuesta = new Intent();
        intentRespuesta.putExtra("datos",datos);
        setResult(RESULT_OK,intentRespuesta);
        finish();
    }

    public double calcularprecio(View vista,double precio){
        double unidadActual = 1;
        double totalPrecioArticulo = precio * unidadActual;
        return totalPrecioArticulo;
    }
}
