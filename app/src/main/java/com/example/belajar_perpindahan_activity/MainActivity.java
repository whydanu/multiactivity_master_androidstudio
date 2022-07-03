package com.example.belajar_perpindahan_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //membuat inisiasi/code/nama panggilan di xml tombol button
    private Button secondbutton,thirdbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //masukan kode yang berada di private....
        //kode untuk koneksi/sambungan ke tombol button id xml
        secondbutton = findViewById(R.id.btn_kedua);
        thirdbutton = findViewById((R.id.btn_ketiga));

        //mengaktifkan tombol klik  tombol
        //panggil privat button
        //akhir sesuaikan class yang mau di integrasikan ("inten dkk)
        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, SecondActivity.class); //class utama dan class yang mau disambunkan
                startActivity(intent); // mengaktifkan intent
            }
        });
        //tombol ke 3 kode sama seperti tombol ke 2
        thirdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
    //kode simpel pindah aktifiti
    public void masuk(View view) {
        Intent i = new Intent  (MainActivity.this,SecondActivity.class);
        startActivity(i);
        //finish();
    }

    public void masuk2(View view) {
        Intent a = new Intent(MainActivity.this,ThirdActivity.class);
        startActivity(a);
    }
}