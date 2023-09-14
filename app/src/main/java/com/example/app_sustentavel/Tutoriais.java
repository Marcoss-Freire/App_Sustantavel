package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Tutoriais extends AppCompatActivity {

    ImageButton btn_home, btn_video, btn_perfil;

    ImageView img_video1, img_video2, img_video3;

    String titulo_categoria, titulo_video;

    TextView txt_video, txt_categoria, txt_video2, txt_categorias2, txt_video3, txt_categoria3;

    Chip chip_papelao, chip_tecido, chip_papel, chip_plastico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoriais);

        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);
        img_video1 = findViewById(R.id.img_video1);
        img_video2 = findViewById(R.id.img_video2);
        img_video3 = findViewById(R.id.img_video3);
        txt_video = findViewById(R.id.txt_video);
        txt_video2 = findViewById(R.id.txt_video2);
        txt_video3 = findViewById(R.id.txt_video3);
        txt_categoria = findViewById(R.id.txt_categoria);
        txt_categorias2 = findViewById(R.id.txt_categorias2);
        txt_categoria3 = findViewById(R.id.txt_categoria3);
        chip_papelao = findViewById(R.id.chip_papelao);
        chip_tecido = findViewById(R.id.chip_tecido);
        chip_papel = findViewById(R.id.chip_papel);
        chip_plastico = findViewById(R.id.chip_plastico);



        img_video1.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/watch?v=vvZ4IyDOMoM&list=PLN3vAG4T-2AitMRsH5GEGAEuM6yfy5Qes&index=1");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        img_video2.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/watch?v=zla-yGkUxko&list=PLN3vAG4T-2AitMRsH5GEGAEuM6yfy5Qes&index=14");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        img_video3.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/watch?v=5R5Bby4SKio&list=PLN3vAG4T-2AitMRsH5GEGAEuM6yfy5Qes&index=8");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        chip_papelao.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/results?search_query=como+fazer+brinquedos+e+acessorios+com+papel%C3%A3o+para+gatos+e+cachorros");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        chip_tecido.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/results?search_query=como+fazer+brinquedos+e+acessorios+com+tecido+para+gatos+e+cachorros");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        chip_papel.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/results?search_query=como+fazer+brinquedos+e+acessorios+com+papel+para+gatos+e+cachorros");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        chip_plastico.setOnClickListener(v -> {
            Uri youtube = Uri.parse("https://www.youtube.com/results?search_query=como+fazer+brinquedos+e+acessorios+com+garrafa+pet+para+gatos+e+cachorros");
            Intent video = new Intent(Intent.ACTION_VIEW, youtube);
            startActivity(video);
        });

        titulo_video = getString(R.string.titulo_video1);
        txt_video.setText(titulo_video);

        titulo_categoria = getString(R.string.titulo_categoria1);
        txt_categoria.setText(titulo_categoria);

        titulo_video = getString(R.string.titulo_video2);
        txt_video2.setText(titulo_video);

        titulo_categoria = getString(R.string.titulo_categoria4);
        txt_categorias2.setText(titulo_categoria);

        titulo_video = getString(R.string.titulo_video3);
        txt_video3.setText(titulo_video);

        titulo_categoria = getString(R.string.titulo_categoria2);
        txt_categoria3.setText(titulo_categoria);

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