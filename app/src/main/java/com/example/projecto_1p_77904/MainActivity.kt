package com.example.projecto_1p_77904

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projecto_1p_77904.models.User
import com.example.projecto_1p_77904.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    lateinit var loginBtn: Button
    lateinit var emailET: EditText
    lateinit var passwordET: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("mypref", Context.MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        val intent = Intent(this@MainActivity, HomeActivity::class.java)
        if (isLogged) {
            startActivity(intent)
            finish()
        }
        loginBtn = findViewById(R.id.loginBtn)
        emailET = findViewById(R.id.usuario)
        passwordET = findViewById(R.id.contraseña)
        loginBtn.setOnClickListener {
            Log.i("LOGAPP", "Iniciar sesion")
            val email: String = emailET.text.toString()
            val password: String = passwordET.text.toString()
            Log.i("Email", email)
            Log.i("Password", password)
            if (email.isEmpty() || password.isEmpty()) {
                Log.i("ERROR", "La contaseña o el correo esta vacio")
                return@setOnClickListener
            }
            val isValidUser = User.staticUsers.any{user->
                user.email == email && user.password == password
            }
            if (!isValidUser) {
                Log.i("Error", "Correo o contraseña incorrectos")
                return@setOnClickListener
            }
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()

            startActivity(intent)
            finish()

            Log.i("Acceso", "Accesaste con exito")
        }
    }
}