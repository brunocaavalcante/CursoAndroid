package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private double alcool;
    private double gasolina;
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       /** Intent it = getIntent();
        alcool = it.getExtras().getDouble("alcool");
        gasolina = it.getExtras().getDouble("gasolina");
        this.exibirResultado();**/
    }

   /** public void exibirResultado(){
        String message = (alcool/gasolina) < 0.7 ? "Alcool" : "Gasolina";
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("Resultado");
        //define a mensagem
        builder.setMessage("O combustivel mais barato é: " + message );
        //define um botão como positivo
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(HomeActivity.this, "positivo=" + arg1, Toast.LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }**/

   public void vaiParaHome(View view) {
       Intent it = new Intent(this, MainActivity.class);
       startActivity(it);
   }

   public void vaiParaIMC(View view){
       Intent it = new Intent(this,CalculoImcActivity.class);
       startActivity(it);
   }

}
