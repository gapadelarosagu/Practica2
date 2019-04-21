package mx.edu.ittepic.tpdm_u3_practica2_delarosaguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button escul, pintu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        escul = findViewById(R.id.button);
        pintu = findViewById(R.id.button2);
    }
}
