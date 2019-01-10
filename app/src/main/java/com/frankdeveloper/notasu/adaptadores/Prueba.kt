package com.frankdeveloper.notasu.adaptadores

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.frankdeveloper.notasu.R
import com.frankdeveloper.notasu.modelos.MateriaModelo

import java.util.ArrayList

class Prueba(internal var lista: ArrayList<MateriaModelo>) : RecyclerView.Adapter<Prueba.PruebaViewHolde>(),
    View.OnClickListener {

    internal var listener: View.OnClickListener? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): PruebaViewHolde {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.materia_list, viewGroup, false)
        view.setOnClickListener(this)
        return PruebaViewHolde(view)
    }

    override fun onBindViewHolder(pruebaViewHolde: PruebaViewHolde, i: Int) {
        pruebaViewHolde.textView.text = lista[i].sigla
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    fun setOnClickListener(listener: View.OnClickListener) {
        var listener = listener
    }

    override fun onClick(v: View) {
        if (listener != null)
            listener!!.onClick(v)
    }

    inner class PruebaViewHolde(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var textView: TextView = itemView.findViewById(R.id.tvSigla)

    }
}
