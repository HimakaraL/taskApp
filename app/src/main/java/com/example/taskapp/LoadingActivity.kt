package com.example.taskapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@LoadingActivity, MainActivity::class.java))
            finish()
        }, 2000) // 2 seconds delay
    }
}
