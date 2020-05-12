package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        taxOfficeIntroBtn.setOnClickListener {
            val taxOfficeIntroIntent = Intent(this, OfficeIntroActivity::class.java)
            startActivity(taxOfficeIntroIntent)
        }

        guOfficeIntroBtn.setOnClickListener {
            val guOfficeIntroIntent = Intent(this, OfficeIntroActivity::class.java)
            startActivity(guOfficeIntroIntent)
        }

        findGuOfficeBtn.setOnClickListener {
            val guOfficeListIntent = Intent(this, OfficeLocationsActivity::class.java)
            startActivity(guOfficeListIntent)
        }

        findTaxOfficeBtn.setOnClickListener {
            val taxOfficeListIntent = Intent(this, OfficeLocationsActivity::class.java)
            startActivity(taxOfficeListIntent)
        }
    }

    override fun setValues() {
    }
}
