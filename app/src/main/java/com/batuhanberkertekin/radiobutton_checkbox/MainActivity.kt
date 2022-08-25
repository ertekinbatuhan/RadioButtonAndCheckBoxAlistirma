package com.batuhanberkertekin.radiobutton_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        javaBox.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                firstText.text = "Java"


            }
        }


                kotlinBox.setOnCheckedChangeListener { buttonView, isChecked ->

                    if (isChecked) {
                        firstText.text = "Kotlin"


                    }
                }
                    swiftBox.setOnCheckedChangeListener { buttonView, isChecked ->

                        if (isChecked) {
                            firstText.text = "Swift"


                        }
                    }

                        swiftButton.setOnCheckedChangeListener { buttonView, isChecked ->

                            if(isChecked){

                                secondText.text = "Swift"
                            }

                        }
                        flutterButton.setOnCheckedChangeListener { buttonView, isChecked ->

                            if(isChecked){

                                secondText.text = "Flutter"
                            }

                        }
                        kotlinButton.setOnCheckedChangeListener { buttonView, isChecked ->

                            if(isChecked){

                                secondText.text = "Kotlin"
                            }

                        }









                    }



        }

