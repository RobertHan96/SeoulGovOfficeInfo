package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_office_detail.*
import kotlinx.android.synthetic.main.activity_office_public_site.*

class OfficeDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_detail)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {
        officeWebViewBtn.setOnClickListener {
            val webViewIntent = Intent(mContext, OfficePublicSiteActivity::class.java)
            startActivity(webViewIntent)
        }

    }

    override fun setValues() {

    }

}
