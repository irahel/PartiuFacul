package com.example.root.busscheck

import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_login.*
import java.net.HttpURLConnection
import java.net.URL
import java.io.*
import java.net.MalformedURLException


class Login : AppCompatActivity() {

    val connHelper = "localhost:3000/api/v1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        setInitialState()
    }

    private fun setInitialState(){
        setListeners()
    }

    private fun setListeners(){
        buttonLogin.setOnClickListener {
            try {
                val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0);
// get editor to edit in file
                val editor = sharedPreferences.edit();


                if (editText2.text.toString() == "" || editText.text.toString() == ""){
                    //Toast.makeText(this, "Empty fields", Toast.LENGTH_SHORT).show()
                    throw java.lang.Exception("Empty fields")
                }
                if (!sharedPreferences.contains(editText2.text.toString())){
                    //Toast.makeText(this, "User not registered", Toast.LENGTH_SHORT).show()
                    throw java.lang.Exception("Not registered")
                }


                val pass = sharedPreferences.getString(editText2.text.toString(), "")

                if (editText.text.toString() == pass)
                {
                    editor.putInt("NumberConfirmed", 0)
                    editor.putString("Logged", editText2.text.toString())
                    editor.apply()
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                }else{
                    throw java.lang.Exception("Wrong password or login")
                }
            }catch (e: Exception){
                editText2.setText("")
                editText.setText("")

                Toast.makeText(this, e.message.toString(), Toast.LENGTH_SHORT).show()
            }






        }
        buttonRegister.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
    }


}
