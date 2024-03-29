package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CalculoImcActivity extends AppCompatActivity {

    private EditText txtIdade;
    private EditText txtAltura;
    private EditText txtPeso;
    private Button btnCalcularIMC;
    private TextView txtResultado;
    private ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);

        txtIdade = findViewById(R.id.editTextIdade);
        txtAltura = findViewById(R.id.editTextAltura);
        txtPeso = findViewById(R.id.editTextPeso);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcularIMC = findViewById(R.id.btnCalcularImcId);
        imgResultado = findViewById(R.id.imageResultado);

    }

    public void CalcularIMC(View view){
        double peso = 0.0;
        double altura = 0.0;
        int idade;
        double resultado;

        peso = Double.parseDouble(txtPeso.getText().toString());
        altura = Double.parseDouble(txtAltura.getText().toString());
        resultado =  peso/(altura * altura);


            if (resultado < 18.5) {
                this.txtResultado.setText("Magro");
                this.imgResultado.setImageResource(R.drawable.magro);
            } else if (resultado >= 18.5 && resultado < 24.9) {
                this.txtResultado.setText("Normal");
                this.imgResultado.setImageResource(R.drawable.fitness);
            } else if (resultado <= 24.9 && resultado < 29.9) {
                this.txtResultado.setText("Gordão hein");
                this.imgResultado.setImageResource(R.drawable.gordo);
            } else {
                this.txtResultado.setText("Lascou");
                this.imgResultado.setImageResource(R.drawable.gordo);
            }
        }
}
