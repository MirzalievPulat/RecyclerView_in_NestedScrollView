package com.example.recyclerview_as_gridview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_as_gridview.model.Member
import com.example.recyclerview_in_nestedscrollview.R

class RecyclerAdapter(var members:ArrayList<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return members.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_member_layout,parent,false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MemberViewHolder){
            holder.name.text = members[position].name
            holder.surname.text = members[position].surname
        }
    }

    class MemberViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var surname = view.findViewById<TextView>(R.id.tv_surname)
        var name = view.findViewById<TextView>(R.id.tv_name)
    }
}