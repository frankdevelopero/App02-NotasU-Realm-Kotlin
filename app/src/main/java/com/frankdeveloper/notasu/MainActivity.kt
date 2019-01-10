package com.frankdeveloper.notasu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  var realm: Realm ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        realm = Realm.getDefaultInstance()

        fab_nueva_materia.setOnClickListener {
            guardarMateria()
        }

    }

    private fun guardarMateria(){
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Nueva materia")
        val view = layoutInflater.inflate(R.layout.nueva_materia_dialog, null)

        val edtNombre = view.findViewById<EditText>(R.id.edtNombreMateria)
        val edtSigla = view.findViewById<EditText>(R.id.edtSiglaMateria)
        val btnGuardar = view.findViewById<Button>(R.id.btnGuardarMateria)

        dialog.setView(view)
        dialog.setCancelable(true)

        val dialogShow = dialog.create()
        dialogShow.show()

        btnGuardar.setOnClickListener {

        }


    }

}
