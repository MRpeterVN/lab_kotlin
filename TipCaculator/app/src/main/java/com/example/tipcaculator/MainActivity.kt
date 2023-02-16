package com.example.tipcaculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipcaculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCaculate.setOnClickListener { caculate() }



    }
    private fun caculate(){
       val levelTip = when (binding.tip.checkedRadioButtonId){
              R.id.option10 -> 0.1
              R.id.option15 -> 0.15
              else -> 0.20
       }
        val enterMoney = binding.edtMoney.text.toString()
        val edtMoney = enterMoney.toDoubleOrNull()
        if (edtMoney == null){
            binding.txtResult.setText("Please! Enter money...")
        }
        else {
            val money = binding.edtMoney.text.toString().toDouble()
            val result = money * levelTip
            binding.txtResult.setText(result.toString())
            if (binding.roundUp.isChecked){
                binding.txtResult.setText(kotlin.math.ceil(result).toString())
            }







    }

}