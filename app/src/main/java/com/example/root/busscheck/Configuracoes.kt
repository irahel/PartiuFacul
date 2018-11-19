package com.example.root.busscheck

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_configuracoes.*

class Configuracoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracoes)

        setInitialState()
    }

    private fun setInitialState(){
        setListeners()
    }

    private fun setListeners(){
        buttonQuit.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        buttonTransitionHome3.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        buttonTransitionData3.setOnClickListener {
            val intent = Intent(this, Dados::class.java)
            startActivity(intent)
        }
        buttonTransitionDate3.setOnClickListener {
            val intent = Intent(this, Horarios::class.java)
            startActivity(intent)
        }
    }
}
