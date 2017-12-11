package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shinigami Online on 08/12/2017.
 */

public class Opciones extends AppCompatActivity {
    private Button btnPermanecer;
    private Button btnIrIncio;
    private Button btnTerminar;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        btnPermanecer = (Button) findViewById(R.id.btn_seguir_en);
        btnIrIncio = (Button) findViewById(R.id.btn_go_incio);
        btnTerminar = (Button) findViewById(R.id.btn_endCompra);

        Bundle nombre = getIntent().getExtras();
        btnPermanecer.setText("SEGUIR EN " + nombre.getString("nombre"));

        btnPermanecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                permanecer(null);
            }
        });

        btnIrIncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarMenu(null);
            }
        });
        btnTerminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamaGoCompra(null);
            }
        });


    }

    public void llamarMenu(View vista){
        Intent intento = new Intent(this,MainActivity.class);
        startActivity(intento);
    }
    public void llamaGoCompra (View vista){
        Intent intento = new Intent(this,Ticket_Compra.class);
        startActivity(intento);
    }
    public void permanecer (View vista){
        Intent intent = new Intent();
        setResult(RESULT_OK,intent);
        finish();
    }
}