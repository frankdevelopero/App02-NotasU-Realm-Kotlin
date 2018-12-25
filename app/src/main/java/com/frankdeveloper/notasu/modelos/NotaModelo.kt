package com.frankdeveloper.notasu.modelos

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.*

@RealmClass
open class NotaModelo : RealmObject() {

    @PrimaryKey
    var id:Long = 0
    var nota: String ?= null
    var fecha: Date ?= null

}