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

public class Watch7DetailsActivity extends AppCompatActivity {
    Button buybutto;
    ImageView rate7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch7_details);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_logoo);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_unnamed);
        buybutto=findViewById(R.id.Buy7);
        rate7=findViewById(R.id.rate7);
        buybutto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(Watch7DetailsActivity.this,"Procedding to Payment",Toast.LENGTH_SHORT).show();
                Intent intToMain=new Intent(Watch7DetailsActivity.this,PaymentActivity.class);
                startActivity(intToMain);
            }
        });
        rate7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInX).duration(700).repeat(1).playOn(rate7);
                Toast.makeText(Watch7DetailsActivity.this,"THANK YOU FOR RATING",Toast.LENGTH_LONG).show();


            }
        });
    }
}