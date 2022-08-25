package com.batuhanberkertekin.radiobutton_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {

            val javaDurum = javaBox.isChecked.toString()
            val kotlinDurum = kotlinBox.isChecked.toString()
            val swiftDurum = swiftBox.isChecked.toString()


            val swiftRadio = swiftButton.isChecked.toString()
            val kotlinRadio = kotlinButton.isChecked.toString()
            val flutterRadio = flutterButton.isChecked.toString()




            Log.e("Java ",javaDurum)
            Log.e("Kotlin",kotlinDurum)
            Log.e("Swift",swiftDurum)
            Log.e("Geleceğin dili",swiftRadio)
            Log.e("Geleceğin dili",kotlinRadio)
            Log.e("Geleceğin dili",flutterRadio)





        }
    }
}