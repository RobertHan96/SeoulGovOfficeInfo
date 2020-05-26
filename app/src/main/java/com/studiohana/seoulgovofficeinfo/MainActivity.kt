package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.widget.TextViewCompat
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAnalytics = FirebaseAnalytics.getInstance(mContext)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        taxOfficeIntroBtn.setOnClickListener {
            sendUserSelectItemEvents("2", "taxOfficeIntro")
            val taxOfficeIntroIntent = Intent(mContext, OfficeIntroActivity::class.java)
            taxOfficeIntroIntent.putExtra("id",2)
            startActivity(taxOfficeIntroIntent)
        }

        guOfficeIntroBtn.setOnClickListener {
            sendUserSelectItemEvents("1", "guOfficeIntro")
            val guOfficeIntroIntent = Intent(mContext, OfficeIntroActivity::class.java)
            guOfficeIntroIntent.putExtra("id",1)
            startActivity(guOfficeIntroIntent)
        }

        findGuOfficeBtn.setOnClickListener {
            sendUserSelectItemEvents("1", "guOfficeList")
            val guOfficeListIntent = Intent(mContext, OfficeLocationsActivity::class.java)
            guOfficeListIntent.putExtra("id", 1)
            startActivity(guOfficeListIntent)
        }

        findTaxOfficeBtn.setOnClickListener {
            sendUserSelectItemEvents("2", "taxOfficeList")
            val taxOfficeListIntent = Intent(mContext, OfficeLocationsActivity::class.java)
            taxOfficeListIntent.putExtra("id",2)
            startActivity(taxOfficeListIntent)
        }
    }

    override fun setValues() {
        TextViewCompat.setAutoSizeTextTypeWithDefaults(mainViewTitleText, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM )
        TextViewCompat.setAutoSizeTextTypeWithDefaults(guOfficeIntroBtn, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM )
        TextViewCompat.setAutoSizeTextTypeWithDefaults(findGuOfficeBtn, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM )
        TextViewCompat.setAutoSizeTextTypeWithDefaults(taxOfficeIntroBtn, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM )
        TextViewCompat.setAutoSizeTextTypeWithDefaults(findTaxOfficeBtn, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM )

    }

    fun sendUserSelectItemEvents(selectedID : String ,selectedItem : String) {
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, selectedID)
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, selectedItem )
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "item")
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
    }

}
