package com.example.app_sustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {

    EditText txt_nome, txt_sobrenome, txt_email, txt_id, txt_telefone;
    Button btn_cadastrar;
    ImageButton btn_home, btn_video, btn_perfil;
    Spinner spn_avatar;
    String nome, sobrenome, id, email, telefone;
    Integer img_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        spn_avatar = findViewById(R.id.sppinner_avatar);
        txt_nome = findViewById(R.id.edt_txt_nome);
        txt_sobrenome = findViewById(R.id.edit_txt_sobrenome);
        txt_id = findViewById(R.id.edt_txt_id);
        txt_email = findViewById(R.id.edt_txt_email);
        txt_telefone = findViewById(R.id.edt_txt_telefone);
        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_avatar, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_avatar.setAdapter(adapter);

        spn_avatar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    img_avatar = R.drawable.max;
                }
                else if(position == 2){
                    img_avatar = R.drawable.duke;
                }
                else if(position == 3){
                    img_avatar = R.drawable.snowball;
                }
                else if(position == 4){
                    img_avatar = R.drawable.mel;
                }
                else if(position == 5){
                    img_avatar = R.drawable.chloe;
                }
                else if(position == 6){
                    img_avatar = R.drawable.gidget;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn_cadastrar.setOnClickListener(v -> {
            nome = String.valueOf(txt_nome.getText());
            sobrenome = String.valueOf(txt_sobrenome.getText());
            id = String.valueOf(txt_id.getText());
            email = String.valueOf(txt_email.getText());
            telefone = String.valueOf(txt_telefone.getText());

            if (nome.equals("Nome") || sobrenome.equals(getString(R.string.sobrenome_exe)) || id.equals("@pet123") || email.equals("example1@email.com") || telefone.equals("(DD) XXXXX-XXXX")) {
                Toast erro = Toast.makeText(this, "Preencha todos os campos e tente novamente", Toast.LENGTH_LONG);
                erro.show();
            } else {
                Intent cadastro = new Intent(this, Perfil.class);
                cadastro.putExtra("img", img_avatar);
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