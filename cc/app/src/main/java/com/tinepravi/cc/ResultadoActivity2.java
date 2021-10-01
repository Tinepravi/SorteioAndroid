package com.tinepravi.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity2 extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton imageButtonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);

        imageResultado = findViewById(R.id.imageViewResultado);
        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){//cara
            imageResultado.setImageResource(R.drawable.moeda_cara);

        }else{//coroa

            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}