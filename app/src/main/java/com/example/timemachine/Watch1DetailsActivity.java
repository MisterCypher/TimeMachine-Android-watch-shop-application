package com.example.timemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.auth.FirebaseAuth;

public class Watch1DetailsActivity extends AppCompatActivity {
Button buybutton;
ImageView rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch1_details);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_logoo);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_unnamed);
        buybutton=findViewById(R.id.Buy);
        rate=findViewById(R.id.rate);
        buybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(Watch1DetailsActivity.this,"Procedding to Payment",Toast.LENGTH_SHORT).show();
                Intent intToMain=new Intent(Watch1DetailsActivity.this,PaymentActivity.class);
                startActivity(intToMain);
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInX).duration(700).playOn(rate);
                Toast.makeText(Watch1DetailsActivity.this,"THANK YOU FOR RATING",Toast.LENGTH_LONG).show();


            }
        });
    }
}