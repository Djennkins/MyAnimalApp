package com.example.myanimalapp_djennkins228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var fullDescription: TextView
    lateinit var nameOfAnimal: TextView
    lateinit var photo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nameOfAnimal = findViewById(R.id.tv_name)
        photo = findViewById(R.id.tv_photo)
        fullDescription = findViewById(R.id.tv_description)

        var passingName = intent.getStringExtra("passingName")
        var passingDescription = intent.getStringExtra("passingDescription")

        when(passingName){
            "Boss" -> photo.setImageResource(R.drawable.cat_photo)
            "Barboss" -> photo.setImageResource(R.drawable.dog_photo)
            "Kefir" -> photo.setImageResource(R.drawable.parrot_photo)
        }


        nameOfAnimal.text = passingName

        fullDescription.text = passingDescription

    }
}