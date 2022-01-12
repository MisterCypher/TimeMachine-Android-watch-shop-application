package com.example.timemachine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    EditText emailid,uname,password,contact,name;
    Button btnSignUp;
    TextView tvSignIn;
    FirebaseAuth mFirebaseAuth;

ConstraintLayout news;
    Button submit;
    public DatabaseReference reff;
     register register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        news=findViewById(R.id.news);
        YoYo.with(Techniques.RotateInUpRight).duration(1500).playOn(news);
        mFirebaseAuth= FirebaseAuth.getInstance();
        emailid=findViewById(R.id.email);
        password=findViewById(R.id.password);
        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        uname=findViewById(R.id.uname);



        register=new register();




        reff= FirebaseDatabase.getInstance().getReference().child("registerationdata");
        btnSignUp=findViewById(R.id.register);
        tvSignIn=findViewById(R.id.signin);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=emailid.getText().toString();
                String pwd=password.getText().toString();

                if(email.isEmpty()){
                    emailid.setError("Please enter email id");
                    emailid.requestFocus();
                }
                else if(pwd.isEmpty()){
                    password.setError("Please Enter your password");
                    password.requestFocus();

                }
                else if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(RegisterActivity.this,"Fields are Empty",Toast.LENGTH_SHORT);

                }
                else if(!(email.isEmpty() && pwd.isEmpty())){

                    mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(RegisterActivity.this,"SignUp unsuccessful, Please try again",Toast.LENGTH_SHORT);

                            }
                            else{

                             //   startActivity(new Intent(RegisterActivity.this,MainActivity.class));

                            }
                        }
                    });
                }
                else{

                    Toast.makeText(RegisterActivity.this,"Error Occurred",Toast.LENGTH_SHORT);
                }
                register.setName(name.getText().toString().trim());
                register.setUsername(uname.getText().toString().trim());
                register.setContact(contact.getText().toString().trim());

                register.setEmail(emailid.getText().toString().trim());
                register.setPassword(password.getText().toString().trim());

                reff.push() .setValue(register);
                startActivity(new Intent(RegisterActivity.this,MainActivity.class));
                Toast.makeText(RegisterActivity.this,"SignUp successful",Toast.LENGTH_SHORT);

            }


        });

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateOutUpRight).duration(1500).playOn(news);
                Intent i = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(i);
            }

        });



    }
}