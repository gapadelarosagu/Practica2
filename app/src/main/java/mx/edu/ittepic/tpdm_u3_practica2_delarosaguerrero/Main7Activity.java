package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main7Activity extends AppCompatActivity {
    EditText nombreE, autorE, anoE, tecnica;
    Button regresaE, modificaE, eliminaE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        nombreE = findViewById(R.id.nombreE);
        autorE = findViewById(R.id.autorE);
        anoE = findViewById(R.id.anoE);
        tecnica = findViewById(R.id.tecnica);
        regresaE = findViewById(R.id.regresaE);
        modificaE = findViewById(R.id.modificaE);
        eliminaE = findViewById(R.id.eliminaE);
    }
}
