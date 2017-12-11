package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Shinigami Online on 08/12/2017.
 */

public class Verduras_actividad extends AppCompatActivity {
    private ImageView guindilla;
    private ImageView berenjena;
    private ImageView calabacin;
    private ImageView tomate;
    private ImageView tomateRama;
    private ImageView pimientorojo;
    private ImageView volver;
    private TextView peso;
    private double totalPrecioArticulo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verduras);
        peso = (TextView) findViewById(R.id.id_peso_Verduras);
        guindilla = (ImageView)findViewById(R.id.img_guindilla);
        berenjena = (ImageView)findViewById(R.id.id_berenjena);
        calabacin = (ImageView)findViewById(R.id.id_calabacin);
        tomate = (ImageView)findViewById(R.id.id_tomateraff);
        tomateRama = (ImageView)findViewById(R.id.id_tomaterama);
        pimientorojo = (ImageView)findViewById(R.id.id_pimiento);
        volver = (ImageView) findViewById(R.id.id_volver_verduras);


        guindilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Guindilla");
                    datos.add(peso.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.guindilla));
                    double total = calcularprecio(null,2.14);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        berenjena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Berenjena");
                    datos.add(peso.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    double total = calcularprecio(null,2.14);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        calabacin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Calabacin");
                    datos.add(peso.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.calabacin));
                    double total = calcularprecio(null,2.14);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        tomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Tomate");
                    datos.add(peso.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.tomate));
                    double total = calcularprecio(null,2.14);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        tomateRama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Tomate Rama");
                    datos.add(peso.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.tomate_rama));
                    double total = calcularprecio(null,2.14);
                    datos.add(String.valueOf(total));
                    respuesta(datos);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"No has introducido un peso",Toast.LENGTH_SHORT).show();
                }
            }
        });
        pimientorojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Pimiento Rojo");
                    datos.add(peso.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.pimiento_rojo));
                    double total = calcularprecio(null,2.14);
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
