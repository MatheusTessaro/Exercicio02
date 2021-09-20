package com.example.exercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtTel;
    private RadioButton rdbFem;
    private RadioButton rdbMasc;
    private CheckBox chkMusica;
    private CheckBox chkCinema;
    private CheckBox chkEsporte;
    private CheckBox chkGastronomia;
    private Switch swtNotif;
    private Button btnExibir;
    private Button btnLimpar;
    private View lnlExibir;
    private TextView txtNome;
    private TextView txtSexo;
    private TextView txtEmail;
    private TextView txtTel;
    private TextView txtPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtNome.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        edtEmail = findViewById(R.id.edtEmail);
        edtTel = findViewById(R.id.edtTel);
        rdbFem = findViewById(R.id.rdbFem);
        rdbMasc = findViewById(R.id.rdbMasc);
        chkMusica = findViewById(R.id.chkMusica);
        chkCinema = findViewById(R.id.chkCinema);
        chkEsporte = findViewById(R.id.chkEsporte);
        chkGastronomia = findViewById(R.id.chkGastronomia);
        swtNotif = findViewById(R.id.swtNotif);
        btnExibir = findViewById(R.id.btnExibir);
        btnLimpar = findViewById(R.id.btnLimpar);
        lnlExibir = findViewById(R.id.lnlExibir);
        txtNome = findViewById(R.id.txtNome);
        txtSexo = findViewById(R.id.txtSexo);
        txtEmail = findViewById(R.id.txtEmail);
        txtTel = findViewById(R.id.txtSexo);
        txtPref = findViewById(R.id.txtPref);

        btnExibir.setOnClickListener(this);
        btnLimpar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnExibir){
            lnlExibir.setVisibility(View.VISIBLE);
            if(!TextUtils.isEmpty(edtNome.getText())){
                txtNome.setText("Nome: " + edtNome.getText());
            }

            boolean femChecked = ((RadioButton)rdbFem).isChecked();
            boolean masChecked = ((RadioButton)rdbMasc).isChecked();

            if(femChecked){
                txtSexo.setText("genero: " + rdbFem.getText());
            }else if(masChecked){
                txtSexo.setText("Genero: " + rdbMasc.getText());
            }


            if(!TextUtils.isEmpty(edtEmail.getText())){
                txtEmail.setText("E-mail: " + edtEmail.getText());
            }

            if(!TextUtils.isEmpty(edtTel.getText())){
                txtTel.setText("Telefone: " + edtTel.getText());
            }


        }
        else if(view.getId() == R.id.btnLimpar){
            lnlExibir.setVisibility(View.INVISIBLE);
        }

    }


}