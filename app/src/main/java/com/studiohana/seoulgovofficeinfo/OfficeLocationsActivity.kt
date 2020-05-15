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
        val previousViewId = intent.getIntExtra("id",1)
        if (previousViewId == 1) {
            mOfficeAdapter = OfficeAdapters(mContext, Office.shared.guList) { office ->
                runOnUiThread {
                    Toast.makeText(mContext, "${office.name}구가 클릭됨", Toast.LENGTH_SHORT).show()
                }
            }
            val lm = GridLayoutManager(mContext,4)
            officeRecyclerView.layoutManager = lm

        } else {
            mOfficeAdapter = OfficeAdapters(mContext, Office.shared.taxList) { office ->
                runOnUiThread {
                    Toast.makeText(mContext, "${office.name}구가 클릭됨", Toast.LENGTH_SHORT).show()
                }
            }
            val lm = GridLayoutManager(mContext,3)
            officeRecyclerView.layoutManager = lm
        }
        officeRecyclerView.adapter = mOfficeAdapter
        officeRecyclerView.setHasFixedSize(true)

    }

}
