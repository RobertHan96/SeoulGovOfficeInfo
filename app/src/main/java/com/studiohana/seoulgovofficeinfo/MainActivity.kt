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
            val taxOfficeIntroIntent = Intent(mContext, OfficeIntroActivity::class.java)
            taxOfficeIntroIntent.putExtra("id",2)
            startActivity(taxOfficeIntroIntent)
        }

        guOfficeIntroBtn.setOnClickListener {
            val guOfficeIntroIntent = Intent(mContext, OfficeIntroActivity::class.java)
            guOfficeIntroIntent.putExtra("id",1)
            startActivity(guOfficeIntroIntent)
        }

        findGuOfficeBtn.setOnClickListener {
            val guOfficeListIntent = Intent(mContext, OfficeLocationsActivity::class.java)
            guOfficeListIntent.putExtra("id", 1)
            startActivity(guOfficeListIntent)
        }

        findTaxOfficeBtn.setOnClickListener {
            val taxOfficeListIntent = Intent(mContext, OfficeLocationsActivity::class.java)
            taxOfficeListIntent.putExtra("id",2)
            startActivity(taxOfficeListIntent)
        }
    }

    override fun setValues() {
    }
}
