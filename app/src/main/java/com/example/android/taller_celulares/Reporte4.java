package com.example.android.taller_celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Reporte4 extends AppCompatActivity {
    private Resources recursos;
    private ArrayList<Celular> celulares;
    private String [] opc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte4);
        celulares=Datos.obtener();
        opc2=getResources().getStringArray(R.array.opcioneslistar);
    }
    public void mostrar(View V){
        int conteo=0;
        Toast.makeText(this, ""+conteo, Toast.LENGTH_SHORT).show();
    }
}
