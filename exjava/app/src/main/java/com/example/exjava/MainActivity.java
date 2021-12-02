package com.example.exjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //criadas variaveis globais que representam os objetos no xml
    EditText edtUsername, edtPassword, edtEmail, edtPhone;
    Button btnSignin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //abrindo activity
        setContentView(R.layout.activity_main);
        //declaradas as variaveis java para apresentar para as variaveis xml
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        edtEmail = findViewById(R.id.edtEmail);
        edtPhone = findViewById(R.id.edtPhone);

        btnSignin = findViewById(R.id.btnSignin);
        btnSignup = findViewById(R.id.btnSignup);

        //ação do botão
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username, password;
                username = edtUsername.getText().toString();
                password = edtPassword.getText().toString();

                if (username.equals("gustavo") && password.equals(123)) {
                    Toast.makeText(getApplicationContext(),"Bem vindo ao sistema!",Toast.LENGTH_SHORT).show();

                    //abrir janela

                    startActivity(new Intent(getApplicationContext(),Menu_Activity.class));
                    finish();

                    Intent intent = new Intent(getApplicationContext(),Menu_Activity.class);
                    startActivity(intent);


                } else {
                    Toast.makeText(getApplicationContext(),"Usuário ou senha inválido!",Toast.LENGTH_SHORT).show();
                    edtUsername.setText("");
                    edtPassword.setText("");
                    edtUsername.requestFocus();

                }


                //Toast.makeText(getApplicationContext(),"Bem vindo ao sistema!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}