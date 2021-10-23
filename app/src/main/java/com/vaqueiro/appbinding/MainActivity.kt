package com.vaqueiro.appbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.vaqueiro.appbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /*FORMA TRADICIONAL
        setContentView(R.layout.activity_main)
        var boton = findViewById<Button>(R.id.btnCentro)
        boton.setOnClickListener{
            Toast.makeText(this,"EVENTO PUSH BOTON", Toast.LENGTH_LONG).show()
        }*/

        //IMPLEMENTACION DE VIEW_BINDING
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCentro.setOnClickListener{
            Toast.makeText(this,"EVENTO PUSH BOTON", Toast.LENGTH_LONG).show()
        }


    }
}