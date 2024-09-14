package com.example.projecto_1p_77904.ui

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projecto_1p_77904.MainActivity
import com.example.projecto_1p_77904.R

class HomeActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logout : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("mypref", Context.MODE_PRIVATE)
        username = findViewById(R.id.userTV)
        logout = findViewById(R.id.logoutBtn)

        logout.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}