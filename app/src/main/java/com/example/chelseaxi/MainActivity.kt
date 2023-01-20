package com.example.chelseaxi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var data: ArrayList<playersdata>
    private lateinit var imageid:Array<Int>
    private lateinit var heading:Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 imageid= arrayOf(
 R.drawable.alonso,
     R.drawable.bale,
     R.drawable.giroud,
     R.drawable.hazard,
     R.drawable.oscar,
     R.drawable.ozil,
     R.drawable.musiala
 )
        heading = arrayOf(
            "upcoming stars of our generations",
            "upcoming stars of our generations",
            "upcoming stars of our generations",
            "upcoming stars of our generations",
            "upcoming stars of our generations",
            "upcoming stars of our generations",
            "upcoming stars of our generations"
        )
        recyclerView =findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        data = arrayListOf<playersdata>()
        getuserdata()
    }

    private fun getuserdata() {
        for(i in imageid.indices){
        val d=playersdata(imageid[i],heading[i])
            data.add(d)
        }
recyclerView.adapter =adapter(data)
    }
}