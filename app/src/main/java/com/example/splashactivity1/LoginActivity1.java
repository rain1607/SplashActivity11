package com.example.splashactivity1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.splashactivity1.model.Auth;

public class LoginActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email_edit_text); ///**
                EditText passwordEditText = findViewById(R.id.password_edit_text); //**
                CheckBox rememberPasswordCheckbox=findViewById(R.id.remember_password_checkbox);

                rememberPasswordCheckbox.isChecked();

                String inputEmail = emailEditText.getText().toString(); //**
                int value ;
                try {
                    value= Integer.parseInt(inputEmail);
                }catch (Exception e){
                    value=-1;
                } //ใส่เพื่อให้แอปไม่เด้งออก

                String inputpassword = passwordEditText.getText().toString();//วิธีเก็บข้อมูลอีเมลกับพาสเวิร์ดลงในช่อง**

                Auth auth = new Auth(inputEmail, inputpassword); // มาจากคลาสAuth ในmodel
               /*auth.setEmail(inputEmail);
                auth.setPassword(iputpassword);*/

                boolean result = auth.check();
                if (result) {
                    //login สำเร็จ
                    // Toast.makeText(LoginActivity1.this, R.string.login_success, Toast.LENGTH_SHORT).show();
                    if(rememberPasswordCheckbox.isChecked()){
                        Toast.makeText(LoginActivity1.this, "คุณเลือกจำรหัสผ่าน", Toast.LENGTH_SHORT).show();
                    } //โค้ดตรงใส่ช่องจำรหัสผ่าน ในช่องif else
                    else{
                        Toast.makeText(LoginActivity1.this, "คุณเไม่จำรหัสผ่าน", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    //login ไม่สำเร็จ
                    // Toast.makeText(LoginActivity1.this,R.string.login_failed,Toast.LENGTH_SHORT).show();
                    new AlertDialog.Builder(LoginActivity1.this)
                            .setTitle("Error")
                            .setMessage(R.string.login_failed)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //โค้ดที่ให้ทำงานเมื่อUser กดปุ่ม Cancel
                                }
                            })
                            .setNeutralButton("Ignore", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                    .show();
                }
            }
        });
    }
}
