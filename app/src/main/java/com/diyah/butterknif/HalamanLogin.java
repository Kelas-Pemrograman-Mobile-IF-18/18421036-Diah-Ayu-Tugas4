package com.diyah.butterknif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HalamanLogin extends AppCompatActivity {

    @BindView(R.id.edtNama)
    EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnPindah)
    void pindah() {
        String nama = edtNama.getText().toString();
        Intent i = new Intent(HalamanLogin.this, HalamanRegistrasi.class);
        i.putExtra("nama", nama);
        startActivity(i);
        finish();
    }
}