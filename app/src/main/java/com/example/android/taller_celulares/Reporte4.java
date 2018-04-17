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
    private String aple;
    private String colo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte4);
        celulares = Datos.obtener();
        recursos = this.getResources();
        aple=recursos.getString(R.string.apple);
        colo=recursos.getString(R.string.negro);
    }

    public void mostrar(View V) {
        int conteo = 0;
        Celular cel;
        for (int i = 0; i < celulares.size(); i++) {
            cel = celulares.get(i);
            if (cel.getMarca().equals(aple) && cel.getColor().equals(colo)) {
                conteo = conteo + 1;
            }
        }
        Toast.makeText(this, "" + conteo, Toast.LENGTH_SHORT).show();
    }
}
