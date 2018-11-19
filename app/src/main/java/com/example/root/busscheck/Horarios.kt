package com.example.root.busscheck

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_horarios.*
import android.content.Intent



class Horarios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horarios)

        val spinner = findViewById<View>(R.id.spinner1) as Spinner
        val adapter = ArrayAdapter.createFromResource(this, R.array.pontos_de_embarque,  R.layout.spinner_item)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        spinner.adapter = adapter



        setInitialState()

        val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0);

        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_M1", false))
        {
            radioButtonMorningMonday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_M2", false))
        {
            radioButtonMorningTuesday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_M3", false))
        {
            radioButtonMorningWednesday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_M4", false))
        {
            radioButtonMorningThursday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_M5", false))
        {
            radioButtonMorningFriday.callOnClick()
        }

        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_T1", false))
        {
            radioButtonAfternoonMonday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_T2", false))
        {
            radioButtonAfternoonTuesday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_T3", false))
        {
            radioButtonAfternoonWednesday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_T4", false))
        {
            radioButtonAfternoonThursday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_T5", false))
        {
            radioButtonAfternoonFriday.callOnClick()
        }

        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_N1", false))
        {
            radioButtonNightMonday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_N2", false))
        {
            radioButtonNightTuesday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_N3", false))
        {
            radioButtonNightWednesday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_N4", false))
        {
            radioButtonNightThursday.callOnClick()
        }
        if( sharedPreferences.getBoolean(sharedPreferences.getString("Logged", "")+"_N5", false))
        {
            radioButtonNightFriday.callOnClick()
        }

    }
    private fun setInitialState(){
        setInitialRadioStates()
        setInitialTextColors()
        setListeners()
    }
    private fun setListeners(){
        setRadioClickListeners()
        setMainButtonListener()
        setPageTransitionListeners()
    }
    private fun setInitialTextColors(){

        textViewMorningMonday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewMorningTuesday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewMorningWednesday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewMorningThursday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewMorningFriday.setTextColor(resources.getColor(R.color.YellowColor))

        textViewAfternoonMonday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewAfternoonTuesday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewAfternoonWednesday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewAfternoonThursday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewAfternoonFriday.setTextColor(resources.getColor(R.color.YellowColor))

        textViewNightMonday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewNightTuesday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewNightWednesday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewNightThursday.setTextColor(resources.getColor(R.color.YellowColor))
        textViewNightFriday.setTextColor(resources.getColor(R.color.YellowColor))
    }
    private fun setInitialRadioStates(){
        //Morning
        radioButtonMorningMonday.isActivated        = false
        radioButtonMorningMonday.isChecked          = false

        radioButtonMorningTuesday.isActivated       = false
        radioButtonMorningTuesday.isChecked         = false

        radioButtonMorningWednesday.isActivated     = false
        radioButtonMorningWednesday.isChecked       = false

        radioButtonMorningThursday.isActivated      = false
        radioButtonMorningThursday.isChecked        = false

        radioButtonMorningFriday.isActivated        = false
        radioButtonMorningFriday.isChecked          = false

        //Aftermoon
        radioButtonAfternoonMonday.isActivated      = false
        radioButtonAfternoonMonday.isChecked        = false

        radioButtonAfternoonTuesday.isActivated     = false
        radioButtonAfternoonTuesday.isChecked       = false

        radioButtonAfternoonWednesday.isActivated   = false
        radioButtonAfternoonWednesday.isChecked     = false

        radioButtonAfternoonThursday.isActivated    = false
        radioButtonAfternoonThursday.isChecked      = false

        radioButtonAfternoonFriday.isActivated      = false
        radioButtonAfternoonFriday.isChecked        = false

        //Night
        radioButtonNightMonday.isActivated          = false
        radioButtonNightMonday.isChecked            = false

        radioButtonNightTuesday.isActivated         = false
        radioButtonNightTuesday.isChecked           = false

        radioButtonNightWednesday.isActivated       = false
        radioButtonNightWednesday.isChecked         = false

        radioButtonNightThursday.isActivated        = false
        radioButtonNightThursday.isChecked          = false

        radioButtonNightFriday.isActivated          = false
        radioButtonNightFriday.isChecked            = false
    }
    private fun setRadioClickListeners() {
        radioButtonMorningMonday.setOnClickListener {
            if (radioButtonMorningMonday.isActivated) {
                radioButtonMorningMonday.isActivated        = false
                radioButtonMorningMonday.isChecked          = false
                textViewMorningMonday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonMorningMonday.isActivated        = true
                radioButtonMorningMonday.isChecked          = true
                textViewMorningMonday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonMorningTuesday.setOnClickListener {
            if (radioButtonMorningTuesday.isActivated) {
                radioButtonMorningTuesday.isActivated       = false
                radioButtonMorningTuesday.isChecked         = false
                textViewMorningTuesday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonMorningTuesday.isActivated       = true
                radioButtonMorningTuesday.isChecked         = true
                textViewMorningTuesday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonMorningWednesday.setOnClickListener {
            if (radioButtonMorningWednesday.isActivated) {
                radioButtonMorningWednesday.isActivated     = false
                radioButtonMorningWednesday.isChecked       = false
                textViewMorningWednesday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonMorningWednesday.isActivated     = true
                radioButtonMorningWednesday.isChecked       = true
                textViewMorningWednesday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonMorningThursday.setOnClickListener {
            if (radioButtonMorningThursday.isActivated) {
                radioButtonMorningThursday.isActivated      = false
                radioButtonMorningThursday.isChecked        = false
                textViewMorningThursday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonMorningThursday.isActivated      = true
                radioButtonMorningThursday.isChecked        = true
                textViewMorningThursday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonMorningFriday.setOnClickListener {
            if (radioButtonMorningFriday.isActivated) {
                radioButtonMorningFriday.isActivated        = false
                radioButtonMorningFriday.isChecked          = false
                textViewMorningFriday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonMorningFriday.isActivated        = true
                radioButtonMorningFriday.isChecked          = true
                textViewMorningFriday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }

        radioButtonAfternoonMonday.setOnClickListener {
            if (radioButtonAfternoonMonday.isActivated) {
                radioButtonAfternoonMonday.isActivated      = false
                radioButtonAfternoonMonday.isChecked        = false
                textViewAfternoonMonday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonAfternoonMonday.isActivated      = true
                radioButtonAfternoonMonday.isChecked        = true
                textViewAfternoonMonday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonAfternoonTuesday.setOnClickListener {
            if (radioButtonAfternoonTuesday.isActivated) {
                radioButtonAfternoonTuesday.isActivated     = false
                radioButtonAfternoonTuesday.isChecked       = false
                textViewAfternoonTuesday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonAfternoonTuesday.isActivated     = true
                radioButtonAfternoonTuesday.isChecked       = true
                textViewAfternoonTuesday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonAfternoonWednesday.setOnClickListener {
            if (radioButtonAfternoonWednesday.isActivated) {
                radioButtonAfternoonWednesday.isActivated   = false
                radioButtonAfternoonWednesday.isChecked     = false
                textViewAfternoonWednesday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonAfternoonWednesday.isActivated   = true
                radioButtonAfternoonWednesday.isChecked     = true
                textViewAfternoonWednesday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonAfternoonThursday.setOnClickListener {
            if (radioButtonAfternoonThursday.isActivated) {
                radioButtonAfternoonThursday.isActivated    = false
                radioButtonAfternoonThursday.isChecked      = false
                textViewAfternoonThursday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonAfternoonThursday.isActivated    = true
                radioButtonAfternoonThursday.isChecked      = true
                textViewAfternoonThursday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonAfternoonFriday.setOnClickListener {
            if (radioButtonAfternoonFriday.isActivated) {
                radioButtonAfternoonFriday.isActivated      = false
                radioButtonAfternoonFriday.isChecked        = false
                textViewAfternoonFriday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonAfternoonFriday.isActivated      = true
                radioButtonAfternoonFriday.isChecked        = true
                textViewAfternoonFriday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }

        radioButtonNightMonday.setOnClickListener {
            if (radioButtonNightMonday.isActivated) {
                radioButtonNightMonday.isActivated          = false
                radioButtonNightMonday.isChecked            = false
                textViewNightMonday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonNightMonday.isActivated          = true
                radioButtonNightMonday.isChecked            = true
                textViewNightMonday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonNightTuesday.setOnClickListener {
            if (radioButtonNightTuesday.isActivated) {
                radioButtonNightTuesday.isActivated         = false
                radioButtonNightTuesday.isChecked           = false
                textViewNightTuesday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonNightTuesday.isActivated         = true
                radioButtonNightTuesday.isChecked           = true
                textViewNightTuesday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonNightWednesday.setOnClickListener {
            if (radioButtonNightWednesday.isActivated) {
                radioButtonNightWednesday.isActivated       = false
                radioButtonNightWednesday.isChecked         = false
                textViewNightWednesday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonNightWednesday.isActivated       = true
                radioButtonNightWednesday.isChecked         = true
                textViewNightWednesday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonNightThursday.setOnClickListener {
            if (radioButtonNightThursday.isActivated) {
                radioButtonNightThursday.isActivated        = false
                radioButtonNightThursday.isChecked          = false
                textViewNightThursday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonNightThursday.isActivated        = true
                radioButtonNightThursday.isChecked          = true
                textViewNightThursday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
        radioButtonNightFriday.setOnClickListener {
            if (radioButtonNightFriday.isActivated) {
                radioButtonNightFriday.isActivated          = false
                radioButtonNightFriday.isChecked            = false
                textViewNightFriday.setTextColor(resources.getColor(R.color.YellowColor))
            } else {
                radioButtonNightFriday.isActivated          = true
                radioButtonNightFriday.isChecked            = true
                textViewNightFriday.setTextColor(resources.getColor(R.color.GrayColorHalf))
            }
        }
    }
    private fun setMainButtonListener(){
        //Not implemented yet
        buttonRegister.setOnClickListener {
            val sharedPreferences = getApplicationContext().getSharedPreferences("Reg", 0);

            val editor = sharedPreferences.edit();

            if (radioButtonMorningMonday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M1", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M1", false)
            }
            if (radioButtonMorningTuesday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M2", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M2", false)
            }
            if (radioButtonMorningWednesday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M3", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M3", false)
            }
            if (radioButtonMorningThursday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M4", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M4", false)
            }
            if (radioButtonMorningFriday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M5", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_M5", false)
            }


            if (radioButtonAfternoonMonday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T1", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T1", false)
            }
            if (radioButtonAfternoonTuesday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T2", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T2", false)
            }
            if (radioButtonAfternoonWednesday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T3", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T3", false)
            }
            if (radioButtonAfternoonThursday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T4", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T4", false)
            }
            if (radioButtonAfternoonFriday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T5", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_T5", false)
            }


            if (radioButtonNightMonday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N1", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N1", false)
            }
            if (radioButtonNightTuesday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N2", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N2", false)
            }
            if (radioButtonNightWednesday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N3", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N3", false)
            }
            if (radioButtonNightThursday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N4", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N4", false)
            }
            if (radioButtonNightFriday.isActivated){
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N5", true)
            }else{
                editor.putBoolean(sharedPreferences.getString("Logged", "")+"_N5", false)
            }

            editor.apply()

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }
    }
    private fun setPageTransitionListeners(){
        buttonTransitionHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        buttonTransitionData.setOnClickListener {
            val intent = Intent(this, Dados::class.java)
            startActivity(intent)
        }

        buttonTransitionSetings.setOnClickListener {
            val intent = Intent(this, Configuracoes::class.java)
            startActivity(intent)
        }
    }
}
