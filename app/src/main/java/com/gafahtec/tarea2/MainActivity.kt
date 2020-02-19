package com.gafahtec.tarea2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_in_button.setOnClickListener {
            val username = username_edittext.text
            val password = password_edittext.text

            if (!username.isNullOrEmpty() && !password.isNullOrEmpty()){
                //Toast.makeText(this, "Entrando a login", Toast.LENGTH_SHORT)
                val bundle = Bundle()
                bundle.putString("username","Giovanni")
                bundle.putString("lastname","Ascarza")
                val intent = Intent(this,DrawerActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            } }
    }
}
