package org.escoladeltreball.rranguera.lifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG = "RR_MainAct";

    private Button btn1_bipolaritzar;
    private CheckBox chk1;

    private Button btn2_calcular;
    private RadioButton rdb1_sum;
    private RadioButton rdb2_prod;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG, "S'ha executat onCreate()");

        setup();
    }



    private void setup() {
        btn1_bipolaritzar = (Button) findViewById(R.id.btn_canviarCheckBox);
        chk1 = (CheckBox) findViewById(R.id.chk_bipolar);

        btn1_bipolaritzar.setOnClickListener(v -> canviarEstat());


        btn2_calcular = (Button) findViewById(R.id.btn_calcular);
        rdb1_sum = (RadioButton) findViewById(R.id.rdb_suma);
        rdb2_prod = (RadioButton) findViewById(R.id.rdb_producte);

        btn2_calcular.setOnClickListener(v -> ferCalcul());
    }



    private void ferCalcul() {

        Toast.makeText(this, "---olakase, aquí resultat operació---", Toast.LENGTH_LONG).show();
    }



    private void canviarEstat() {
/*
        if (chk1.isChecked()){
            chk1.setChecked(false);
        }
        else {
            chk1.setChecked(true);
        }
*/
        chk1.setChecked(!chk1.isChecked());

    }



    //proves de log

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG, "S'ha executat onStart()");
    }




    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.d(LOG, "S'ha executat onConfigurationChanged()");
    }
}
