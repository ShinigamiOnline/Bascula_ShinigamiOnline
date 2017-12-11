package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
/**
 * Created by Shinigami Online on 08/12/2017.
 */
public class MainActivity extends AppCompatActivity {

    private ImageView frutas;
    private ImageView refrescos;
    private ImageView salir ;
    private ImageView verduras;
    private ImageView cancelar;
    private ImageView imprimirTicket;

    public static ArrayList<Producto> listaproductos = new ArrayList<Producto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frutas = (ImageView) findViewById(R.id.id_frutas);
        refrescos = (ImageView) findViewById(R.id.id_refresco);
        salir = (ImageView) findViewById(R.id.id_exit);
        verduras = (ImageView) findViewById(R.id.id_verduras);
        cancelar = (ImageView) findViewById(R.id.id_cancelar);
        imprimirTicket = (ImageView) findViewById(R.id.id_imprimir);

        frutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarFrutas(null);
            }
        });
        verduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarVerduras(null);
            }
        });

        refrescos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarRefrescos(null);
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrar(null);
            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarError(null);
            }
        });

        imprimirTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista){
                Intent intento = new Intent(MainActivity.this,Ticket_Compra.class);
                startActivity(intento);
            }
        });
    }

    public void llamarFrutas (View vista){
        Intent intentFruit = new Intent(this,Frutas_Actividad.class);
        startActivityForResult(intentFruit,999);
    }
    public void llamarRefrescos (View vista){
        Intent intentoRefresco = new Intent(this,Refrescos_Actividad.class);
        startActivityForResult(intentoRefresco,999);
    }
    public void llamarVerduras (View vista){
        Intent intentoVerduras = new Intent(this,Verduras_actividad.class);
        startActivityForResult(intentoVerduras,999);
    }

    public void cerrar(View vista){
        finish();
    }
    public void llamarError(View vista){
        Intent intento = new Intent(this,Borrar.class);
        startActivityForResult(intento,888);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data){

        if(requestCode == 888 && resultCode == RESULT_OK){
            listaproductos = new ArrayList<Producto>();
        }

        Intent intentOpciones = new Intent(this,Opciones.class);
        /** Intent de fruta */

        if(requestCode == 11 && resultCode == RESULT_OK){
            Intent intentFrutas = new Intent(this,Frutas_Actividad.class);
            startActivityForResult(intentFrutas,999);
        }
        if(requestCode == 22 && resultCode == RESULT_OK){
            Intent intentFrutas = new Intent(this,Verduras_actividad.class);
            startActivityForResult(intentFrutas,999);
        }
        if(requestCode == 33 && resultCode == RESULT_OK){
            Intent intentFrutas = new Intent(this,Refrescos_Actividad.class);
            startActivityForResult(intentFrutas,999);
        }


        if(requestCode == 999 && resultCode == RESULT_OK){
            ArrayList<String> listaDatos = data.getExtras().getStringArrayList("datos");

            String nomProducto = listaDatos.get(0);
            String cantidad = listaDatos.get(1);
            String origen = listaDatos.get(2);
            String nomImagen = listaDatos.get(3);
            String subTotal = listaDatos.get(4);
            Producto producto = new Producto(Integer.parseInt(nomImagen.trim()), nomProducto,Double.parseDouble(cantidad.trim()),Double.parseDouble(subTotal));
            listaproductos.add(producto);

            intentOpciones.putExtra("origen",origen);

            switch (origen){
                case "Fruta":
                    intentOpciones.putExtra("nombre", "Frutas");
                    startActivityForResult(intentOpciones,11);
                    break;
                case "Verdura":
                    intentOpciones.putExtra("nombre", "Verduras");
                    startActivityForResult(intentOpciones,22);
                    break;
                case "Refresco":
                    intentOpciones.putExtra("nombre", "Refrescos");
                    startActivityForResult(intentOpciones,33);
                    break;
            }

        }

    }

}
