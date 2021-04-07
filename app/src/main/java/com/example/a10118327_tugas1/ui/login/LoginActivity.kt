package com.example.a10118327_tugas1.ui.login

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.example.a10118327_tugas1.MainActivity

import com.example.a10118327_tugas1.R
import com.example.a10118327_tugas1.ui.register.RegisterActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        edtUsername = findViewById(R.id.username)
        edtPassword = findViewById(R.id.password)
        btnLogin = findViewById(R.id.login)
        btnRegister = findViewById(R.id.register)

        btnLogin.setOnClickListener {
            var username = edtUsername.text
            var password = edtPassword.text
            if (username.isEmpty()) {
                edtUsername.error = "ID TIDAK BOLEH KOSONG !"
            } else if (password.isEmpty()) {
                edtPassword.error = "PASSWORD TIDAK BOLEH KOSONG !"
            } else {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}