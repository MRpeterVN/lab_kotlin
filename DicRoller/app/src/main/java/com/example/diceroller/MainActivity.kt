package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll = findViewById<Button>(R.id.btnRoll)

        btnRoll.setOnClickListener {
            roll()
        }


    }

    private  fun  roll(){
        val result = findViewById<ImageView>(R.id.imageView)
        var kq = (1..6).random()
        if (kq==1) result.setImageResource(R.drawable.dice_1)
        else if (kq==2) result.setImageResource(R.drawable.dice_2)
        else if (kq==3) result.setImageResource(R.drawable.dice_3)
        else if (kq==4) result.setImageResource(R.drawable.dice_4)
        else if (kq==5) result.setImageResource(R.drawable.dice_5)
        else result.setImageResource(R.drawable.dice_6)
    }

}