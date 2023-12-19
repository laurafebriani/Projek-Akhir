package com.example.projekakhirlaura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class Llogin_actifity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llogin_actifity)

        val btnClick: Button = findViewById(R.id.btn_3)
        btnClick.setOnClickListener {
            val pindahIntent = Intent(this, dashbord_aktivity::class.java)
            startActivity(pindahIntent)
        }
    }

    // Fungsi untuk menangani klik pada tombol untuk redirect ke aktivitas login
    fun redirectToLogin(view: View) {
        val intent = Intent(this, login_actifity::class.java)
        startActivity(intent)
    }
}


