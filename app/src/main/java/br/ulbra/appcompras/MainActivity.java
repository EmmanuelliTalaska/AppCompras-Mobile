package br.ulbra.appcompras;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkarroz, chkleite, chkcarne, chkfeijao, chkrefri;
    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chkarroz = (CheckBox) findViewById(R.id.chkArroz);
        chkleite = (CheckBox) findViewById(R.id.chkLeite);
        chkcarne = (CheckBox) findViewById(R.id.chkCarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkFeijão);
        chkrefri = (CheckBox) findViewById(R.id.chkRefri);
        Button bttotal = (Button) findViewById(R.id.bttotal);
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked()) {
                    total += 2.69;
                }
                if (chkleite.isChecked()) {
                    total += 5.00;
                }
                if (chkcarne.isChecked()) {
                    total += 10.00;
                }
                if (chkfeijao.isChecked()) {
                    total += 2.30;
                }
                if (chkrefri.isChecked()) {
                    total += 2.00;
                }
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra :" + String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}


