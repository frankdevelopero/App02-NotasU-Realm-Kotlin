package com.frankdeveloper.notasu.modelos

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class MateriaModelo : RealmObject(){

    @PrimaryKey
    var id: Long = 0
    private var nombre: String ?= null
    var imagen: String ?= null



}