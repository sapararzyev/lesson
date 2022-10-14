package com.example.lesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson.databinding.ItemNaneBinding
import com.squareup.picasso.Picasso

class NameAdapter(private var data: ArrayList<name1>,private val onKlic: Onclik)
    : RecyclerView.Adapter<NameAdapter.NameViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
       return NameViewHolder(ItemNaneBinding.inflate
           (LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind(data.get(position))

        holder.itemView.setOnClickListener{
             onKlic.OnItemClick(data.get(position))
        }
    }
    override fun getItemCount(): Int {
        return data.size
    }
    inner class NameViewHolder(private var bindind: ItemNaneBinding )
        : RecyclerView.ViewHolder(bindind.root){
        fun bind(name: name1) {
            bindind.tvname.text = name.name
            bindind.tvsurname.text = name.surname
            bindind.tvage.text = name.age.toString()
            val photo2 = name.foto
            Picasso.get().load(photo2).into(bindind.imFoto)
        }
    }
}

