package com.example.android.taller_celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private EditText pre;
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
        pre=findViewById(R.id.precio_campo);
        recursos = this.getResources();
    }
    public void guardar(View V){
        if (validar()) {
            if (samsung.isChecked() && dorado.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.samsung);
                colo = recursos.getString(R.string.dorado);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (samsung.isChecked() && negro.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.samsung);
                colo = recursos.getString(R.string.negro);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (samsung.isChecked() && blanco.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.samsung);
                colo = recursos.getString(R.string.blanco);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (apple.isChecked() && dorado.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.apple);
                colo = recursos.getString(R.string.dorado);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (apple.isChecked() && negro.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.apple);
                colo = recursos.getString(R.string.negro);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (apple.isChecked() && blanco.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.apple);
                colo = recursos.getString(R.string.blanco);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (huawei.isChecked() && dorado.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.huawei);
                colo = recursos.getString(R.string.dorado);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (huawei.isChecked() && negro.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.huawei);
                colo = recursos.getString(R.string.negro);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (huawei.isChecked() && blanco.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.huawei);
                colo = recursos.getString(R.string.blanco);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (nokia.isChecked() && dorado.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.nokia);
                colo = recursos.getString(R.string.dorado);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (nokia.isChecked() && negro.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.nokia);
                colo = recursos.getString(R.string.negro);
                prec = pre.getText().toString();
                Celular c = new Celular(marc, colo, prec);
                c.guardar();
                Toast.makeText(this, getResources().getString(R.string.mensaje_guardado), Toast.LENGTH_SHORT).show();
            } else if (nokia.isChecked() && blanco.isChecked()) {
                String marc, colo, prec;
                marc = recursos.getString(R.string.nokia);
                colo = recursos.getString(R.string.blanco);
                prec = pre.getText().toString();
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
        pre.setText("");
    }
    public boolean validar(){
        if (pre.getText().toString().isEmpty()){
            pre.requestFocus();
            pre.setError(recursos.getString(R.string.error_1));
            return false;
        }
        if (Double.parseDouble(pre.getText().toString())<1){
            pre.requestFocus();
            pre.setError(recursos.getString(R.string.error_2));
            return false;
        }

        return true;
    }
}
