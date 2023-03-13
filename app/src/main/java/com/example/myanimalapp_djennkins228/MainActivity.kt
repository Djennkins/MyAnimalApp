package com.example.myanimalapp_djennkins228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var animals = ArrayList<Animal>()

    lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rV)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        var cat = Animal("Boss", "Cat", "Little Cat\n4 small paws", R.drawable.cat, R.drawable.cat_photo)
        var dog = Animal("Barboss", "Dog", "Breed: dachshund,\n Long Dog,\nWeight: 22kg,\n Height: 35cm\nAmount of paws: 4", R.drawable.dog, R.drawable.dog_photo)
        var parrot = Animal ("Kefir", "Parrot", "Kind of parrot: Ara,\nColors: Red, yellow, blue, \nSmart And Talking Parrot", R.drawable.parrot,R.drawable.parrot_photo)

        animals.add(cat)
        animals.add(dog)
        animals.add(parrot)

        adapter = AnimalAdapter(animals, this@MainActivity)

        recyclerView.adapter = adapter

    }
}