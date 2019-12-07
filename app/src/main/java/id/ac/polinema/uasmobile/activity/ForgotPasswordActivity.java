package id.ac.polinema.uasmobile.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.uasmobile.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    EditText edt_reset_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        edt_reset_code = (EditText) findViewById(R.id.edt_reset_code);
    }

    public void postSentRequest(View view) {
        if (edt_reset_code.getText().toString().length()==0) {
            Toast.makeText(view.getContext(), "Email tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }else if (!isValidEmail(edt_reset_code.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email tidak sesuai format!", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(view.getContext(), "Please check your email!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }

    private boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
