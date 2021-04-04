package com.diyah.butterknif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HalamanRegistrasi extends AppCompatActivity {

    @BindView(R.id.txtNama)
    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_registrasi);

        ButterKnife.bind(this);

        Intent i = getIntent();
        String nama =i.getStringExtra("nama");
        txtNama.setText(nama);
    }
}