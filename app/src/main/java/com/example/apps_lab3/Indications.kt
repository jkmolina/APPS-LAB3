package com.example.apps_lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.apps_lab3.databinding.ActivityIndicationsBinding
import com.example.apps_lab3.databinding.ActivitySymptomsBinding
import com.example.apps_lab3.databinding.ActivityVirusBinding
import kotlinx.android.synthetic.main.activity_virus.*


class Indications : AppCompatActivity() {

    private lateinit var binding: ActivityIndicationsBinding
    var title: String="INDICACIONES"
    var subtitle:String="Indicaciones del Virus"
    var description: String="\nLa crisis mundial más grande de la historia desde la Gran Depresión (1929), ahora llamado El Gran Confinamiento, ha provocado un impacto socioeconómico global, provocado por el efecto sanitario de la propia enfermedad de la COVID-19 y por los esfuerzos por controlar su expansión pandémica de 2019-2020.430\u200B\n" +
            "\n" +
            "La pandemia se convirtió en el «cisne negro»431\u200B de 2020 y produjo el colapso del mercado de valores de 2020, una de las caídas más rápidas de la historia, durante los meses de febrero y marzo.\n" +
            "\n" +
            "Durante los primeros meses, cuando la epidemia se limitaba casi exclusivamente a China, hubo informes generalizados de escasez de suministro de productos farmacéuticos,432\u200B electrónicos 433\u200By otros productos manufacturados debido a la paralización de numerosas fábricas en China.434\u200B435\u200B En ciertas localidades (en particular en Italia y Hong Kong)436\u200B437\u200B se observaron compras de pánico y la consiguiente escasez de comida y otros artículos esenciales de abastecimiento.438\u200B\n" +
            "\n" +
            "Los mercados bursátiles mundiales empezaron a caer fuertemente el 24 de febrero de 2020 debido al aumento significativo en el número de casos de COVID-19 fuera de China continental.439\u200B440\u200B Para el 28 de febrero de 2020, los mercados bursátiles de todo el mundo acumulaban los mayores descensos de una semana desde la crisis financiera de 2008.441\u200B442\u200B443\u200B Las fuertes caídas prosiguieron las semanas siguientes, con fuertes bajadas el 9 de marzo y el 12 de marzo. A medida que se propagaba la pandemia, se cancelaban o posponían las conferencias y eventos mundiales en tecnología, moda, deportes, entre otros.444\u200B\n" +
            "\n" +
            "La caída de la demanda de materias primas por el parón de actividad en China ha llevado a fuertes caídas de precios, en particular del petróleo, lo cual perjudica a los países y empresas productores y beneficia a los consumidores. El miedo de los inversores les ha llevado a refugiar su dinero en valores considerados seguros, en particular la deuda pública de los países percibidos como más solventes, lo cual ha provocado una bajada de los tipos de interés que reduce el déficit público de dichos países.\n" +
            "A mitad de marzo la gravedad de la crisis obligó a intervenir a los gobiernos y a los Bancos Centrales a través de la política monetaria y la fiscal para evitar el colapso definitivo de la economía\n"
    //descripcion tomada de wikipedia
    private val User: User= User(title,subtitle,description)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_indications)
        //this.setContentView(R.layout.activity_virus)
        binding.user=User

        var homeButton: Button = findViewById(R.id.button_homeIndications);

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