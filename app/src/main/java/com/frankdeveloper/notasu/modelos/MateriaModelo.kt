package com.frankdeveloper.notasu.modelos

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

class MateriaModelo : RealmObject{

    @PrimaryKey
    var id: Int ?= null
    private var nombre: String ?= null
    var imagen: String ?= null

    constructor()

    constructor(nombre: String?, imagen: String?) : super() {
        this.nombre = nombre
        this.imagen = imagen
        this.id = 0
    }
}