package com.studiohana.seoulgovofficeinfo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.studiohana.seoulgovofficeinfo.adapters.OfficeAdapters
import com.studiohana.seoulgovofficeinfo.datas.Office
import kotlinx.android.synthetic.main.activity_office_locations.*


class OfficeLocationsActivity : BaseActivity() {
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
        val officeDetailView = Intent(mContext, OfficeDetailActivity::class.java)
        val previousViewId = intent.getIntExtra("id",1)
        if (previousViewId == 1) {
            mOfficeAdapter = OfficeAdapters(mContext, Office.shared.guList)
            mOfficeAdapter.itemClick = object : OfficeAdapters.ItemClick{
                override fun onClick(view: View, position: Int) {
                    officeDetailView.putExtra("clickedOfficeNo", position)
                    officeDetailView.putExtra("id", 1)
                    officeDetailView.putExtra("publicSite", Office.shared.guList[position].publicSite)
                    startActivity(officeDetailView)
                }
            }
            val lm = GridLayoutManager(mContext,4)
            officeRecyclerView.layoutManager = lm

        } else {
            mOfficeAdapter = OfficeAdapters(mContext, Office.shared.taxList)
            mOfficeAdapter.itemClick = object : OfficeAdapters.ItemClick{
                override fun onClick(view: View, position: Int) {
                    officeDetailView.putExtra("clickedOfficeNo", position)
                    officeDetailView.putExtra("id", 2)
                    startActivity(officeDetailView)
                }
            }
            val lm = GridLayoutManager(mContext,3)
            officeRecyclerView.layoutManager = lm
        }
        officeRecyclerView.adapter = mOfficeAdapter
        officeRecyclerView.setHasFixedSize(true)

    }

}
