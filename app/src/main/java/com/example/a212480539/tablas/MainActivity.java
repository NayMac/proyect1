package com.example.a212480539.tablas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUsuario,edPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edUsuario = findViewById(R.id.edUsuario);
        edPass = findViewById(R.id.edPass);
        Button BtnInicio = findViewById(R.id.btiniciar);


       BtnInicio.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String StrUsuario = edUsuario.getText().toString();
               String StrPass = edPass.getText().toString();
               if(!StrUsuario.equals("Erick") && StrPass.equals("hola")){
                   Toast.makeText(getApplicationContext(), "Hola", Toast.LENGTH_LONG).show();
               }else{
                   Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_LONG).show();
               }
           }
       });

    }
}
