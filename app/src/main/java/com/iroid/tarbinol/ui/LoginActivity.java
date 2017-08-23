package com.iroid.tarbinol.ui;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.iroid.tarbinol.R;

import static android.Manifest.permission.READ_CONTACTS;
import static android.graphics.Color.YELLOW;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText metUserId;
    private EditText metPassword;
    private Button mloginButton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        metUserId = (EditText) findViewById(R.id.etUserId);
        metPassword = (EditText) findViewById(R.id.etPassword);
        mloginButton = (Button) findViewById(R.id.login_button);

//        metUserId.setBackgroundColor(Color.TRANSPARENT);
//        metPassword.setBackgroundColor(Color.TRANSPARENT);
        //mloginButton.setBackgroundColor(YELLOW);
        //No need of above

        mloginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ExecutiveNameActivity.class);
        startActivity(intent);
    }
}

