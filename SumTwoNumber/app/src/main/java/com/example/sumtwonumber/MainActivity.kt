package com.example.sumtwonumber

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        code
        val sum = findViewById<Button>(R.id.btnSum)
        val minus = findViewById<Button>(R.id.btnMinus)
        val multiplication = findViewById<Button>(R.id.btnMultiplication)
        val division = findViewById<Button>(R.id.btnDivision)
        val reset = findViewById<Button>(R.id.btnReset)
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val result = findViewById<TextView>(R.id.result)

        // action


        // sum
        sum.setOnClickListener {
            var num1: String? = number1.text.toString()
            var num2: String? = number2.text.toString()
            if ((num1 == "") || (num2 == "")) {
                result.text = "Vui lòng nhập giá trị!"
            } else {
                var a: Double = number1.text.toString().toDouble()
                var b: Double = number2.text.toString().toDouble()
                var kq: Double = a + b
                result.text = "Kết quả: " + kq.toString()
            }


        }
        // minus
        minus.setOnClickListener {
            var num1: String? = number1.text.toString()
            var num2: String? = number2.text.toString()
            if ((num1 == "") || (num2 == "")) {
                result.text = "Vui lòng nhập giá trị!"
            } else {
                var a: Double = number1.text.toString().toDouble()
                var b: Double = number2.text.toString().toDouble()
                var kq: Double = a - b
                result.text = "Kết quả: " + kq.toString()

            }
        }
        // multiplication
        multiplication.setOnClickListener {
            var num1: String? = number1.text.toString()
            var num2: String? = number2.text.toString()
            if ((num1 == "") || (num2 == "")) {
                result.text = "Vui lòng nhập 2 số!"
            } else {
                var a: Double = number1.text.toString().toDouble()
                var b: Double = number2.text.toString().toDouble()
                var kq: Double = a * b
                result.text = "Kết quả: " + kq.toString()
            }
        }
        // divisiton
        division.setOnClickListener {
            var num1: String? = number1.text.toString()
            var num2: String? = number2.text.toString()
            if ((num1 == "") || (num2 == "")) {
                result.text = "Vui lòng nhập giá trị!"
            } else {
                var a: Double = number1.text.toString().toDouble()
                var b: Double = number2.text.toString().toDouble()
                if (b == 0.0) {
                    result.text = "Error!"
                } else {
                    var kq: Double = a / b
                    result.text = "Kết quả: " + kq.toString()
                }
            }
        }
        reset.setOnClickListener {
            result.text = "Kết quả: 0"
            number1.text = null
            number2.text = null
        }


    }
}