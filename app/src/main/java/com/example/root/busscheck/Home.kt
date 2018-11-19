package com.example.root.busscheck

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_home.*

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0)


        textView16.text = sharedPreferences.getInt("NumberConfirmed", 0).toString()
        textView14.text = "1"



        setInitialState()
    }

    private fun setInitialState(){
        setListeners()
    }

    private fun setListeners(){

        button9.setOnClickListener {
            val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0)
            val editor = sharedPreferences.edit()

            if (sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_Confirmed", false) == true){
                Toast.makeText(this, "Student has already confirmed presence", Toast.LENGTH_SHORT).show()
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_Confirmed", true)
                editor.putInt("NumberConfirmed", sharedPreferences.getInt("NumberConfirmed", 0) + 1)
                editor.apply()
                textView16.text = sharedPreferences.getInt("NumberConfirmed", 0).toString()
                textView14.text = "1"


            }

        }
        buttonTransitionData.setOnClickListener {
            val intent = Intent(this, Dados::class.java)
            startActivity(intent)
        }
        buttonTransitionDate.setOnClickListener {
            val intent = Intent(this, Horarios::class.java)
            startActivity(intent)
        }
        buttonTransitionSetings.setOnClickListener {
            val intent = Intent(this, Configuracoes::class.java)
            startActivity(intent)
        }
    }
}
