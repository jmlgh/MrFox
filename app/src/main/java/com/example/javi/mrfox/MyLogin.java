package com.example.javi.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {

    TextView tvMrFox, tvRegistro;
    EditText etNombre, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);

        initViews();
        setTypeFace();
    }

    private void initViews() {
        tvMrFox = (TextView) findViewById(R.id.tv_login_mrfox);
        etNombre = (EditText) findViewById(R.id.et_nombre);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyLogin.this, MyMain.class);
                startActivity(i);
            }
        });
    }

    private void setTypeFace() {
        Typeface fuenteMrFox = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        tvMrFox.setTypeface(fuenteMrFox);
    }
}
