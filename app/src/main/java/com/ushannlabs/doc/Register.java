/***************************************************************************************************
 * Register Class
 * Author: Dieudonne NKUNA OBIANG
 * Profil: Software developer Engineer
 * Date: 30/12/2019
 * Startup : Ushann labs
 **************************************************************************************************/
package com.ushannlabs.doc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    //Init witch widget
    private EditText edtname,edtphone,edtemail,edtPwd;
    private Button btnlogin,btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //references widget since xml file
        edtemail=findViewById(R.id.editEmail);
        edtname=findViewById(R.id.editFullName);
        edtphone=findViewById(R.id.editPhone);
        edtPwd=findViewById(R.id.editPasseWord);
        btnlogin=findViewById(R.id.btnLogin);
        btnregister=findViewById(R.id.btnRegister);

        //Button click listerner-->Login button
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(),Login.class);
                startActivity(mainActivity);
            }
        });
    }
}
