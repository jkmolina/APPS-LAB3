package com.example.apps_lab3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.apps_lab3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val user: User=User()
    val virusActivity = Intent(this, Virus::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val comment = intent.getStringExtra("comment");
        if (comment!=null && comment!="")
        {
            Toast.makeText(applicationContext, comment, Toast.LENGTH_SHORT).show()
        }

        //val Virus=Intent(this,Virus::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //binding.User=user

        binding.imageStar.setOnClickListener {

            clickStar(it)
        }
        binding.buttonVirus.setOnClickListener {
            startActivity(Intent(this, Virus::class.java))
        }
        binding.buttonIndications.setOnClickListener {
            startActivity(Intent(this, Indications::class.java))
        }
        binding.buttonSymptoms.setOnClickListener {
            startActivity(Intent(this, Symptoms::class.java))
        }
    }


    private fun clickStar(view: View)
    {
        binding.apply {
            val age: String = fill_age.text.toString()
            val name: String = fill_name.text.toString()

            val numericAge: Int=age.toInt()
            var mensaje: String;
            mensaje = if (numericAge.toInt() in 6..11) {
                "No salgas, eres muy joven y estas en alto riesgo."
            } else if (numericAge.toInt() in 11..39) {
                "Tienes poco riesgo de morir. Igual no salgas amigo, no te conviene.";
            }else if(numericAge.toInt() in 39..59){
                "Es altamente riesgoso si te contagiaras."
            }else if (numericAge.toInt() in 59..99) {
                "Ni se te ocurra salir a la calle."
            }
            else{
                "Por favor ingrese una edad realista."
            }
            text_description.text= "$name, $mensaje"
            if (text_description.visibility==View.GONE)
            {
                fillAge.visibility=View.GONE
                fillName.visibility=View.GONE
                text_description.visibility=View.VISIBLE
            }
            else
            {
                fillAge.visibility=View.VISIBLE
                fillName.visibility=View.VISIBLE
                text_description.visibility=View.GONE

            }

        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
