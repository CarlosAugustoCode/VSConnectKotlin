package com.example.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vsconnect_kotlin.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        /*setOnClickListener é um ouvinte de clique
        * ou seja, quando cliecar no botão Entrar, irá cair nesse bloco*/
        binding.btnEntrar.setOnClickListener {

            /*Variável mainIntent com a intenção de sair da LoginActivity e ir para MainActivity*/
            val mainIntent = Intent(this@LoginActivity,
                MainActivity::class.java)

            /*executa a intenção armazenada na variável MainIntent*/
            startActivity(mainIntent)

            /*finaliza a Login Activity*/
            finish()

        }
        setContentView(binding.root)
    }
}