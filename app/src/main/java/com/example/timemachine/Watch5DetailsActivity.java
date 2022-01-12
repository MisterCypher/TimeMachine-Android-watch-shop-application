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

public class Watch5DetailsActivity extends AppCompatActivity {
    Button buybutto;
    ImageView rate5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch5_details);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_logoo);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_unnamed);
        buybutto=findViewById(R.id.Buy5);
        rate5=findViewById(R.id.rate5);
        buybutto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(Watch5DetailsActivity.this,"Procedding to Payment",Toast.LENGTH_SHORT).show();
                Intent intToMain=new Intent(Watch5DetailsActivity.this,PaymentActivity.class);
                startActivity(intToMain);
            }
        });
        rate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInX).duration(700).repeat(1).playOn(rate5);
                Toast.makeText(Watch5DetailsActivity.this,"THANK YOU FOR RATING",Toast.LENGTH_LONG).show();


            }
        });
    }
}