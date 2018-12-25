package com.frankdeveloper.notasu

import android.app.Application
import com.frankdeveloper.notasu.modelos.MateriaModelo
import com.frankdeveloper.notasu.modelos.NotaModelo
import io.realm.Realm
import io.realm.RealmObject
import java.util.concurrent.atomic.AtomicInteger
import io.realm.RealmConfiguration

class MiAplicacion : Application() {

    var notaID: AtomicInteger = AtomicInteger()
    var materiaID: AtomicInteger = AtomicInteger()

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        configurarRealm()
        val realm = Realm.getDefaultInstance()
        notaID = obtenerPorTabla(realm, NotaModelo::class.java)
        materiaID = obtenerPorTabla(realm, MateriaModelo::class.java)
        realm.close()

    }

    private fun configurarRealm() {
        val config = RealmConfiguration.Builder()
            .name("DB_NotasU")
            .build()
        Realm.setDefaultConfiguration(config)
    }

    private fun <T : RealmObject> obtenerPorTabla(realm: Realm, anyClass: Class<T>): AtomicInteger {
        val results = realm.where(anyClass).findAll()
        return if (results.size > 0) AtomicInteger(results.max("id")!!.toInt()) else AtomicInteger()
    }
}