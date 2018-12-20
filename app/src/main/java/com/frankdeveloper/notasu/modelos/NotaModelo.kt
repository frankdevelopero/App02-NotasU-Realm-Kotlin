package com.frankdeveloper.notasu.modelos

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

class NotaModelo : RealmObject {

    @PrimaryKey
    var id:Int ?= 0
    var nota: String ?= null
    var fecha: Date ?= null

    constructor()

    constructor(nota: String?) : super() {
        this.id = 0
        this.nota = nota
        this.fecha = Date()
    }
}