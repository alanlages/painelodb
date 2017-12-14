package br.com.painelodb.painelodb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw = (TextView) findViewById(R.id.texto);
        tw.setText("Oi");
        Teste t = new Teste(this);
        t.AlterarValor("Oi 2!");
        t.AlterarValor("Oi 3!");
    }
}
