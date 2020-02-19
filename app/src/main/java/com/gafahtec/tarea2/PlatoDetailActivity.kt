package com.gafahtec.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gafahtec.tarea2.models.PlatoEntity
import com.gafahtec.tarea2.models.RestaurantEntity
import kotlinx.android.synthetic.main.activity_plato_detail.*

class PlatoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plato_detail)

        val platos = ArrayList<PlatoEntity>()
        platos.add(PlatoEntity("Arroz con pollo","13", "Pollo con arroz verde y salsa a la huancaina"))
        platos.add(PlatoEntity("Ceviche","12", "Pollo con arroz verde y salsa a la huancaina"))
        platos.add(PlatoEntity("Seco de cabrito","16", "Carne, frejoles y arroza blanco"))
        platos.add(PlatoEntity("Causa Rellena","11", "Causa rellena de atun y ensalada"))
        platos.add(PlatoEntity("Choritos a la chalaca","30", "Choros frescos con salsa de ostion"))
        platos.add(PlatoEntity("Lomo Saltado","13", "Carne, papas fritas, arroz blanco"))

        val adapter = PlatoRecyclerViewAdapter(platos)
        plato_detail_recyclerview.layoutManager = LinearLayoutManager(this)
        plato_detail_recyclerview.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        val extra = intent.extras


        extra?.containsKey("name").let {
            val restaurant =  extra?.getSerializable("restaurant") as RestaurantEntity

            nombre_restaurant_titulo_textview.text = restaurant.nombre
            descripcion_restaurant_titulo_textview.text = restaurant.descripcion
            calificacion_restaurant_titulo_textview.text = restaurant.calificacion
            direccion_restaurant_titulo_textview.text = restaurant.direccion



        }
    }
}
