package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Cuidados extends AppCompatActivity {

    TextView txt_rotulo, txt_descricao, txt_alimentacao, txt_higiene, txt_saude, txt_dica;
    ImageView btn_home, btn_video, btn_perfil;
    String rotulo, descricao, alimentacao, higiene, saude, dicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuidados);

        txt_rotulo = findViewById(R.id.txt_rotulo);
        txt_descricao = findViewById(R.id.txt_descricao);
        txt_alimentacao = findViewById(R.id.txt_alimen);
        txt_higiene = findViewById(R.id.txt_higi);
        txt_saude = findViewById(R.id.txt_saude);
        txt_dica = findViewById(R.id.txt_dica);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);

        Bundle dados = getIntent().getExtras();

        rotulo = dados.getString("nome");
        descricao = dados.getString("descricao");
        alimentacao = dados.getString("aliment");
        higiene = dados.getString("higiene");
        saude = dados.getString("saude");
        dicas = dados.getString("dica");

        txt_rotulo.setText(rotulo);
        txt_descricao.setText(descricao);
        txt_alimentacao.setText(alimentacao);
        txt_higiene.setText(higiene);
        txt_saude.setText(saude);
        txt_dica.setText(dicas);

        // Programação da NavBar
        btn_home.setOnClickListener(v -> {
            Intent home = new Intent(this, MainActivity.class);
            startActivity(home);
        });

        btn_video.setOnClickListener(v -> {
            Intent video = new Intent(this, Tutoriais.class);
            startActivity(video);
        });

        btn_perfil.setOnClickListener(v -> {
            Intent perfil = new Intent(this, Perfil.class);
            startActivity(perfil);
        });
    }
}