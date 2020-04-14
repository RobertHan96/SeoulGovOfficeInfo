package com.studiohana.seoulgovofficeinfo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.studiohana.seoulgovofficeinfo.R
import com.studiohana.seoulgovofficeinfo.datas.OfficeTask

class TaskAdapters (context: Context, resID : Int, list : ArrayList<OfficeTask>) : ArrayAdapter<OfficeTask>(context, resID, list) {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow : View? = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.task_list_item, null)
        }
        var row : View = tempRow!!
        val taskText = row.findViewById<TextView>(R.id.taskText)
        var data = mList.get(position)
        taskText.text = data.task

        return row
    }
}