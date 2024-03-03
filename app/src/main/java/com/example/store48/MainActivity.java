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

        rbMieSagu.setOnClickListener(rb1 -> { harga = 10000 + 2000;  });
        rbSusuKedelai.setOnClickListener(rb2 -> { harga2 = 6000 + 2500;  });
        rbSempolet.setOnClickListener(rb3 -> { harga3 = 10000 + 3000;  });
        rbBolosagu.setOnClickListener(rb4 -> { harga4 = 15000 + 3500;  });
        rbMembership.setOnClickListener(rb5 -> {
            member = 0.05;
        });
    btnSelesai.setOnClickListener(btn -> {
        hasil = harga + harga2 + harga3 + harga4;
        double hasil3 = hasil * member;
        double hasil4 = hasil - hasil3;
        int hasil1 = (int) hasil4;
        String hasil2 = Integer.toString(hasil1);
        tvhasil.setText("Rp. " + hasil2);

    });
        }
    }
