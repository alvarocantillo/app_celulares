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
    private EditText pre;
    private String noki="Nokia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte5);
        celulares=Datos.obtener();
        pre=findViewById(R.id.precio_campo);

    }
    public void mostrar5(View V){
        double num=0,res=0,prom=0;
        int con=0;
        Celular c;
        for (int i=0;i< celulares.size();i++) {
            c=celulares.get(i);
            if (c.getMarca().equals(noki)){
                num= Double.parseDouble(c.getPrecio());
                res=num+res;
                con=con+1;
            }
        }
        prom=res/con;
        if (prom>0){
            Toast.makeText(this, "" + prom, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
        }
    }
}
