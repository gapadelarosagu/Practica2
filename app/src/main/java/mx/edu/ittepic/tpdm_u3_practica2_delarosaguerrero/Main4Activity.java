package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {
    Button regresa;
    ListView listaPint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        regresa = findViewById(R.id.regresa);
        listaPint = findViewById(R.id.listaPint);
    }
}
