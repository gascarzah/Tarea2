package com.gafahtec.tarea2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.gafahtec.tarea2.models.PlatoEntity
import com.gafahtec.tarea2.models.RestaurantEntity
import kotlinx.android.synthetic.main.activity_plato_detail.view.*
import kotlinx.android.synthetic.main.comida_item.view.*

class PlatoRecyclerViewAdapter(private val platos: ArrayList<PlatoEntity>) :
    RecyclerView.Adapter<PlatoRecyclerViewAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.comida_item,parent,false)
        )
    }

    override fun getItemCount(): Int = platos.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.setDataPlato(platos[position])
    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        val nombrePlato = itemView.nombre_plato_textview
        val precioPlato = itemView.precio_plato_textview
        val descripcionPlato = itemView.descripcion_plato_textview


        init {
            itemView.setOnClickListener(this)
        }

        fun setDataPlato(item: PlatoEntity) {
            nombrePlato.text = item.nombre
            precioPlato.text = item.precio
            descripcionPlato.text = item.descripcion

        }

        override fun onClick(v: View?) {
            Toast.makeText(
                v?.context,
                "Me has tocado ${nombrePlato.text}!!",
                Toast.LENGTH_LONG
            ).show()
        }


    }


}