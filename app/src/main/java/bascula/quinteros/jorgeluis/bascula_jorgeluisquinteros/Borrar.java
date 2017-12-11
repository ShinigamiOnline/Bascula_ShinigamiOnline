package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shinigami Online on 08/12/2017.
 */
public class Borrar extends AppCompatActivity {
        private Button si;
        private Button no;

protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borrar);
        si = (Button) findViewById(R.id.button);
        no = (Button) findViewById(R.id.button2);

        si.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent intento = new Intent();
                        setResult(RESULT_OK,intento);
                        finish();
                }
        });
        no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent intento = new Intent();
                        setResult(RESULT_CANCELED,intento);
                        finish();

                }
        });




}
}
