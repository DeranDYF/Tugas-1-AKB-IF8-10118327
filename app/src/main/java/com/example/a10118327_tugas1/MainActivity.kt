package com.example.a10118327_tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.identity.AccessControlProfile
import android.widget.Button
import com.example.a10118327_tugas1.ui.login.LoginActivity
import com.example.a10118327_tugas1.ui.profile.ProfileActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnProfile: Button
    private lateinit var btnLogout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnProfile=findViewById(R.id.profile)
        btnLogout=findViewById(R.id.logout)
        btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        btnLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
//06-04-2021
//10118327
//Deran Deriyana F
//IF8