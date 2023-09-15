package com.example.app_sustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Tipos extends AppCompatActivity {

    ImageView img_dog, img_cat, img_bird, img_coelho, img_roedor;
    ImageView btn_home, btn_video, btn_perfil;
    String nome_pet, text_desc, text_aliment, text_higiene, text_saude, text_dica;
    Integer img_pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);

        img_dog = findViewById(R.id.img_dog);
        img_cat = findViewById(R.id.img_gato);
        img_bird = findViewById(R.id.img_bird);
        img_coelho = findViewById(R.id.img_coelho);
        img_roedor = findViewById(R.id.img_roedor);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);

        img_dog.setOnClickListener(v -> {
            Intent passar_dados = new Intent(this, Cuidados.class);
            img_pet = R.drawable.dog;
            nome_pet = getString(R.string.nome_dog);
            text_desc = getString(R.string.descricao_dog);
            text_aliment = getString(R.string.aliment_dog) + "\n" + getString(R.string.aliment_dog2); // O \n quebra linha
            text_higiene = getString(R.string.higiene_dog);
            text_saude = getString(R.string.saude_dog) + "\n" + getString(R.string.saude_dog2);
            text_dica = getString(R.string.dica_dog1) + "\n\n" + getString(R.string.dica_dog2) + "\n\n" + getString(R.string.dica_dog3);
            passar_dados.putExtra("img", img_pet);
            passar_dados.putExtra("nome", nome_pet); // Passando os dados através das variáveis, primeiro o a chave, depois o valor
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
        });

        img_cat.setOnClickListener(v -> {
            Intent passar_dados = new Intent(this, Cuidados.class);
            img_pet = R.drawable.cat;
            nome_pet = getString(R.string.nome_cat);
            text_desc = getString(R.string.descricao_cat);
            text_aliment = getString(R.string.aliment_cat) + "\n" + getString(R.string.aliment_cat2);
            text_higiene = getString(R.string.higiene_cat) + "\n" + getString(R.string.higiene_cat2);
            text_saude = getString(R.string.saude_cat) + "\n" + getString(R.string.saude_cat2);
            text_dica = getString(R.string.dica_cat1) + "\n\n" + getString(R.string.dica_cat2) + "\n\n" + getString(R.string.dica_cat3);
            passar_dados.putExtra("img", img_pet);
            passar_dados.putExtra("nome", nome_pet);
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
        });

        img_bird.setOnClickListener(v -> {
            Intent passar_dados = new Intent(this, Cuidados.class);
            img_pet = R.drawable.bird;
            nome_pet = getString(R.string.nome_bird);
            text_desc = getString(R.string.descricao_aves);
            text_aliment = getString(R.string.aliment_aves) + "\n" + getString(R.string.aliment_aves2); // O \n quebra linha
            text_higiene = getString(R.string.higiene_aves);
            text_saude = getString(R.string.saude_aves) + "\n" + getString(R.string.saude_aves2);
            text_dica = getString(R.string.dica_aves1) + "\n\n" + getString(R.string.dica_aves2) + "\n\n" + getString(R.string.dica_aves3);
            passar_dados.putExtra("img", img_pet);
            passar_dados.putExtra("nome", nome_pet); // Passando os dados através das variáveis, primeiro o a chave, depois o valor
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
        });

        img_coelho.setOnClickListener(v -> {
            Intent passar_dados = new Intent(this, Cuidados.class);
            img_pet = R.drawable.coelho;
            nome_pet = getString(R.string.nome_habbit);
            text_desc = getString(R.string.descricao_coelho);
            text_aliment = getString(R.string.aliment_coelho) + "\n" + getString(R.string.aliment_coelho2);
            text_higiene = getString(R.string.higiene_coelho) + "\n" + getString(R.string.higiene_coelho2);
            text_saude = getString(R.string.saude_coelho) + "\n" + getString(R.string.saude_coelho2);
            text_dica = getString(R.string.dica_coelho1) + "\n\n" + getString(R.string.dica_coelho2) + "\n\n" + getString(R.string.dica_coelho3);
            passar_dados.putExtra("img", img_pet);
            passar_dados.putExtra("nome", nome_pet);
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
        });

        img_roedor.setOnClickListener(v -> {
            Intent passar_dados = new Intent(this, Cuidados.class);
            img_pet = R.drawable.roedor;
            nome_pet = getString(R.string.nome_roedor);
            text_desc = getString(R.string.descricao_roedor);
            text_aliment = getString(R.string.aliment_roedor) + "\n" + getString(R.string.aliment_roedor2);
            text_higiene = getString(R.string.higiene_roedor) + "\n" + getString(R.string.higiene_roedor);
            text_saude = getString(R.string.saude_roedor) + "\n" + getString(R.string.saude_roedor2);
            text_dica = getString(R.string.dica_roedor1) + "\n\n" + getString(R.string.dica_roedor2) + "\n\n" + getString(R.string.dica_roedor3);
            passar_dados.putExtra("img", img_pet);
            passar_dados.putExtra("nome", nome_pet);
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
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