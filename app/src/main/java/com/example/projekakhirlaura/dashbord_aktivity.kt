package com.example.projekakhirlaura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projekakhirlaura.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class dashbord_aktivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashbord_aktivity)
        val detailpantai = findViewById<RecyclerView>(R.id.rvbiru)
        ApiConfig.getService().getDetail1().enqueue(object : Callback<ResponsePantai> {
            override fun onResponse(
                call: Call<ResponsePantai>, response: Response<ResponsePantai>
            ) {
                if (response.isSuccessful) {
                    val responsePantai = response.body()
                    val datapantai = responsePantai?.data
                    val pantaiAdapter = PantaiAdapter(datapantai)
                    detailpantai.apply {
                        layoutManager = LinearLayoutManager(this@dashbord_aktivity)
                        setHasFixedSize(true)
                        pantaiAdapter.notifyDataSetChanged()
                        adapter = pantaiAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponsePantai>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
    })
    }
}
