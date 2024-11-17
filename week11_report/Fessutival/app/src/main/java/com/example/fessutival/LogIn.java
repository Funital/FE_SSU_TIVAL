package com.example.fessutival;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fessutival.schedule.Calendar;

public class LogIn extends AppCompatActivity {
    private EditText et_login;
    private EditText et_pw;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // EditText 및 Button 가져오기
        et_login = findViewById(R.id.et_login);
        et_pw = findViewById(R.id.et_pw);
        bt_login = findViewById(R.id.bt_login);

        // 초기 상태: 버튼 비활성화
        bt_login.setEnabled(false);

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
                String username = et_login.getText().toString().trim();
                String password = et_pw.getText().toString().trim();

                // 둘 다 비어있지 않으면 버튼 활성화
                bt_login.setEnabled(!username.isEmpty() && !password.isEmpty());
            }
        };

        // EditText에 TextWatcher 추가
        et_login.addTextChangedListener(textWatcher);
        et_pw.addTextChangedListener(textWatcher);
    }

    public void bt_login_onClick(View v){
        Button bt_login = findViewById(R.id.bt_login);

        // LogIn 액티비티로 이동
        Intent intent = new Intent(LogIn.this, Calendar.class);
        startActivity(intent);
    }

    public void bt_account_onClick(View v){
        Button bt_account = findViewById(R.id.bt_account);

        // Account 액티비티로 이동
        Intent intent = new Intent(LogIn.this, Account.class);
        startActivity(intent);
    }
}