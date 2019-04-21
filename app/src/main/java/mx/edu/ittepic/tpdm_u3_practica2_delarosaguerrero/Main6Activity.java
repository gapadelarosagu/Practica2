package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {
    EditText nombre, autor, ano, tecnica;
    Button regresa, modifica, elimina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        nombre = findViewById(R.id.nombre);
        autor = findViewById(R.id.autor);
        ano = findViewById(R.id.ano);
        tecnica = findViewById(R.id.tecnica);
        regresa = findViewById(R.id.regresa);
        modifica = findViewById(R.id.modifica);
        elimina = findViewById(R.id.elimina);
    }
}
