package com.studiohana.seoulgovofficeinfo.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.studiohana.seoulgovofficeinfo.OfficeDetailActivity
import com.studiohana.seoulgovofficeinfo.R
import com.studiohana.seoulgovofficeinfo.datas.Office
import com.studiohana.seoulgovofficeinfo.datas.OfficeTask

class OfficeAdapters (val mContext: Context, val mList : ArrayList<Office>) :
    RecyclerView.Adapter<OfficeAdapters.Holder>() {
    var itemClick : ItemClick? = null

    interface ItemClick {
        fun onClick(view : View, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfficeAdapters.Holder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.office_name_item, parent, false)
        return  Holder(view)

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(mList[position], mContext)
        holder.officeName.setOnClickListener {
            itemClick?.onClick(it, position)
        }
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val officeName = itemView.findViewById<TextView>(R.id.officeNameText)

        fun bind (office: Office, context: Context) {
            if (officeName != null) {
                officeName.text = office.name
            }
        }
    }

}