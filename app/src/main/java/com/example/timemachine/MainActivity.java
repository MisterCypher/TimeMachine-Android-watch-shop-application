package com.example.timemachine;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/*import com.example.timemachine.adapter.NewReleaseRecyclerAdapter;
import com.example.timemachine.adapter.NewReleaseRecyclerAdapter;
import com.example.timemachine.model.NewRelease;*/
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
   /* private RecyclerView recyclerView;
    NewReleaseRecyclerAdapter newReleaseRecyclerAdapter;
   public List<NewRelease> newReleaseList;*/
  Button btnLogout,searchbutton;
    ImageView watch1,watch2,watch3,watch4,watch5,watch6,watch7,watch8,watch9,watch10;
    TextView tv1;
ConstraintLayout mainn;

    @Override
    protected void onCreate(Bundle savedInstanceState){

       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogout=findViewById(R.id.logout);
        searchbutton=findViewById(R.id.searchbutton);
        tv1=findViewById(R.id.search);
        btnLogout=findViewById(R.id.logout);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_logoo);
    //  recyclerView= findViewById(R.id.recyclerview);
       watch1=findViewById(R.id.watch1);
       watch2=findViewById(R.id.watch2);
        watch3=findViewById(R.id.watch3);
        watch4=findViewById(R.id.watch4);
        watch5=findViewById(R.id.watch5);
        watch6=findViewById(R.id.watch6);
        watch7=findViewById(R.id.watch7);
        watch8=findViewById(R.id.watch8);
        watch9=findViewById(R.id.watch9);
        watch10=findViewById(R.id.watch10);
       mainn=findViewById(R.id.mainn);
        YoYo.with(Techniques.RotateInUpRight).duration(1500).playOn(mainn);


        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intToMain=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intToMain);
            }
        });
     searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
String tvv1=tv1.getText().toString().trim();
if(tvv1.equals("ultra"))
{
    Intent intToMain=new Intent(MainActivity.this,Watch1DetailsActivity.class);
    startActivity(intToMain);

}


            }
        });
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvv1=tv1.getText().toString().trim();
                if(tvv1.equals("ultra"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch1DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("gold"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch2DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("pro"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch3DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("oneplus"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch4DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("superman"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch5DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("wooden"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch6DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("stylish"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch7DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("black"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch8DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("elegant"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch9DetailsActivity.class);
                    startActivity(intToMain);

                }
                if(tvv1.equals("sports"))
                {
                    Intent intToMain=new Intent(MainActivity.this,Watch10DetailsActivity.class);
                    startActivity(intToMain);

                }




            }
        });

      watch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch2);

                Intent intToMain=new Intent(MainActivity.this,Watch1DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch2);
                Intent intToMain=new Intent(MainActivity.this,Watch2DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch3);
                Intent intToMain=new Intent(MainActivity.this,Watch3DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch4);
                Intent intToMain=new Intent(MainActivity.this,Watch4DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch5);
                Intent intToMain=new Intent(MainActivity.this,Watch5DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch6);
                Intent intToMain=new Intent(MainActivity.this,Watch6DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch7);
                Intent intToMain=new Intent(MainActivity.this,Watch7DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch8);
                Intent intToMain=new Intent(MainActivity.this,Watch8DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch9);
                Intent intToMain=new Intent(MainActivity.this,Watch9DetailsActivity.class);
                startActivity(intToMain);
            }
        });
        watch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(watch10);
                Intent intToMain=new Intent(MainActivity.this,Watch10DetailsActivity.class);
                startActivity(intToMain);
            }
        });

    }
}