package com.example.projecto_1p_77904.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projecto_1p_77904.MainActivity
import com.example.projecto_1p_77904.R
import com.example.projecto_1p_77904.adapters.CategoryAdapter
import com.example.projecto_1p_77904.models.Heroes

class Marvel : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logout : ImageView
    lateinit var categoriesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_marvel)
        val sharedPreferences = getSharedPreferences("mypref", Context.MODE_PRIVATE)
        username = findViewById(R.id.userTV)
        logout = findViewById(R.id.logoutBtn)
        categoriesRecyclerView = findViewById(R.id.primerRycler)
        categoriesRecyclerView.adapter = CategoryAdapter(Heroes.marvelheroes)
        categoriesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        logout.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@Marvel, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}