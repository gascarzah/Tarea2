package com.gafahtec.tarea2.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.gafahtec.tarea2.PlatoDetailActivity
import com.gafahtec.tarea2.R
import com.gafahtec.tarea2.RestaurantsAdapter
import com.gafahtec.tarea2.models.RestaurantEntity
import kotlinx.android.synthetic.main.fragment_mas_cercano.*

/**
 * A simple [Fragment] subclass.
 */
class MasCercanoFragment : Fragment() {

    private lateinit var listView: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_mas_cercano, container, false)

        listView = rootView.findViewById(R.id.restaurant_listview)

        val restaurantes = ArrayList<RestaurantEntity>()
        restaurantes.add(RestaurantEntity("la Fonda de Doña Florinda",
                                         "Av. Javier Prado 999",
                                        "10",
                                        "Local ubicado en el corazon de San borja"))
        restaurantes.add(RestaurantEntity("Polleria el Panzon",
            "Av. Larco 999",
            "10",
            "Local ubicado en el corazon de miraflores"))

        restaurantes.add(RestaurantEntity("Pollos cua cua",
            "Av. La colmena 999",
            "10",
            "Local ubicado en el el naranjal"))

        restaurantes.add(RestaurantEntity("Anticuchos De la abuela ",
            "Av. Pardo 999",
            "10",
            "Local ubicado en el corazon de miraflores"))

        restaurantes.add(RestaurantEntity("Chicharrones del Gordo",
            "Av. Larco 999",
            "10",
            "Local ubicado en el corazon de miraflores"))


        val adapter = RestaurantsAdapter(restaurantes)
        listView.adapter = adapter
        adapter.notifyDataSetChanged()


        listView.setOnItemClickListener { parent, view, position, id ->
            val extra = Bundle()
            extra.putSerializable("restaurant", restaurantes[position])

            val intent =  Intent(this.activity?.baseContext,PlatoDetailActivity::class.java)
            intent.putExtras(extra)
            this.startActivity(intent)
        }


        return rootView
        //inflater.inflate(R.layout.fragment_mas_cercano, container, false)
    }


}
