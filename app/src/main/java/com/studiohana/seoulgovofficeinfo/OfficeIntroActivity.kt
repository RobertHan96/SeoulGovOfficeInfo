package com.studiohana.seoulgovofficeinfo

import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.studiohana.seoulgovofficeinfo.adapters.OfficeAdapters
import com.studiohana.seoulgovofficeinfo.adapters.TaskAdapters
import com.studiohana.seoulgovofficeinfo.datas.Office
import com.studiohana.seoulgovofficeinfo.datas.OfficeTask
import kotlinx.android.synthetic.main.activity_office_intro.*
import kotlinx.android.synthetic.main.activity_office_locations.*

class OfficeIntroActivity : BaseActivity() {
    val tasks = ArrayList<OfficeTask>()
    var mTaskAdapter : TaskAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_intro)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val previousViewId = intent.getIntExtra("id",1)
        if (previousViewId == 1) {
            mTaskAdapter = TaskAdapters(mContext, R.layout.task_list_item, OfficeTask.shared.guItems)
        } else {
            mTaskAdapter = TaskAdapters(mContext, R.layout.task_list_item, OfficeTask.shared.taxItems)
        }
        taskListView.adapter = mTaskAdapter

    }

}
