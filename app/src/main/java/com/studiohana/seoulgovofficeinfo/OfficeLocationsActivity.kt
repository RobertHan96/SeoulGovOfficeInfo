package com.studiohana.seoulgovofficeinfo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        mOfficeAdapter = OfficeAdapters(mContext, officeList) { office ->
            runOnUiThread {
                Toast.makeText(mContext, "${office.name}구가 클릭됨", Toast.LENGTH_SHORT).show()
            }
        }

        officeRecyclerView.adapter = mOfficeAdapter
        val lm = GridLayoutManager(mContext,4, RecyclerView.VERTICAL, false)
        officeRecyclerView.layoutManager = lm
        officeRecyclerView.setHasFixedSize(true)

    }

}
