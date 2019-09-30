package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmpresaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);
    }

    public void vaiParaCliente(View view){
        Intent it = new Intent(this,ClienteEmpresaActivity.class);
        startActivity(it);
    }

    public void vaiParaSobreEmpresa(View view){
        Intent it = new Intent(this, SobreEmpresaActivity.class);
        startActivity(it);
    }

    public void vaiParaServico(View view){
        Intent it = new Intent(this, EmpresaServicoActivity.class);
        startActivity(it);
    }
}
