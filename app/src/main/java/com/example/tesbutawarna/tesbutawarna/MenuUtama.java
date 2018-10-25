package com.example.tesbutawarna.tesbutawarna;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    Button keluar, tentang, mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        //tombol keluar
        keluar = (Button) findViewById(R.id.btnKeluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Memanggil AlertDialog
                showExitDialog();
            }
        });
        //tombol tentang
        tentang = (Button) findViewById(R.id.btnTentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil alert
                showTentangDialog();
                //Dibawah merupakan kode inten pindah aktifitas dengan tombol
                //Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //startActivity(intent);
            }
        });
        //tombol mulai
        mulai = (Button) findViewById(R.id.btnMulai);
        mulai.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuSoal.class);
                startActivity(intent);
                finish();
            }
        }));
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


    //fungsi menekan tombol back handphone
    public void onBackPressed(){
        //memanggil alert dialog
        showExitDialog();
    }

    //pembuatan alert yang akan di panggil
    private void showTentangDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Aplikasi buta warna ini merupakan aplikasi untuk" +
                        " menguji kesehatan mata anda dari penyakit buta warna" +
                        " klik tombol 'Mulai' untuk memulai tes buta warna" +
                        " dan Jawab soal dengan teliti." +
                        " Nilai <= 30 Buta Warna Berat" +
                        " Nilai <= 60 Buta Warna Sedang" +
                        " Nilai <= 75 Buta Warna Ringan" +
                        " Nilai > 75 Bebas Buta Warna")
                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    //pembuatan alert yang akan di panggil
    private void showExitDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Yakin Ingin Keluar ?")
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

