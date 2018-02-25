package com.example.android.rahmanda_1202150065_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
        username=(EditText)findViewById(R.id.et_username); //deklarasikan username
        password=(EditText)findViewById(R.id.et_password); //deklarasikan password

        //pengondisian untuk username dan password, jika match maka akan lanjut ke ListMineral.class
        if (username.getText().toString().equals("EAD")&& password.getText().toString().equals("MOBILE")){
            startActivity(new Intent(getApplicationContext(), ListMineral.class));
            Toast.makeText(getApplicationContext(),"Login Berhasil", Toast.LENGTH_SHORT).show(); //untuk menampilkan tulisan jika login berhasil
        }else {
            Toast.makeText(getApplicationContext(), "Username or Password is wrong !", Toast.LENGTH_SHORT).show(); //untuk menampilkan tulisan jika login gagal
        }
    }
}
