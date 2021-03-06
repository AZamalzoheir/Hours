package com.example.amalzoheir.hours;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RegisterationActivity extends AppCompatActivity {
    Button loginButton;
    Button craeteAccountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        loginButton= (Button)findViewById(R.id.login_btn);
        craeteAccountButton=(Button)findViewById(R.id.create_account_btn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterationActivity.this, LoginActivity.class));
            }
        });
        craeteAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterationActivity.this, RegisterNewUserActivity.class));
            }
        });
    }
}
