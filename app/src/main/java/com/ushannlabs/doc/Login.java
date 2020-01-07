/***************************************************************************************************
 * Login Class
 * Author: Dieudonne NKUNA OBIANG
 * Profil: Software developer Engineer
 * Date: 30/12/2019
 * Startup : Ushann labs
 **************************************************************************************************/



package com.ushannlabs.doc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class Login extends AppCompatActivity {

    /***********************************************************************************************
     *Methode d'initialisation au lancement de l'interface graphique de connextion
     **********************************************************************************************/
    private EditText edtemail,edtPwd;
    private Button btnlogin,btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initialisation des objets par referencement
        edtemail=findViewById(R.id.editEmail);
        edtPwd=findViewById(R.id.editPasseWord);
        btnlogin=findViewById(R.id.btnLogin);
        btnregister=findViewById(R.id.btnRegister);

        //Action du bouton se connecter
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myProgress();
                Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);
            }
        });

        //Action du bouton creer un compte
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //myProgress();
                Intent mainActivity = new Intent(getApplicationContext(),Register.class);
                startActivity(mainActivity);
            }
        });


    }

    //methode d'affichage de la progression
    private void myProgress() {

        SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Connexion...");
        pDialog.setCancelable(false);
        pDialog.show();
    }
}
