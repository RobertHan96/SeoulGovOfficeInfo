package com.studiohana.seoulgovofficeinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_office_public_site.*

class OfficePublicSiteActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_public_site)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {
    }

    override fun setValues() {
        val publicSiteUrl = intent.getStringExtra("publicSite")
        officeWebView.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }
        officeWebView.loadUrl(publicSiteUrl)

    }

}
