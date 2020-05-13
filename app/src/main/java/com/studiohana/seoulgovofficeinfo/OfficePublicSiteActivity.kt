package com.studiohana.seoulgovofficeinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
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
        officeWebView.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }

        officeWebView.loadUrl("https://www.google.com")
    }

}
