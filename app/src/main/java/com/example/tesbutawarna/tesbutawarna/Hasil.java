package com.example.tesbutawarna.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Hasil extends AppCompatActivity {

    Button cobaLagi, selesai;
    TextView textNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent ambil = getIntent();
        textNilai = (TextView)findViewById(R.id.nilai);
        int hasil = getIntent().getIntExtra("Hasil", 0);

        textNilai.setText("Nilai Anda = " + hasil);

        if (hasil<=45){
            textNilai.setText("Nilai Anda = " + hasil + "\nAnda Buta Warna Berat");
        }else if (hasil<=60){
            textNilai.setText("Nilai Anda = " + hasil + "\nAnda Buta Warna Sedang");
        }else if (hasil<=75){
            textNilai.setText("Nilai Anda = " + hasil + "\nAnda Buta Warna Ringan");
        }else{
            textNilai.setText("Nilai Anda = " + hasil + "\nAnda Bebas Buta Warna");
        }

        selesai = (Button) findViewById(R.id.btnSelesai);
        selesai.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hasil.this, MenuUtama.class);
                startActivity(intent);
                finish();
            }
        }));

        cobaLagi = (Button) findViewById(R.id.btnCobaLagi);
        cobaLagi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hasil.this, MenuSoal.class);
                startActivity(intent);
                finish();
            }
        }));
    }

    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(Hasil.this, MenuUtama.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}
