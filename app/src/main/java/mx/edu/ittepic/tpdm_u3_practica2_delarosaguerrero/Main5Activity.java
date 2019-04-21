package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class Main5Activity extends AppCompatActivity {
    Button regresa;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        regresa = findViewById(R.id.regresa);
        lista = findViewById(R.id.listaPint);
    }
}
