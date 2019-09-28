package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText alcool;
    private EditText gasosa;
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.gasosa = findViewById(R.id.editTextGasolina);
        this.alcool = findViewById(R.id.editTextAlcool);
    }

    public void calcular(View view){
        Double v_alcool = Double.parseDouble(this.alcool.getText().toString());
        Double v_gasolina = Double.parseDouble(this.gasosa.getText().toString());
        String resultado = (v_alcool/v_gasolina) < 0.7 ? "Alcool":"Gasolina";

            //Cria o gerador do AlertDialog
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //define o titulo
            builder.setTitle("Resultado");
            //define a mensagem
            builder.setMessage("O combustivel mais barato é: " + resultado );
            //define um botão como positivo
            builder.setPositiveButton("Abastecer", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface arg0, int arg1) {
                    Toast.makeText(MainActivity.this, "positivo=" + arg1, Toast.LENGTH_SHORT).show();
                }
            });
            //define um botão como negativo.
            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface arg0, int arg1) {
                    Toast.makeText(MainActivity.this, "negativo=" + arg1, Toast.LENGTH_SHORT).show();
                }
            });
        //Passando parametros para outra Activity
        Intent it = new Intent(this,HomeActivity.class);
        it.putExtra("alcool",v_alcool);
        it.putExtra("gasolina",v_gasolina);
        startActivity(it);

        //cria o AlertDialog
            alerta = builder.create();
            //Exibe
            alerta.show();
    }

    public void vaiParaHome(View view){

        Double v_alcool = Double.parseDouble(this.alcool.getText().toString());
        Double v_gasolina = Double.parseDouble(this.gasosa.getText().toString());
        //Passando parametros para outra Activity

        Intent it = new Intent(this,HomeActivity.class);
        it.putExtra("alcool",v_alcool);
        it.putExtra("gasolina",v_gasolina);
        startActivity(it);
    }
}
