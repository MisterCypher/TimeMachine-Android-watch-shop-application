package com.example.timemachine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    EditText emailid, password;
    Button btnSignIn;
    TextView tvSignUp;
    FirebaseAuth mFirebaseAuth;
    ConstraintLayout loginn;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mFirebaseAuth= FirebaseAuth.getInstance();
        loginn=findViewById(R.id.loginn);
        YoYo.with(Techniques.RotateInUpLeft).duration(1500).playOn(loginn);
        emailid=findViewById(R.id.email);
        password=findViewById(R.id.password);
        btnSignIn=findViewById(R.id.register);
        tvSignUp=findViewById(R.id.signup);
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {


            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser=mFirebaseAuth.getCurrentUser();
                if(mFirebaseUser!=null){
                   /* Toast.makeText(LoginActivity.this,"Your are logged in",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);*/

                }
            /*    else {
                    Toast.makeText(LoginActivity.this,"Please Login",Toast.LENGTH_SHORT).show();

                }*/
            }
        };
        btnSignIn.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(LoginActivity.this,"Fields are Empty",Toast.LENGTH_SHORT);

                }
                else if(!(email.isEmpty() && pwd.isEmpty())){

                    mFirebaseAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(LoginActivity.this,"Login Error,Please Login Again",Toast.LENGTH_SHORT);

                            }
                            else{
                                YoYo.with(Techniques.RotateOutUpRight).duration(1500).playOn(loginn);
                                Intent intToHome=new Intent(LoginActivity.this, com.example.timemachine.MainActivity.class);
                                startActivity(intToHome);
                            }
                        }
                    });
                }
                else{

                    Toast.makeText(LoginActivity.this,"Error Occurred",Toast.LENGTH_SHORT);
                }
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intSignUp= new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intSignUp);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);

    }
}