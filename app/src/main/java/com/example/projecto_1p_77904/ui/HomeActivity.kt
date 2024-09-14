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
import com.example.projecto_1p_77904.models.User

class HomeActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logout : ImageView
    lateinit var marvelPage : ImageView
    lateinit var dcpage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("mypref", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("userEmail", "")
        val user = User.staticUsers.firstOrNull() { it.email == userEmail }
        username = findViewById(R.id.userTV)
        logout = findViewById(R.id.logoutBtn)
        marvelPage = findViewById(R.id.imgMarvel)
        dcpage = findViewById(R.id.imgDc)
        username.text = user?.name

        logout.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        marvelPage.setOnClickListener{
            val intent = Intent(this@HomeActivity, Marvel::class.java)
            startActivity(intent)
            finish()
        }
        dcpage.setOnClickListener{
            val intent = Intent(this@HomeActivity, DCcomics::class.java)
            startActivity(intent)
            finish()
        }
    }
}