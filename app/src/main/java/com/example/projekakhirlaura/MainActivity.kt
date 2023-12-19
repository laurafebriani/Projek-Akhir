package com.example.projekakhirlaura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.btn_1)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        if (v !=null){
            when(v.id){
                R.id.btn_1 -> {
                    val pindahIntent = Intent(this, Llogin_actifity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}