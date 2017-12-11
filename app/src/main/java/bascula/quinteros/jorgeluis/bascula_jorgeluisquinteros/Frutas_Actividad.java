package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Shinigami Online on 08/12/2017.
 */

public class Frutas_Actividad extends AppCompatActivity {

    private ImageView fresas;
    private ImageView granada;
    private ImageView lima;
    private ImageView limon;
    private ImageView manzana;
    private ImageView platano;



    private TextView peso;
    private double totalPrecioArticulo;
    private ImageView volver;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frutas);
        fresas = (ImageView) findViewById(R.id.id_fresas);
        granada = (ImageView) findViewById(R.id.id_granada);
        lima = (ImageView) findViewById(R.id.id_lima);
        limon = (ImageView) findViewById(R.id.id_limon);
        manzana = (ImageView) findViewById(R.id.id_manzana);
        platano = (ImageView) findViewById(R.id.id_platano);



        peso = (TextView) findViewById(R.id.id_peso_Frutas);
        volver = (ImageView) findViewById(R.id.id_volver_frutas);


        fresas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Fresa");
                    datos.add(peso.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.fresas));
                    double totalFresa = calcularprecio(null, 2);
                    datos.add(String.valueOf(totalFresa));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        granada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Granada");
                    datos.add(peso.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.granada));
                    double totalGranada = calcularprecio(null,4);
                    datos.add(String.valueOf(totalGranada));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("lima");
                    datos.add(peso.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.lima));
                    double total = calcularprecio(null,2.40);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        limon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("limon");
                    datos.add(peso.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.limon));
                    double total = calcularprecio(null,2.40);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        manzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("manzana");
                    datos.add(peso.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.manzana));
                    double total = calcularprecio(null,1.95);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        platano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("platano");
                    datos.add(peso.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.platano));
                    double total = calcularprecio(null,2.25);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
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
        double pesoactual = Double.parseDouble(peso.getText().toString());
        totalPrecioArticulo = precio * pesoactual;
        return totalPrecioArticulo;
    }

}
