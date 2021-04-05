package com.example.tugasprak2_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnBalok, btnKerucut, btnTabung;
    private TextView tvHasil;
    private EditText etPanjang, etLebar, etTinggi, etJari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBalok = findViewById(R.id.btn_balok);
        btnKerucut = findViewById(R.id.btn_kerucut);
        btnTabung = findViewById(R.id.btn_tabung);
        tvHasil = findViewById(R.id.tv_hasil);
        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);
        etTinggi = findViewById(R.id.et_tinggi);
        etJari = findViewById(R.id.et_jari);

        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sPanjang = etPanjang.getText().toString();
                    String sLebar = etLebar.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double panjang = Double.parseDouble(sPanjang);
                    double lebar = Double.parseDouble(sLebar);
                    double tinggi = Double.parseDouble(sTinggi);

                    double balok = panjang * lebar;

                    String sBalok = String.valueOf(balok);
                    tvHasil.setText(sBalok);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Angka Panjang/Lebar/Tinggi Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sJari = etJari.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double jari = Double.parseDouble(sJari);
                    double tinggi = Double.parseDouble(sTinggi);

                    double tabung = 3.14 * jari * jari *tinggi;

                    String sTabung = String.valueOf(tabung);
                    tvHasil.setText(sTabung);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Angka Jari-Jari/Tinggi Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sJari = etJari.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double jari = Double.parseDouble(sJari);
                    double tinggi = Double.parseDouble(sTinggi);

                    double kerucut = 0.33 * 3.14 * jari * jari * tinggi;

                    String sKerucut = String.valueOf(kerucut);
                    tvHasil.setText(sKerucut);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Angka Jari-Jari/Tinggi Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}