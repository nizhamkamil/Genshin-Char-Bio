package com.example.mygenshinproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCharacterAdapter(private val listCharacter: ArrayList<Character>) : RecyclerView.Adapter<ListCharacterAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_character_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_character)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_character, parent, false)
        return ListViewHolder(view)
    }


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val character = listCharacter[position]

        Glide.with(holder.itemView.context)
            .load(character.photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.imgPhoto)

        holder.tvName.text = character.name
        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listCharacter[holder.position])}
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Character)
    }


    override fun getItemCount(): Int {
        return listCharacter.size
    }
}