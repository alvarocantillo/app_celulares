package com.example.android.taller_celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.function.DoublePredicate;

public class Reporte5 extends AppCompatActivity {
    private Resources recursos;
    private ArrayList<Celular> celulares;
    private String [] opc2;
    private EditText pre;
    private String noki="Nokia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte5);
        celulares=Datos.obtener();
        pre=findViewById(R.id.precio);

    }
    public void mostrar(View V){
        double num=0,res=0;
        for (int i=0;i< celulares.size();i++) {
            Celular c=celulares.get(i);
            if (c.getMarca().equals(noki)){
                num= Double.parseDouble(pre.getText().toString());
                res=num+res;
            }
        }
        Toast.makeText(this, ""+res, Toast.LENGTH_SHORT).show();
    }
}
