package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_pindah;
    EditText et_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Layout A");

        btn_pindah = findViewById(R.id.btn_pindah);
        et_nama = findViewById(R.id.et_nama);

        btn_pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = et_nama.getText().toString();

                if(nama.trim().equals("")){
                    et_nama.setError("Nama harus Diisi!");
                }else{
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    pindah.putExtra("xNama", nama);
                    startActivity(pindah);
                }



            }
        });

    }
}