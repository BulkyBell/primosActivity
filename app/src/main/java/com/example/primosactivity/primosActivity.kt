package com.example.primosactivity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class primosActivity : AppCompatActivity(){
    
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.primos_activity)
        findViewById<Button>(R.id.botonCalcular).setOnClickListener(){
            //var numeros = findViewById<editText>(R.id.editTextNumber)
            var number = 15
            var elementos = calcularPrimos(number)
            println(elementos)

        }

        /*findViewById<Button>(R.id.cerrarButton).setOnClickListener{
            turnBack()
        }*/

    }

    private fun calcularPrimos(n:Int):ArrayList<Int>{
        var elementos=ArrayList<Int>()

        for (i in 1 .. n){
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
            return calcularPrimos(num, num-1)
        }
    }

    private fun turnBack(){
        findViewById<Button>(R.id.cerrarButton).setOnClickListener{
            finish()
        }
    }
}