package com.example.indmo_exercicioconstraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        Timer().schedule(10000){abrirTerceiraActivty()}

    }

    private fun abrirTerceiraActivty() {

        val intent = Intent(this, TerceiraTela::class.java)
        startActivity(intent)
        finish()
    }
}