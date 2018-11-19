package com.example.root.busscheck

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*
import java.lang.Exception

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setInitialState()


    }
    private fun setInitialState(){
        setListeners()
    }

    private fun setListeners(){
        buttonRegisterc.setOnClickListener {
            try{
                val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0);

                val editor = sharedPreferences.edit();

                if (editText4.text.toString() == "" || editText7.text.toString() == "" || editText3.text.toString() == "" ||
                        editText5.text.toString() == "" || editText6.text.toString() == ""){
                    throw Exception("Some empty value")
                }

                editor.putString(editText4.text.toString(), editText7.text.toString())
                editor.putString(editText4.text.toString()+"_Email",editText3.text.toString())
                editor.putString(editText4.text.toString()+"_Sobrenome",editText5.text.toString())
                editor.putString(editText4.text.toString()+"_ID",editText6.text.toString())
                editor.putBoolean(editText4.text.toString()+"_Confirmed", false)
                editor.putBoolean(editText4.text.toString()+"_M1", false)
                editor.putBoolean(editText4.text.toString()+"_M2", false)
                editor.putBoolean(editText4.text.toString()+"_M3", false)
                editor.putBoolean(editText4.text.toString()+"_M4", false)
                editor.putBoolean(editText4.text.toString()+"_M5", false)
                editor.putBoolean(editText4.text.toString()+"_T1", false)
                editor.putBoolean(editText4.text.toString()+"_T2", false)
                editor.putBoolean(editText4.text.toString()+"_T3", false)
                editor.putBoolean(editText4.text.toString()+"_T4", false)
                editor.putBoolean(editText4.text.toString()+"_T5", false)
                editor.putBoolean(editText4.text.toString()+"_N1", false)
                editor.putBoolean(editText4.text.toString()+"_N2", false)
                editor.putBoolean(editText4.text.toString()+"_N3", false)
                editor.putBoolean(editText4.text.toString()+"_N4", false)
                editor.putBoolean(editText4.text.toString()+"_N5", false)

                editor.apply()

                Toast.makeText(this, "User "+editText4.text.toString() +" successfully registered", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }catch (e: Exception){
                Toast.makeText(this, e.message.toString(), Toast.LENGTH_SHORT).show()
            }

        }
    }
}
