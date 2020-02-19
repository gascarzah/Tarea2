package com.gafahtec.tarea2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.gafahtec.tarea2.models.RestaurantEntity
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fonda_item.view.*

class RestaurantsAdapter (val restaurantes: ArrayList<RestaurantEntity>) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       val view = LayoutInflater.from(parent?.context).inflate(R.layout.fonda_item, parent,false)
        view.nombre_rest_textview.text = restaurantes[position].nombre
        view.direccion_textview.text = restaurantes[position].direccion
        view.calificacion_textview.text = restaurantes[position].calificacion
        view.descripcion_textview.text = restaurantes[position].descripcion
        return view
    }

    override fun getItem(position: Int): Any = restaurantes[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = restaurantes.size

}