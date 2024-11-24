package com.example.fessutival_re.Login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.fessutival_re.R;

import androidx.appcompat.app.AppCompatActivity;

public class Account extends AppCompatActivity {
    private EditText et_create_name;
    private EditText et_create_id;
    private EditText et_create_pw;
    private Button bt_create_account;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        // EditText 및 Button 가져오기
        et_create_name = findViewById(R.id.et_create_name);
        et_create_id = findViewById(R.id.et_create_id);
        et_create_pw = findViewById(R.id.et_create_pw);
        bt_create_account = findViewById(R.id.bt_create_account);

        bt_create_account.setEnabled(false);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // 모든 EditText가 비어있지 않은지 확인
                String username = et_create_name.getText().toString().trim();
                String userid = et_create_id.getText().toString().trim();
                String password = et_create_pw.getText().toString().trim();

                // 둘 다 비어있지 않으면 버튼 활성화
                bt_create_account.setEnabled(!username.isEmpty() && !password.isEmpty());
            }
        };

        // EditText에 TextWatcher 추가
        et_create_name.addTextChangedListener(textWatcher);
        et_create_id.addTextChangedListener(textWatcher);
        et_create_pw.addTextChangedListener(textWatcher);

    }

    public void bt_create_account_onClick(View v){
        Button bt_create_account = findViewById(R.id.bt_create_account);

        // LogIn 액티비티로 이동
        Intent intent = new Intent(Account.this, Login.class);
        startActivity(intent);

        Toast.makeText(Account.this, "회원가입에 성공하셨습니다!", Toast.LENGTH_SHORT).show();
    }
}
