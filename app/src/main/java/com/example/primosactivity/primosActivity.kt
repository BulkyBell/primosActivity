package com.example.primosactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class primosActivity : AppCompatActivity() {

    private var elementos=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primos)

        findViewById<Button>(R.id.cerrarButton).setOnClickListener{
            finish()
        }

        findViewById<Button>(R.id.calcularButton).setOnClickListener{
            var numero: Int = Integer.parseInt(findViewById<TextView>(R.id.editTextNumber).text.toString())
            calcularPrimos(numero);
            println(elementos.toString())
        }
    }

    private fun calcularPrimos(n:Int):ArrayList<Int>{
        for (i in 2 .. n){
            if (calcularPrimos(i, i-1))
                elementos.add(i)
        }
        return elementos
    }

    private fun calcularPrimos(num:Int, divisor: Int):Boolean{
        if (divisor==1){
            return true
        }
        else if (num%divisor==0){
            return false
        }
        else{
            return calcularPrimos(num, divisor-1)
        }
    }

}