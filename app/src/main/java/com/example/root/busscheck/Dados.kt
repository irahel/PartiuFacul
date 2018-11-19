package com.example.root.busscheck

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dados.*
import java.lang.Exception

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class Dados : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        setInitialState()

        val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0);

        editText12.setText(sharedPreferences.getString("Logged", ""))
        editText11.setText(sharedPreferences.getString(sharedPreferences.getString("Logged", "")+"_Sobrenome", ""))
        editText10.setText(sharedPreferences.getString(sharedPreferences.getString("Logged", "")+"_ID", ""))
        editText8.setText(sharedPreferences.getString(sharedPreferences.getString("Logged", "")+"_Email", ""))
        editText9.setText(sharedPreferences.getString(sharedPreferences.getString("Logged", ""), ""))


    }

    private fun setInitialState(){
        setListeners()
    }

    private fun setListeners(){
        buttonAtualize.setOnClickListener {

            try {
                if(editText12.text.toString() == "" || editText11.text.toString() == "" || editText10.text.toString() == "" ||
                        editText9.text.toString() == "" || editText8.text.toString() == ""){
                    throw Exception("Some empty fields")
                }else{
                    val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0)
                    val editor = sharedPreferences.edit()

                    editor.putString(sharedPreferences.getString("Logged", "")+"_Sobrenome", editText11.text.toString())
                    editor.putString(sharedPreferences.getString("Logged", "")+"_ID", editText10.text.toString())
                    editor.putString(sharedPreferences.getString("Logged", "")+"_Email", editText8.text.toString())
                    editor.putString(sharedPreferences.getString("Logged", ""), editText9.text.toString())

                    editor.apply()

                    Toast.makeText(this, "Updated data", Toast.LENGTH_SHORT).show()

                }
            }catch (e: Exception){
                Toast.makeText(this, e.message.toString(), Toast.LENGTH_SHORT).show()
            }

        }

        buttonTransitionHome2.setOnClickListener {
            val intent = Intent(this, Horarios::class.java)
            startActivity(intent)
        }
        buttonTransitionDate2.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        buttonTransitionSetings2.setOnClickListener {
            val intent = Intent(this, Configuracoes::class.java)
            startActivity(intent)
        }

    }
}
