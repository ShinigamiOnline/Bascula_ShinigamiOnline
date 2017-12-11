package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Shinigami Online on 08/12/2017.
 */
public class Ticket_Compra extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MiAdaptador adaptador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket);

        recyclerView = (RecyclerView) findViewById(R.id.id_recycler_ticket);
        adaptador = new MiAdaptador(this,MainActivity.listaproductos);
        recyclerView.setAdapter(adaptador);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
