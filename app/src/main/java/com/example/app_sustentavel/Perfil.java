package com.example.app_sustentavel;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

import java.util.Random;

public class Perfil extends AppCompatActivity implements SensorEventListener {

    LinearLayout LLbase;
    ScrollView SCRbase;
    Button btn_cadastro;
    ImageView img_avatar;
    ImageButton btn_home, btn_video, btn_perfil;
    TextView txt_dados, txt_nome_usu, txt_id_usu, txt_nome, txt_sobrenome, txt_id, txt_email, txt_telefone;
    Chip visibilidade;
    String nome, sobrenome, id, email, telefone, status;
    Integer avatar_int;
    Bitmap avatar;

    SensorManager sensorManager;
    Sensor sensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        LLbase = findViewById(R.id.LLbase_false);
        SCRbase = findViewById(R.id.SCRbase);
        img_avatar = findViewById(R.id.img_avatar);
        btn_cadastro = findViewById(R.id.btn_cadastro);
        txt_nome_usu = findViewById(R.id.txt_nome_usu);
        txt_id_usu = findViewById(R.id.txt_id);
        txt_dados = findViewById(R.id.txt_dados);
        txt_nome = findViewById(R.id.txt_nome);
        txt_id = findViewById(R.id.txt_id_dados);
        txt_sobrenome = findViewById(R.id.txt_sobrenome);
        txt_email = findViewById(R.id.txt_email);
        txt_telefone = findViewById(R.id.txt_telefone);
        visibilidade = findViewById(R.id.chip_visibilidade);
        btn_home = findViewById(R.id.imgbtn_home);
        btn_video = findViewById(R.id.imgbtn_video);
        btn_perfil = findViewById(R.id.imgbtn_perfil);

        Bundle dados = getIntent().getExtras();

        if(dados != null){
            avatar_int = dados.getInt("img");
            avatar = BitmapFactory.decodeResource(getResources(), avatar_int);
            nome = dados.getString("nome");
            sobrenome = dados.getString("sobrenome");
            id = dados.getString("id");
            email = dados.getString("email");
            telefone = dados.getString("telefone");

            img_avatar.setImageBitmap(avatar);
            txt_nome_usu.setText(nome);
            txt_id_usu.setText(id);

            txt_nome.setText(txt_nome.getText() + " " + nome);
            txt_sobrenome.setText(txt_sobrenome.getText() + " " + sobrenome);
            txt_id.setText(txt_id.getText() + " " + id);
            txt_email.setText(txt_email.getText() + " " + email);
            txt_telefone.setText(txt_telefone.getText() + " " + telefone);


            sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE); // Acessar os sensores
            sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); // Acessar o sensor de acelerômetro

            // Atraso de resposta do sensor
            sensorManager.registerListener(Perfil.this, sensor, sensorManager.SENSOR_DELAY_NORMAL);
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

        visibilidade.setOnClickListener(v -> {
            status = String.valueOf(visibilidade.getText());
            if(status.equals("Mostrar")) {
                txt_dados.setVisibility(View.VISIBLE);
                txt_nome.setVisibility(View.VISIBLE);
                txt_sobrenome.setVisibility(View.VISIBLE);
                txt_id.setVisibility(View.VISIBLE);
                txt_email.setVisibility(View.VISIBLE);
                txt_telefone.setVisibility(View.VISIBLE);

                visibilidade.setText(getString(R.string.ocultar));
            }
            else{
                txt_nome.setVisibility(View.INVISIBLE);
                txt_sobrenome.setVisibility(View.INVISIBLE);
                txt_id.setVisibility(View.INVISIBLE);
                txt_email.setVisibility(View.INVISIBLE);
                txt_telefone.setVisibility(View.INVISIBLE);

                visibilidade.setText(getString(R.string.mostrar));
            }
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

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];

        if (x > 18) {
            img_Random(); // Função para mudar a imagem
            mensagem_sensor(); // Função para toast
        }
    }

    private void img_Random() {
        int[] pets = {
                R.drawable.max,
                R.drawable.duke,
                R.drawable.snowball,
                R.drawable.mel,
                R.drawable.chloe,
                R.drawable.gidget
        }; // Array com os nomes da imagens

        Random random = new Random(); // Gera um número aleatório
        int random_Pet = random.nextInt(pets.length); // Gera um número aleatório com no máximo o númeor de imagens

        img_avatar.setImageResource(pets[random_Pet]); // Muda a imagem de acordo com o número
    }

    private void mensagem_sensor() {
        Toast sensor = Toast.makeText(this, "Balence o telefone para mudar a imagem", Toast.LENGTH_SHORT);
        sensor.show();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}