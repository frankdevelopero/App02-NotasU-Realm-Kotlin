package com.frankdeveloper.notasu.adaptadores

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.frankdeveloper.notasu.modelos.MateriaModelo

class MateriaAdaptador : RecyclerView.Adapter<MateriaAdaptador.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var listaMateria: ArrayList<MateriaModelo> ?= null


    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


}