package com.example.a10118327_tugas1.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.a10118327_tugas1.MainActivity
import com.example.a10118327_tugas1.R
import com.example.a10118327_tugas1.ui.login.LoginActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: TextView
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        edtUsername = findViewById(R.id.username)
        edtPassword = findViewById(R.id.password)
        btnLogin = findViewById(R.id.login)
        btnRegister = findViewById(R.id.register)

        btnRegister.setOnClickListener {
            var username = edtUsername.text
            var password = edtPassword.text
            if (username.isEmpty()) {
                edtUsername.error = "ID TIDAK BOLEH KOSONG !"
            } else if (password.isEmpty()) {
                edtPassword.error = "PASSWORD TIDAK BOLEH KOSONG !"
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
        btnLogin.setOnClickListener {
            finish()
        }
    }
}