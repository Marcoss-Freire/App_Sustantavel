package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class Cadastro extends AppCompatActivity {

    EditText txt_nome, txt_sobrenome, txt_email, txt_id, txt_telefone;
    Button btn_cadastrar;
    ImageButton btn_home, btn_video, btn_perfil;
    String nome, sobrenome, id, email, telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txt_nome = findViewById(R.id.edt_txt_nome);
        txt_sobrenome = findViewById(R.id.edit_txt_sobrenome);
        txt_id = findViewById(R.id.edt_txt_id);
        txt_email = findViewById(R.id.edt_txt_email);
        txt_telefone = findViewById(R.id.edt_txt_telefone);
        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);

        btn_cadastrar.setOnClickListener(v -> {
            nome = String.valueOf(txt_nome.getText());
            sobrenome = String.valueOf(txt_sobrenome.getText());
            id = String.valueOf(txt_id.getText());
            email = String.valueOf(txt_email.getText());
            telefone = String.valueOf(txt_telefone.getText());

            if (nome.equals("Nome") || sobrenome.equals(getString(R.string.sobrenome_exe)) || id.equals("@pet123") || email.equals("example1@email.com") || telefone.equals("(DD) XXXXX-XXXX")) {
                Toast erro = Toast.makeText(this, "Preencha todos os campos e tente novamente", Toast.LENGTH_LONG);
                erro.show();
            }
            else {
                Intent cadastro = new Intent(this, Perfil.class);
                cadastro.putExtra("nome", nome);
                cadastro.putExtra("sobrenome", sobrenome);
                cadastro.putExtra("id", id);
                cadastro.putExtra("email", email);
                cadastro.putExtra("telefone", telefone);
                startActivity(cadastro);
            }
        });

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