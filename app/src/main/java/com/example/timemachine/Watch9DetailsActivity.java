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

public class Watch9DetailsActivity extends AppCompatActivity {
    Button buybutto;
    ImageView rate9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch9_details);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_logoo);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_unnamed);
        buybutto=findViewById(R.id.Buy9);
        rate9=findViewById(R.id.rate9);
        buybutto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(Watch9DetailsActivity.this,"Procedding to Payment",Toast.LENGTH_SHORT).show();
                Intent intToMain=new Intent(Watch9DetailsActivity.this,PaymentActivity.class);
                startActivity(intToMain);
            }
        });
        rate9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInX).duration(700).repeat(1).playOn(rate9);
                Toast.makeText(Watch9DetailsActivity.this,"THANK YOU FOR RATING",Toast.LENGTH_LONG).show();


            }
        });
    }
}