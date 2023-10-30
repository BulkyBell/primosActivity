package com.example.primosactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val RESULTCODE: Int = 420

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var botonAbrir: Button = findViewById<Button>(R.id.abrirButton)

        botonAbrir.setOnClickListener{
            var intent = Intent(this, primosActivity::class.java)
            startActivityForResult(intent, 1)
        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var textResult: TextView = findViewById<TextView>(R.id.textResult)
        textResult.text= data?.getIntegerArrayListExtra("resultadoArray").toString()
    }
}