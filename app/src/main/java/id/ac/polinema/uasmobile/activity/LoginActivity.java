package id.ac.polinema.uasmobile.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.uasmobile.R;

public class LoginActivity extends AppCompatActivity {
    EditText edt_reset_code, edt_new_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_reset_code = (EditText) findViewById(R.id.edt_reset_code);
        edt_new_password = (EditText) findViewById(R.id.edt_new_password);
    }

    public void clickForgot(View view) {
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }

    public void postLogin(View view) {
        if (edt_reset_code.getText().toString().length()!=0 && edt_new_password.getText().toString().length()!=0){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else Toast.makeText(LoginActivity.this,"Kolom harus terisi semua!", Toast.LENGTH_SHORT).show();
    }
}
