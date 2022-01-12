package com.example.timemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
Button paybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        paybutton=findViewById(R.id.pay);
       paybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(PaymentActivity.this,"PAYMENT DONE  SUCCESSFULLY",Toast.LENGTH_LONG).show();
                Intent intToMain=new Intent(PaymentActivity.this,MainActivity.class);
                startActivity(intToMain);
            }
        });
}}
