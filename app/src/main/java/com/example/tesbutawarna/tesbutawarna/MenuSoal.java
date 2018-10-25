package com.example.tesbutawarna.tesbutawarna;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MenuSoal extends AppCompatActivity {

    Button diagnosa;
    RadioButton r11,r12,r13,r21,r22,r23,r31,r32,r33,r41,r42,r43,r51,r52,r53,r61,r62,r63,r71,r72,r73,r81,r82,r83,r91,r92,r93,r101,r102,r103;
    RadioButton r111,r112,r113,r121,r122,r123,r131,r132,r133,r141,r142,r143,r151,r152,r153,r161,r162,r163,r171,r172,r173,r181,r182,r183,r191,r192,r193,r201,r202,r203;
    int indexs = 0;
    int hasil = 0;
    int benar = 5;
    int mendekati = 3;
    int salah = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_soal);

        r11 = (RadioButton) findViewById(R.id.jawab11);
        r12 = (RadioButton) findViewById(R.id.jawab12);
        r13 = (RadioButton) findViewById(R.id.jawab13);

        r21 = (RadioButton) findViewById(R.id.jawab21);
        r22 = (RadioButton) findViewById(R.id.jawab22);
        r23 = (RadioButton) findViewById(R.id.jawab23);

        r31 = (RadioButton) findViewById(R.id.jawab31);
        r32 = (RadioButton) findViewById(R.id.jawab32);
        r33 = (RadioButton) findViewById(R.id.jawab33);

        r41 = (RadioButton) findViewById(R.id.jawab41);
        r42 = (RadioButton) findViewById(R.id.jawab42);
        r43 = (RadioButton) findViewById(R.id.jawab43);

        r51 = (RadioButton) findViewById(R.id.jawab51);
        r52 = (RadioButton) findViewById(R.id.jawab52);
        r53 = (RadioButton) findViewById(R.id.jawab53);

        r61 = (RadioButton) findViewById(R.id.jawab61);
        r62 = (RadioButton) findViewById(R.id.jawab62);
        r63 = (RadioButton) findViewById(R.id.jawab63);

        r71 = (RadioButton) findViewById(R.id.jawab71);
        r72 = (RadioButton) findViewById(R.id.jawab72);
        r73 = (RadioButton) findViewById(R.id.jawab73);

        r81 = (RadioButton) findViewById(R.id.jawab81);
        r82 = (RadioButton) findViewById(R.id.jawab82);
        r83 = (RadioButton) findViewById(R.id.jawab83);

        r91 = (RadioButton) findViewById(R.id.jawab91);
        r92 = (RadioButton) findViewById(R.id.jawab92);
        r93 = (RadioButton) findViewById(R.id.jawab93);

        r101 = (RadioButton) findViewById(R.id.jawab101);
        r102 = (RadioButton) findViewById(R.id.jawab102);
        r103 = (RadioButton) findViewById(R.id.jawab103);

        r111 = (RadioButton) findViewById(R.id.jawab111);
        r112 = (RadioButton) findViewById(R.id.jawab112);
        r113 = (RadioButton) findViewById(R.id.jawab113);

        r121 = (RadioButton) findViewById(R.id.jawab121);
        r122 = (RadioButton) findViewById(R.id.jawab122);
        r123 = (RadioButton) findViewById(R.id.jawab123);

        r131 = (RadioButton) findViewById(R.id.jawab131);
        r132 = (RadioButton) findViewById(R.id.jawab132);
        r133 = (RadioButton) findViewById(R.id.jawab133);

        r141 = (RadioButton) findViewById(R.id.jawab141);
        r142 = (RadioButton) findViewById(R.id.jawab142);
        r143 = (RadioButton) findViewById(R.id.jawab143);

        r151 = (RadioButton) findViewById(R.id.jawab151);
        r152 = (RadioButton) findViewById(R.id.jawab152);
        r153 = (RadioButton) findViewById(R.id.jawab153);

        r161 = (RadioButton) findViewById(R.id.jawab161);
        r162 = (RadioButton) findViewById(R.id.jawab162);
        r163 = (RadioButton) findViewById(R.id.jawab163);

        r171 = (RadioButton) findViewById(R.id.jawab171);
        r172 = (RadioButton) findViewById(R.id.jawab172);
        r173 = (RadioButton) findViewById(R.id.jawab173);

        r181 = (RadioButton) findViewById(R.id.jawab181);
        r182 = (RadioButton) findViewById(R.id.jawab182);
        r183 = (RadioButton) findViewById(R.id.jawab183);

        r191 = (RadioButton) findViewById(R.id.jawab191);
        r192 = (RadioButton) findViewById(R.id.jawab192);
        r193 = (RadioButton) findViewById(R.id.jawab193);

        r201 = (RadioButton) findViewById(R.id.jawab201);
        r202 = (RadioButton) findViewById(R.id.jawab202);
        r203 = (RadioButton) findViewById(R.id.jawab203);

        diagnosa = (Button) findViewById(R.id.btnDiagnosa);
        diagnosa.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v){
                hasil = 0;
                benar = 5;
                mendekati = 3;
                salah = 1;

                if (r11.isChecked()==true) hasil = hasil+ mendekati;
                if (r12.isChecked()==true) hasil = hasil+ benar;
                if (r13.isChecked()==true) hasil = hasil+salah;

                if (r21.isChecked()==true) hasil = hasil+salah;
                if (r22.isChecked()==true) hasil = hasil+ mendekati;
                if (r23.isChecked()==true) hasil = hasil+ benar;

                if (r31.isChecked()==true) hasil = hasil+ benar;
                if (r32.isChecked()==true) hasil = hasil+ mendekati;
                if (r33.isChecked()==true) hasil = hasil+salah;

                if (r41.isChecked()==true) hasil = hasil+ benar;
                if (r42.isChecked()==true) hasil = hasil+salah;
                if (r43.isChecked()==true) hasil = hasil+ mendekati;

                if (r51.isChecked()==true) hasil = hasil+ mendekati;
                if (r52.isChecked()==true) hasil = hasil+ benar;
                if (r53.isChecked()==true) hasil = hasil+salah;

                if (r61.isChecked()==true) hasil = hasil+ benar;
                if (r62.isChecked()==true) hasil = hasil+ mendekati;
                if (r63.isChecked()==true) hasil = hasil+salah;

                if (r71.isChecked()==true) hasil = hasil+salah;
                if (r72.isChecked()==true) hasil = hasil+ mendekati;
                if (r73.isChecked()==true) hasil = hasil+ benar;

                if (r81.isChecked()==true) hasil = hasil+ benar;
                if (r82.isChecked()==true) hasil = hasil+ mendekati;
                if (r83.isChecked()==true) hasil = hasil+salah;

                if (r91.isChecked()==true) hasil = hasil+ mendekati;
                if (r92.isChecked()==true) hasil = hasil+salah;
                if (r93.isChecked()==true) hasil = hasil+ benar;

                if (r101.isChecked()==true) hasil = hasil+ benar;
                if (r102.isChecked()==true) hasil = hasil+salah;
                if (r103.isChecked()==true) hasil = hasil+ mendekati;

                if (r111.isChecked()==true) hasil = hasil+salah;
                if (r112.isChecked()==true) hasil = hasil+ benar;
                if (r113.isChecked()==true) hasil = hasil+ mendekati;

                if (r121.isChecked()==true) hasil = hasil+salah;
                if (r122.isChecked()==true) hasil = hasil+ mendekati;
                if (r123.isChecked()==true) hasil = hasil+ benar;

                if (r131.isChecked()==true) hasil = hasil+ mendekati;
                if (r132.isChecked()==true) hasil = hasil+ benar;
                if (r133.isChecked()==true) hasil = hasil+salah;

                if (r141.isChecked()==true) hasil = hasil+salah;
                if (r142.isChecked()==true) hasil = hasil+ benar;
                if (r143.isChecked()==true) hasil = hasil+ mendekati;

                if (r151.isChecked()==true) hasil = hasil+salah;
                if (r152.isChecked()==true) hasil = hasil+ mendekati;
                if (r153.isChecked()==true) hasil = hasil+ benar;

                if (r161.isChecked()==true) hasil = hasil+ mendekati;
                if (r162.isChecked()==true) hasil = hasil+salah;
                if (r163.isChecked()==true) hasil = hasil+ benar;

                if (r171.isChecked()==true) hasil = hasil+ mendekati;
                if (r172.isChecked()==true) hasil = hasil+ benar;
                if (r173.isChecked()==true) hasil = hasil+salah;

                if (r181.isChecked()==true) hasil = hasil+salah;
                if (r182.isChecked()==true) hasil = hasil+ benar;
                if (r183.isChecked()==true) hasil = hasil+ mendekati;

                if (r191.isChecked()==true) hasil = hasil+salah;
                if (r192.isChecked()==true) hasil = hasil+ benar;
                if (r193.isChecked()==true) hasil = hasil+ mendekati;

                if (r201.isChecked()==true) hasil = hasil+ benar;
                if (r202.isChecked()==true) hasil = hasil+salah;
                if (r203.isChecked()==true) hasil = hasil+ mendekati;

                if (hasil<=45){
                    Toast.makeText(getBaseContext(), "Anda Buta Warna Berat", Toast.LENGTH_LONG).show();
                }else if (hasil<=60){
                    Toast.makeText(getBaseContext(), "Anda Buta Sedang", Toast.LENGTH_LONG).show();
                }else if (hasil<=75){
                    Toast.makeText(getBaseContext(), "Anda Buta Warna Ringan", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getBaseContext(), "Anda Tidak Buta Warna", Toast.LENGTH_LONG).show();
                }

                Intent intent = new Intent(MenuSoal.this, Hasil.class);
                intent.putExtra("Hasil", hasil);
                startActivity(intent);
                finish();
            }
        }));
    }

    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(MenuSoal.this, MenuUtama.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart()
    {
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
