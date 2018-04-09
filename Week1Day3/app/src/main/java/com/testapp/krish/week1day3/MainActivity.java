package com.testapp.krish.week1day3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<User> person;
    TextInputEditText et1;
    TextInputEditText et2;
    String email,password;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

            person = new ArrayList<User>(Arrays.asList(
                    new User("k","k","k","k"),
                    new User("Krishna","KC","kkc@mum.edu","kkc")
            ));

            et1 = (TextInputEditText) findViewById(R.id.email_field);
            et2 = (TextInputEditText) findViewById(R.id.password_field);
        }

        public void onCreateAccount(View view){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }

        public void onLogin(View view){
            email = et1.getText().toString();
            password = et2.getText().toString();

            for (User u : person){
                if(u.getEmail().equals(email)&&u.getPassword().equals(password)){
                    flag = 1;
                    Intent intent = new Intent(this, MenuActivity.class);
                    intent.putExtra("first",u.getFirstName());
                    intent.putExtra("last",u.getLastName());
                    startActivity(intent);
                }
            }
            if(flag==1){
                Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_LONG).show();
            }
        }

        public void onForgotPassword(View view){
//        Intent intent = new Intent(MainActivity.this,MenuActivity.class);
//        startActivity(intent);
            Toast.makeText(this, "Please Try to Remember Your Password!!!", Toast.LENGTH_SHORT).show();
        }

}
