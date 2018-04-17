package com.example.android.taller_celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private EditText precio1;
    private RadioButton samsung;
    private RadioButton apple;
    private RadioButton huawei;
    private RadioButton nokia;
    private RadioButton dorado;
    private RadioButton negro;
    private RadioButton blanco;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        samsung= findViewById(R.id.ssamsung);
        apple= findViewById(R.id.sapple);
        huawei= findViewById(R.id.shuawei);
        nokia= findViewById(R.id.snokia);
        dorado=findViewById(R.id.sdorado);
        negro=findViewById(R.id.snegro);
        blanco=findViewById(R.id.sblanco);
        precio1=findViewById(R.id.precio);
    }
    public void guardar(View V){
        if (validar()==true) {
            if (samsung.isChecked() == true && dorado.isChecked()) {
                String marc, colo, prec;
                marc = "Samsung";
                colo = "Dorado";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (samsung.isChecked() == true && negro.isChecked()) {
                String marc, colo, prec;
                marc = "Samsung";
                colo = "Negro";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (samsung.isChecked() == true && blanco.isChecked()) {
                String marc, colo, prec;
                marc = "Samsung";
                colo = "Blanco";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (apple.isChecked() == true && dorado.isChecked()) {
                String marc, colo, prec;
                marc = "Apple";
                colo = "Dorado";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (apple.isChecked() == true && negro.isChecked()) {
                String marc, colo, prec;
                marc = "Apple";
                colo = "Negro";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (apple.isChecked() == true && blanco.isChecked()) {
                String marc, colo, prec;
                marc = "Apple";
                colo = "Blanco";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (huawei.isChecked() == true && dorado.isChecked()) {
                String marc, colo, prec;
                marc = "Huawei";
                colo = "Dorado";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (huawei.isChecked() == true && negro.isChecked()) {
                String marc, colo, prec;
                marc = "Huawei";
                colo = "Negro";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (huawei.isChecked() == true && blanco.isChecked()) {
                String marc, colo, prec;
                marc = "Huawei";
                colo = "Blanco";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (nokia.isChecked() == true && dorado.isChecked()) {
                String marc, colo, prec;
                marc = "Nokia";
                colo = "Dorado";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (nokia.isChecked() == true && negro.isChecked()) {
                String marc, colo, prec;
                marc = "Nokia";
                colo = "Negro";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
            if (nokia.isChecked() == true && blanco.isChecked()) {
                String marc, colo, prec;
                marc = "Nokia";
                colo = "Blanco";
                prec = precio1.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void limpiar(View V){
        borrar();
    }

    public void borrar(){
        precio1.setText("");
    }
    public boolean validar(){
        if (precio1.getText().toString().isEmpty()){
            precio1.requestFocus();
            precio1.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(precio1.getText().toString())<1){
            precio1.requestFocus();
            precio1.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
}
