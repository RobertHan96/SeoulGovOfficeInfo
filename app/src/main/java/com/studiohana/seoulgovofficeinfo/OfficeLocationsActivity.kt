package com.studiohana.seoulgovofficeinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_office_locations.*


class OfficeLocationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_locations)

        officeListsWeb.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }
        officeListsWeb.loadUrl("https://www.naver.com/")
    }
}
