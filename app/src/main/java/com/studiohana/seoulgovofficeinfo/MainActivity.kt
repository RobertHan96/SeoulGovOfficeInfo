package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

//    fun sendUserSelectItemEvents(selectedItem : String) {
//        val bundle = Bundle()
//        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id)
//        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name)
//        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image")
//        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
//    }

}
