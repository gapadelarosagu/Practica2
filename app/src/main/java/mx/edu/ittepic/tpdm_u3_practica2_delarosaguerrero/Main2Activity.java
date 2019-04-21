package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText nombre, autor, ano, tecnica;
    Button inserta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = findViewById(R.id.nombre);
        autor = findViewById(R.id.autor);
        ano = findViewById(R.id.ano);
        tecnica = findViewById(R.id.tecnica);
        inserta = findViewById(R.id.btninserta);
    }
}
