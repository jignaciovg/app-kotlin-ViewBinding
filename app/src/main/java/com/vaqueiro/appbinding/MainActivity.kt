package com.vaqueiro.appbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //FORMA TRADICIONAL
        var boton = findViewById<Button>(R.id.btnCentro)
        boton.setOnClickListener{
            Toast.makeText(this,"EVENTO PUSH BOTON", Toast.LENGTH_LONG).show()
        }



    }
}