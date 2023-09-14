package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Tutoriais extends AppCompatActivity {

    ImageButton btn_home, btn_video, btn_perfil;

    ImageView img_video1, img_video2, img_video3;

    String titulo_categoria, titulo_categoria1, titulo_video, titulo_video1;

    TextView txt_categoria, txt_video;

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
        txt_categoria = findViewById(R.id.txt_categoria);
        txt_video = findViewById(R.id.txt_video);

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



        titulo_categoria = getString(R.string.titulo_categoria);
        titulo_video = getString(R.string.titulo_video);

        txt_categoria.setText(titulo_categoria);
        txt_video.setText(titulo_video);

    }
}