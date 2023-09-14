package com.example.app_sustentavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class Perfil extends AppCompatActivity {

    LinearLayout LLbase;
    ScrollView SCRbase;
    Button btn_cadastro;
    TextView txt_nome_usu, txt_id_usu, txt_nome, txt_sobrenome, txt_id, txt_email, txt_telefone;
    Chip visibilidade;
    String nome, sobrenome, id, email, telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        LLbase = findViewById(R.id.LLbase_false);
        SCRbase = findViewById(R.id.SCRbase);
        btn_cadastro = findViewById(R.id.btn_cadastro);
        txt_nome_usu = findViewById(R.id.txt_nome_usu);
        txt_id_usu = findViewById(R.id.txt_id);
        txt_nome = findViewById(R.id.txt_nome);
        txt_id = findViewById(R.id.txt_id_dados);
        txt_sobrenome = findViewById(R.id.txt_sobrenome);
        txt_email = findViewById(R.id.txt_email);
        txt_telefone = findViewById(R.id.txt_telefone);
        visibilidade = findViewById(R.id.chip_visibilidade);

        Bundle dados = getIntent().getExtras();

        if(dados != null){
            nome = dados.getString("nome");
            sobrenome = dados.getString("sobrenome");
            id = dados.getString("id");
            email = dados.getString("email");
            telefone = dados.getString("telefone");

            txt_nome_usu.setText(nome);
            txt_id_usu.setText(id);

            txt_nome.setText(txt_nome.getText() + nome);
            txt_sobrenome.setText(txt_sobrenome.getText() + sobrenome);
            txt_id.setText(txt_id.getText() + id);
            txt_email.setText(txt_email.getText() + email);
            txt_telefone.setText(txt_telefone.getText() + telefone);
        }

        if(nome != null || sobrenome != null || id != null || email != null ||telefone != null){
            SCRbase.setVisibility(View.VISIBLE);

        }
        else{
            LLbase.setVisibility(View.VISIBLE);

            btn_cadastro.setOnClickListener(v -> {
                Intent ir_cad = new Intent(this, Cadastro.class);
                startActivity(ir_cad);
            });

        }
    }
}