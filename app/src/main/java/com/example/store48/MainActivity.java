package com.example.store48;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private TextView tvharga, tvharga2, tvharga3, tvharga5, tvhasil;  // Fixed the name of tvharga4 to tvharga5
    private EditText etTotal, etTotal2, etTotal3, etTotal4;
    private RadioButton rbMieSagu, rbSusuKedelai, rbSempolet, rbBolosagu, rbMembership;
    private Button btnSelesai;

    double hasil;
    double member;
    int harga = 0;
    int harga2 = 0;
    int harga3 = 0;
    int harga4 = 0;
    int jumlahmiesagu = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi

        tvharga = findViewById(R.id.tvharga);
        tvharga2 = findViewById(R.id.tvharga2);
        tvharga3 = findViewById(R.id.tvharga3);
        tvharga5 = findViewById(R.id.tvharga5);
        tvhasil = findViewById(R.id.tvhasil);
        etTotal = findViewById(R.id.etTotal);
        etTotal2 = findViewById(R.id.etTotal2);
        etTotal3 = findViewById(R.id.etTotal3);
        etTotal4 = findViewById(R.id.etTotal4);
        rbMieSagu = findViewById(R.id.rbMieSagu);
        rbSusuKedelai = findViewById(R.id.rbSusukedelai);
        rbSempolet = findViewById(R.id.rbSempolet);
        rbBolosagu = findViewById(R.id.rbBoluSagu);
        rbMembership = findViewById(R.id.rbMembership);
        btnSelesai = findViewById(R.id.button2);

        String jmlhMie = etTotal.getText().toString();
        String jmlhSusu = etTotal2.getText().toString();
        String jmlhSempolet = etTotal3.getText().toString();
        String jmlhBolu = etTotal4.getText().toString();



        rbMieSagu.setOnClickListener(rb1 -> {
            harga = (10000 + 2000);
        });

        rbSusuKedelai.setOnClickListener(rb2 -> {
            harga2 = (6000 + 2500);
        });

        rbSempolet.setOnClickListener(rb3 -> {
            harga3 = (10000 + 3000);
        });

        rbBolosagu.setOnClickListener(rb4 -> {
            harga4 = (15000 + 3500);
        });

        rbMembership.setOnClickListener(rb5 -> {
            member = 0.05;
        });

        btnSelesai.setOnClickListener(btn -> {
            // Mengambil nilai dari EditText untuk setiap item
            int jumlahMieSagu = Integer.parseInt(etTotal.getText().toString());
            int jumlahSusuKedelai = Integer.parseInt(etTotal2.getText().toString());
            int jumlahSempolet = Integer.parseInt(etTotal3.getText().toString());
            int jumlahBoluSagu = Integer.parseInt(etTotal4.getText().toString());

            // Menghitung total harga untuk setiap item
            int totalHargaMieSagu = (10000 + 2000) * jumlahMieSagu;
            int totalHargaSusuKedelai = (6000 + 2500) * jumlahSusuKedelai;
            int totalHargaSempolet = (10000 + 3000) * jumlahSempolet;
            int totalHargaBoluSagu = (15000 + 3500) * jumlahBoluSagu;

            // Menjumlahkan total harga dari semua item
            int totalHarga = totalHargaMieSagu + totalHargaSusuKedelai + totalHargaSempolet + totalHargaBoluSagu;

            // Menghitung total harga setelah diskon member
            double diskon = 1.0;
            if (rbMembership.isChecked()) {
                diskon = 0.95; // Diskon 5% untuk member
            }
            double totalHargaSetelahDiskon = totalHarga * diskon;

            // Menampilkan total harga
            tvhasil.setText("Rp. " + totalHargaSetelahDiskon);
        });

    }
}
