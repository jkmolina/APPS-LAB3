package com.example.apps_lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_virus.*


class Indications : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virus)

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