package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        taxOfficeIntroBtn.setOnClickListener {
            val taxOfficeIntroIntent = Intent(this, OfficeIntroActivity::class.java)
            startActivity(taxOfficeIntroIntent)
        }

        guOfficeIntroBtn.setOnClickListener {
            val guOfficeIntroIntet = Intent(this, OfficeIntroActivity::class.java)
            startActivity(guOfficeIntroIntet)
        }
    }
}
