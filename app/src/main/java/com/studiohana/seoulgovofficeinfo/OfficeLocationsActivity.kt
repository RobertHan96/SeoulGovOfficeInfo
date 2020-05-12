package com.studiohana.seoulgovofficeinfo

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.studiohana.seoulgovofficeinfo.adapters.OfficeAdapters
import com.studiohana.seoulgovofficeinfo.datas.Office
import kotlinx.android.synthetic.main.activity_office_locations.*


class OfficeLocationsActivity : BaseActivity() {
    var officeList = ArrayList<Office>()
    private lateinit var mOfficeAdapter : OfficeAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_locations)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {
        officeList.add(Office("광진", "02-50-1500","서울시 광진구 자양동", "www.naver.com", 37.5, 2.4))
        officeList.add(Office("성동", "02-450-1500","서울시 광진구 자양동", "www.naver.com", 37.5, 2.4))
        officeList.add(Office("서초", "02-450-1500","서울시 광진구 자양동", "www.naver.com", 37.5, 2.4))
        officeList.add(Office("강남", "02-450-1500","서울시 광진구 자양동", "www.naver.com", 37.5, 2.4))
        officeList.add(Office("송파", "02-450-1500","서울시 광진구 자양동", "www.naver.com", 37.5, 2.4))

        mOfficeAdapter = OfficeAdapters(mContext, officeList)
        officeRecyclerView.adapter = mOfficeAdapter
        val lm = GridLayoutManager(mContext,4)
        officeRecyclerView.layoutManager = lm
        officeRecyclerView.setHasFixedSize(true)


//        officeListsWeb.apply {
//            settings.javaScriptEnabled = true
//            webViewClient = WebViewClient()
//        }
//        officeListsWeb.loadUrl("https://www.google.com")

    }

}
