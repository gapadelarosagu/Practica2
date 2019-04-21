package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText nombreE, autorE, anoE, material;
    Button insertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nombreE = findViewById(R.id.nombreE);
        autorE = findViewById(R.id.autorE);
        anoE = findViewById(R.id.anoE);
        material = findViewById(R.id.material);
        insertar = findViewById(R.id.inserta);
    }
}
