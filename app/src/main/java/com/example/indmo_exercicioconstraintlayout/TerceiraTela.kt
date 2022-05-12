package com.example.indmo_exercicioconstraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class TerceiraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)

        Timer().schedule(10000){abrirQuartaActivty()}

    }

    private fun abrirQuartaActivty() {

        val intent = Intent(this, QuartaTela::class.java)
        startActivity(intent)
        finish()
    }
}