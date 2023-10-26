package com.example.primosactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var botonAbrir: Button = findViewById<Button>(R.id.abrirButton)

        botonAbrir.setOnClickListener{
            var intent = Intent(this, primosActivity::class.java)
            startActivity(intent)
        }

    }


    fun pulsarBoton(){

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //var datos = data?.getIntArrayExtra("primos")
        //Log.d("Primos", datos.toString())
    }
}