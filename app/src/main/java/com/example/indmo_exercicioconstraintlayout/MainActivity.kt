package com.example.indmo_exercicioconstraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import java.util.Timer
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(2000){abrirSegundaActivty()}

    }

    private fun abrirSegundaActivty() {

        val intent = Intent(this, SegundaTela::class.java)
        startActivity(intent)
        finish()
    }
}