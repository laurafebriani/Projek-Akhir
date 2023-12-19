package com.example.projekakhirlaura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class login_actifity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnClick: Button = findViewById(R.id.btn_2)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_2 -> {
                val pindahIntent = Intent(this, Llogin_actifity::class.java)
                startActivity(pindahIntent)
            }
        }
    }
}

