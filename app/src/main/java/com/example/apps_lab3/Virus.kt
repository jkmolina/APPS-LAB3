package com.example.apps_lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.apps_lab3.databinding.ActivityVirusBinding
import kotlinx.android.synthetic.main.activity_virus.*


class Virus : AppCompatActivity() {
    private lateinit var binding: ActivityVirusBinding
    var title: String="CORONAVIRUS"
    var subtitle:String="Datos del Virus"
    var description: String="\n La pandemia de enfermedad por coronavirus de 2019-2020 es una pandemia derivada de la enfermedad por coronavirus iniciada en 2019 (COVID-19), ocasionada por el virus coronavirus 2 del síndrome respiratorio agudo grave (SARS-CoV-2).4\u200B5\u200B Se identificó por primera vez en el mes de Diciembre del año 2019 en la ciudad de Wuhan,6\u200B capital de la provincia de Hubei, en China central, al reportarse casos de un grupo de personas enfermas con una tipo de neumonía desconocida. Los individuos afectados con el mal, tenían vinculación con trabajadores del mercado mayorista de mariscos del sur de China. 7\u200B8\u200B La OMS la reconoció como una pandemia global el 11 de marzo de 2020.9\u200B A la fecha de 18 de abril de 2020, se han informado de más de 2,3 millones de casos de la enfermedad en más de 210 países y territorios en el mundo. Las estadísticas publicadas a diario por fuentes varias, arrojan resultados de más de 159 mil muertes y 594 mil casos de personas que estan en proceso de recuperación.10\u200B11\u200B La lista de siete países con mayor número de infectados son Estados Unidos, España, Italia, Alemania, Francia, Reino Unido y China. \n"
    //descripcion tomada de wikipedia
    private val User: User= User(title,subtitle,description)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_virus)
        //this.setContentView(R.layout.activity_virus)
        binding.user=User

        var homeButton: Button = findViewById(R.id.button_homeVirus);

        homeButton.setOnClickListener {
            goHome()
        }
    }
    fun goHome()
    {
        val home = Intent(this, MainActivity::class.java)
        val comment: String=fill_comment.text.toString()
        home.putExtra("comment",comment)
        startActivity(home)
    }
}