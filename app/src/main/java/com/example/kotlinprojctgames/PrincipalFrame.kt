package com.example.kotlinprojctgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PrincipalFrame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_frame)
        supportActionBar?.hide()
    }
}