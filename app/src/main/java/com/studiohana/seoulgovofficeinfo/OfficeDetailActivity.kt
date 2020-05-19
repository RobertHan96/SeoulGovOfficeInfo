package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.UiThread
import androidx.lifecycle.Transformations.map
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.CameraUpdate
import com.naver.maps.map.MapFragment
import com.naver.maps.map.NaverMap
import com.naver.maps.map.overlay.Marker
import com.studiohana.seoulgovofficeinfo.datas.Office
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
        val previousClickedItemId = intent.getIntExtra("clickedOfficeNo",1)
        val previousViewId = intent.getIntExtra("id",1)

        officeWebViewBtn.setOnClickListener {
            val webViewIntent = Intent(mContext, OfficePublicSiteActivity::class.java)
            if (previousViewId == 1) {
                webViewIntent.putExtra("publicSite", Office.shared.guList[previousClickedItemId].publicSite)
                startActivity(webViewIntent)
            } else {
                webViewIntent.putExtra("publicSite", Office.shared.taxList[previousClickedItemId].publicSite)
                startActivity(webViewIntent)
            }
        }

    }

    override fun setValues() {
        val previousClickedItemId = intent.getIntExtra("clickedOfficeNo",1)
        val previousViewId = intent.getIntExtra("id",1)

        val fm = supportFragmentManager
        val marker = Marker()
        val mapFragment = fm.findFragmentById(R.id.map_fragment) as MapFragment?
            ?: MapFragment.newInstance().also {
                fm.beginTransaction().add(R.id.map_fragment, it).commit()
            }

        if (previousViewId == 1) {
            val currentOfficeLat = Office.shared.guList[previousClickedItemId].lat
            val currentOfficeLng = Office.shared.guList[previousClickedItemId].lng
            marker.position = LatLng(currentOfficeLat, currentOfficeLng)
            val cameraUpdate = CameraUpdate.scrollTo(LatLng(currentOfficeLat, currentOfficeLng))
            mapFragment.getMapAsync {
                it.moveCamera(cameraUpdate)
                marker.map = it
            }

            officeName.text = Office.shared.guList[previousClickedItemId].name
            officeTel.text = Office.shared.guList[previousClickedItemId].tel
            officeAddress.text = Office.shared.guList[previousClickedItemId].address
        } else {
            val currentOfficeLat = Office.shared.taxList[previousClickedItemId].lat
            val currentOfficeLng = Office.shared.taxList[previousClickedItemId].lng
            marker.position = LatLng(currentOfficeLat, currentOfficeLng)
            val cameraUpdate = CameraUpdate.scrollTo(LatLng(currentOfficeLat, currentOfficeLng))
            mapFragment.getMapAsync {
                it.moveCamera(cameraUpdate)
                marker.map = it
            }

            officeName.text = Office.shared.taxList[previousClickedItemId].name
            officeTel.text = Office.shared.taxList[previousClickedItemId].tel
            officeAddress.text = Office.shared.taxList[previousClickedItemId].address
        }
    }

}
