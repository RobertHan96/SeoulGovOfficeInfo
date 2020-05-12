package com.studiohana.seoulgovofficeinfo

import android.os.Bundle
import com.studiohana.seoulgovofficeinfo.adapters.TaskAdapters
import com.studiohana.seoulgovofficeinfo.datas.OfficeTask
import kotlinx.android.synthetic.main.activity_office_intro.*

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
        tasks.add(OfficeTask(1,"연말정산"))
        tasks.add(OfficeTask(1,"소득 증명원 발급"))
        tasks.add(OfficeTask(1,"부가가치세 신고"))
        tasks.add(OfficeTask(1,"재산 환수 및 몰수"))

        mTaskAdapter = TaskAdapters(this, R.layout.task_list_item, tasks)
        taskListView.adapter = mTaskAdapter

    }

}
