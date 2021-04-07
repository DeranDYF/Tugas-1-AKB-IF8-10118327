package com.example.a10118327_tugas1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.a10118327_tugas1.ui.login.LoginActivity

//06-04-2021
//10118327
//Deran Deriyana F
//IF8
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_splash_screen)
        //menghilangkan ActionBar
        supportActionBar?.hide()
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 2000L)
    }
}