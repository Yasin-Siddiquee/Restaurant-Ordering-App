package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnOrder
import kotlinx.android.synthetic.main.activity_main.eT1
import kotlinx.android.synthetic.main.activity_main.eT2
import kotlinx.android.synthetic.main.activity_main.eT3
import kotlinx.android.synthetic.main.activity_main.eT4

class MainActivity : AppCompatActivity() {

    //Key
    companion object{
        const val KEY = "com.example.multiscreenApp.MainActivity.Key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val ordersPlaced = eT1.text.toString() + "\n " + eT2.text.toString() + "\n " +
                    eT3.text.toString() + "\n " + eT4.text.toString()

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, ordersPlaced )
            startActivity(intent)
        }
    }
}