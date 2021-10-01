package com.tinepravi.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tinepravi.fragments.R;
import com.tinepravi.fragments.fragments.ContatosFragment;
import com.tinepravi.fragments.fragments.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonContato, buttonConversa;
    private ConversasFragment conversasFragmets;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.textContatos);
        buttonConversa = findViewById(R.id.textConversas);

        //removendo sombra actionBar
        getSupportActionBar().setElevation(0);


        conversasFragmets = new ConversasFragment();

        //configurar objeto para fragmento
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragmets);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });

    }
}