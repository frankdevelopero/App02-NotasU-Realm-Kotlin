package com.frankdeveloper.notasu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.frankdeveloper.notasu.modelos.MateriaModelo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab_nueva_materia.setOnClickListener {
            Toast.makeText(this, "Agregar nueva materia", Toast.LENGTH_SHORT).show()
        }

    }
}
