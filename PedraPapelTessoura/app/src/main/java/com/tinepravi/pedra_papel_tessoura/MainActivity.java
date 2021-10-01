package com.tinepravi.pedra_papel_tessoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTessoura(View view){
        this.opcaoSelecionada("tessoura");

    }

    public void opcaoSelecionada(String escolhausuario){
        //System.out.println(opcaoSelecionada);
        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);

        String[] opcoes = {"pedra", "papel", "tessoura"};
        String escolhaApp = opcoes[numero];//não sei desse erro

        switch (escolhaApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tessoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        //System.out.println(opcaoApp);
        if(
                        (escolhaApp == "tessoura" && escolhausuario == "papel") ||
                        (escolhaApp == "papel" && escolhausuario == "pedra") ||
                        (escolhaApp == "pedra" && escolhausuario == "tessoura")
        ){//app ganha
            textoResultado.setText("Você Perdeu!! :(");
        }else if(
                (escolhausuario == "pedra" && escolhaApp == "tessoura") ||
                        (escolhausuario == "papel" && escolhaApp == "pedra") ||
                        (escolhausuario == "tessoura" && escolhaApp == "papel")
        ){//jogador ganha
            textoResultado.setText("Você ganhou!! :)");
        }else {
            textoResultado.setText("Empatamos! ;)");
        }//empate


    }

}