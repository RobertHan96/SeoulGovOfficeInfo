package com.studiohana.seoulgovofficeinfo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.studiohana.seoulgovofficeinfo.R
import com.studiohana.seoulgovofficeinfo.datas.Office
import com.studiohana.seoulgovofficeinfo.datas.OfficeTask

class OfficeAdapters (context: Context, list : ArrayList<Office>) : RecyclerView.Adapter<OfficeAdapters.Holder>() {
    val mContext = context
    val mList = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfficeAdapters.Holder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.office_name_item, parent, false)
        return  Holder(view)

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(mList[position], mContext)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val officeName = itemView?.findViewById<TextView>(R.id.officeNameText)

        fun bind (office: Office, context: Context) {
            if (officeName != null) {
                officeName.text = office.name
            }
        }
    }
}