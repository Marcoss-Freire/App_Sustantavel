package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Primeiros_socorros extends AppCompatActivity {

    TextView txt_sobre_aviso,txt_aviso_final,  txt_nome_tipo, txt_sobre_tipo;
    ImageButton btn_home, btn_video, btn_perfil;
    String nome_tipo, conteudo_tipo, aviso1, aviso2, aviso3;
    Chip chip_engasgo, chip_queima, chip_frat, chip_into, chip_corte;

    ImageView img_tel, img_localizacao;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiros_socorros);

        txt_sobre_aviso = findViewById(R.id.txt_sobre_aviso);
        txt_aviso_final = findViewById(R.id.txt_aviso_final);
        txt_nome_tipo = findViewById(R.id.txt_nome_tipo);
        txt_sobre_tipo = findViewById(R.id.txt_sobre_tipo);
        chip_engasgo = findViewById(R.id.chip_papelao);
        chip_queima = findViewById(R.id.chip_tecido);
        chip_frat = findViewById(R.id.chip_papel);
        chip_into = findViewById(R.id.chip_plastico);
        chip_corte = findViewById(R.id.chip_corte);
        img_tel = findViewById(R.id.img_tel);
        img_localizacao =findViewById(R.id.img_localizacao);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);


        Bundle socorros = getIntent().getExtras();


        nome_tipo = socorros.getString("nome");
        conteudo_tipo = socorros.getString("conteudo");

        txt_nome_tipo.setText(nome_tipo);
        txt_sobre_tipo.setText(conteudo_tipo);

        aviso1 = getString(R.string.aviso1) + "\n" + getString(R.string.aviso2);
        txt_sobre_aviso.setText(aviso1);

        aviso3 = getString(R.string.aviso3);
        txt_aviso_final.setText(aviso3);

        img_tel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:153");
                Intent tel = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(tel);
            }
        });

        img_localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Hospitais+Veterinários+próximos+de+mim");
                Intent mapa = new Intent(Intent.ACTION_VIEW,location);
                startActivity(mapa);
            }
        });

        chip_engasgo.setOnClickListener(v -> {
            nome_tipo = getString(R.string.scr_txt_engasgo);
            conteudo_tipo = getString(R.string.engasgo) + "\n" + getString(R.string.engasgo2);

            txt_nome_tipo.setText(nome_tipo);
            txt_sobre_tipo.setText(conteudo_tipo);
        });

        chip_queima.setOnClickListener(v -> {
            nome_tipo = getString(R.string.scr_txt_queima);
            conteudo_tipo = getString(R.string.queimadura);

            txt_nome_tipo.setText(nome_tipo);
            txt_sobre_tipo.setText(conteudo_tipo);
        });

        chip_frat.setOnClickListener(v -> {
            nome_tipo = getString(R.string.scr_txt_frat);
            conteudo_tipo = getString(R.string.frat) + "\n" + getString(R.string.frat2);


            txt_nome_tipo.setText(nome_tipo);
            txt_sobre_tipo.setText(conteudo_tipo);
        });

        chip_into.setOnClickListener(v -> {
            nome_tipo = getString(R.string.scr_txt_into);
            conteudo_tipo = getString(R.string.intoxicacao);

            txt_nome_tipo.setText(nome_tipo);
            txt_sobre_tipo.setText(conteudo_tipo);
        });

        chip_corte.setOnClickListener(v -> {
            nome_tipo = getString(R.string.scr_txt_corte);
            conteudo_tipo = getString(R.string.corte);

            txt_nome_tipo.setText(nome_tipo);
            txt_sobre_tipo.setText(conteudo_tipo);
        });

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