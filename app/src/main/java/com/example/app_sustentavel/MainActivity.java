package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    // Criando variáveis Globais
    ImageView img_dog, img_cat, img_video1, img_video2, img_video3, img_mais;
    ImageButton btn_video, btn_perfil;
    TextView txt_mais;
    Spinner primeiros_socorros;
    String nome_pet, text_desc, text_aliment, text_higiene, text_saude, text_dica;
    String nome_tipo, conteudo_tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciando os elementos
        txt_mais = findViewById(R.id.txt_vermais);
        img_dog = findViewById(R.id.img_cuidado_dog);
        img_cat = findViewById(R.id.img_cuidado_cat);
        primeiros_socorros = findViewById(R.id.spinner_socorro);
        img_video1 = findViewById(R.id.img_video);
        img_video2 = findViewById(R.id.img_video2);
        img_video3 = findViewById(R.id.img_video3);
        img_mais = findViewById(R.id.img_mais);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);

        // Programação da parte de cuidados
        txt_mais.setOnClickListener(v ->{
            Intent tela_tipos = new Intent(MainActivity.this, Tipos.class);
            startActivity(tela_tipos);
        });

        img_dog.setOnClickListener(v -> {
            Intent passar_dados = new Intent(MainActivity.this, Cuidados.class);
            nome_pet = getString(R.string.nome_dog);
            text_desc = getString(R.string.descricao_dog);
            text_aliment = getString(R.string.aliment_dog) + "\n" + getString(R.string.aliment_dog2); // O \n quebra linha
            text_higiene = getString(R.string.higiene_dog);
            text_saude = getString(R.string.saude_dog) + "\n" + getString(R.string.saude_dog2);
            text_dica = getString(R.string.dica_dog1) + "\n\n" + getString(R.string.dica_dog2) + "\n\n" + getString(R.string.dica_dog3);
            passar_dados.putExtra("nome", nome_pet); // Passando os dados através das variáveis, primeiro o a chave, depois o valor
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
        });

        img_cat.setOnClickListener(v -> {
            Intent passar_dados = new Intent(MainActivity.this, Cuidados.class);
            nome_pet = getString(R.string.nome_cat);
            text_desc = getString(R.string.descricao_cat);
            text_aliment = getString(R.string.aliment_cat) + "\n" + getString(R.string.aliment_cat2);
            text_higiene = getString(R.string.higiene_cat) + "\n" + getString(R.string.higiene_cat2);
            text_saude = getString(R.string.saude_cat) + "\n" + getString(R.string.saude_cat2);
            text_dica = getString(R.string.dica_cat1) + "\n\n" + getString(R.string.dica_cat2) + "\n\n" + getString(R.string.dica_cat3);
            passar_dados.putExtra("nome", nome_pet);
            passar_dados.putExtra("descricao", text_desc);
            passar_dados.putExtra("aliment", text_aliment);
            passar_dados.putExtra("higiene", text_higiene);
            passar_dados.putExtra("saude", text_saude);
            passar_dados.putExtra("dica", text_dica);
            startActivity(passar_dados);
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array_tipo, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        primeiros_socorros.setOnItemSelectedListener(this);

        img_video1.setOnClickListener(v ->{
            Uri youtube = Uri.parse("https://youtu.be/XSeFRgFjzrc?si=oQou-H3yKv4eV-iB");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        img_video2.setOnClickListener(v ->{
            Uri youtube = Uri.parse("https://youtu.be/XSeFRgFjzrc?si=oQou-H3yKv4eV-iB");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        img_video3.setOnClickListener(v ->{
            Uri youtube = Uri.parse("https://youtu.be/XSeFRgFjzrc?si=oQou-H3yKv4eV-iB");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        img_mais.setOnClickListener(v -> {
            Intent tutoriais = new Intent(MainActivity.this, Tutoriais.class);
            startActivity(tutoriais);
        });

        //Programação NavBar
        btn_video.setOnClickListener(v -> {
            Intent video = new Intent(this, Tutoriais.class);
            startActivity(video);
        });

        btn_perfil.setOnClickListener(v -> {
            Intent perfil = new Intent(this, Perfil.class);
            startActivity(perfil);
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 1: {
                Intent dados_socorro = new Intent(MainActivity.this, Primeiros_socorros.class);
                nome_tipo = getString(R.string.scr_txt_engasgo);
                conteudo_tipo = getString(R.string.engasgo) + "\n" + getString(R.string.engasgo2);

                dados_socorro.putExtra("nome", nome_tipo);
                dados_socorro.putExtra("conteudo", conteudo_tipo);
                startActivity(dados_socorro);
                break;
            }
            case 2: {
                Intent dados_socorro = new Intent(MainActivity.this, Primeiros_socorros.class);
                nome_tipo = getString(R.string.scr_txt_queima);
                conteudo_tipo = getString(R.string.queimadura);

                dados_socorro.putExtra("nome", nome_tipo);
                dados_socorro.putExtra("conteudo", conteudo_tipo);
                startActivity(dados_socorro);
                break;
            }
            case 3: {
                Intent dados_socorro = new Intent(MainActivity.this, Primeiros_socorros.class);
                nome_tipo = getString(R.string.scr_txt_frat);
                conteudo_tipo = getString(R.string.frat) + "\n" + getString(R.string.frat2);

                dados_socorro.putExtra("nome", nome_tipo);
                dados_socorro.putExtra("conteudo", conteudo_tipo);
                startActivity(dados_socorro);
                break;
            }
            case 4: {
                Intent dados_socorro = new Intent(MainActivity.this, Primeiros_socorros.class);
                nome_tipo = getString(R.string.scr_txt_into);
                conteudo_tipo = getString(R.string.intoxicacao);

                dados_socorro.putExtra("nome", nome_tipo);
                dados_socorro.putExtra("conteudo", conteudo_tipo);
                startActivity(dados_socorro);
                break;
            }
            case 5: {
                Intent dados_socorro = new Intent(MainActivity.this, Primeiros_socorros.class);
                nome_tipo = getString(R.string.scr_txt_corte);
                conteudo_tipo = getString(R.string.corte);

                dados_socorro.putExtra("nome", nome_tipo);
                dados_socorro.putExtra("conteudo", conteudo_tipo);
                startActivity(dados_socorro);
                break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
