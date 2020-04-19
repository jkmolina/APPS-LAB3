package com.example.apps_lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.apps_lab3.databinding.ActivitySymptomsBinding
import com.example.apps_lab3.databinding.ActivityVirusBinding
import kotlinx.android.synthetic.main.activity_virus.*


class Symptoms : AppCompatActivity() {

    private lateinit var binding: ActivitySymptomsBinding
    var title: String = "SINTOMAS"
    var subtitle: String = "Sintomas del Virus"
    var description: String =
        "\n Los síntomas de la enfermedad COVID-19 son inespecíficos y su presentación, según la OMS/WHO, puede incluso carecer de síntomas (asintomático). Hasta el 20 de febrero de 2020, en base a una muestra estadística de 55 924 casos confirmados por laboratorio. \n\nIncluye: \n\nTos seca, \n\nfiebre,\n\n dificultad para respirar, \n\ndolor de cabeza, \n\nescalofrios, \n\nnausea, \n\nvomitos, \n\ndiarrea, \n\ndolor de garganta \n\ny de cabeza. \n\n"
    //descripcion tomada de wikipedia
    private val User: User = User(title, subtitle, description)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_symptoms)
        //this.setContentView(R.layout.activity_virus)
        binding.user = User

        var homeButton: Button = findViewById(R.id.button_homeSymptoms);

        homeButton.setOnClickListener {
            goHome()
        }
    }

    fun goHome() {
        val home = Intent(this, MainActivity::class.java)
        val comment: String = fill_comment.text.toString()
        home.putExtra("comment", comment)
        startActivity(home)
    }
}