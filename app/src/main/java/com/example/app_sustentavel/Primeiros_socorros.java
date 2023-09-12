package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Primeiros_socorros extends AppCompatActivity {

    TextView txt_sobre_aviso,txt_aviso_final,  txt_nome_tipo, txt_sobre_tipo;

    ImageButton btn_home, btn_video, btn_perfil;

    String nome_tipo, conteudo_tipo, aviso1, aviso2, aviso3;

    Chip chip_engasgo, chip_queima, chip_frat, chip_into, chip_corte;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiros_socorros);

        txt_sobre_aviso = findViewById(R.id.txt_sobre_aviso);
        txt_aviso_final = findViewById(R.id.txt_aviso_final);
        txt_nome_tipo = findViewById(R.id.txt_nome_tipo);
        txt_sobre_tipo = findViewById(R.id.txt_sobre_tipo);
        chip_engasgo = findViewById(R.id.chip_engasgo);
        chip_queima = findViewById(R.id.chip_queima);
        chip_frat = findViewById(R.id.chip_fratura);
        chip_into = findViewById(R.id.chip_intoxi);
        chip_corte = findViewById(R.id.chip_corte);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);


        Bundle socorros = getIntent().getExtras();


       nome_tipo = socorros.getString("nome");
       conteudo_tipo = socorros.getString("conteudo");

       txt_nome_tipo.setText(nome_tipo);
       txt_sobre_tipo.setText(conteudo_tipo);

       aviso1 = getString(R.string.aviso1) + "/n" + getString(R.string.aviso2);
       txt_sobre_aviso.setText(aviso1);

       aviso3 = getString(R.string.aviso3);
       txt_aviso_final.setText(aviso3);




    }
}