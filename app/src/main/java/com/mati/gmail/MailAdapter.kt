package com.mati.wikiapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mati.gmail.R
import com.mati.gmail.databinding.ItemEmailBinding
import com.mati.wikiapp.data.MailData

class MailAdapter(private val data: ArrayList<MailData>, private val context: Context) :
    RecyclerView.Adapter<MailAdapter.MailViewHolder>() {

    lateinit var binding: ItemEmailBinding


    inner class MailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindViews(itemPost: MailData) {

            binding.title.text = itemPost.title
            binding.subText.text = itemPost.sub_text
            binding.text.text = itemPost.text
            binding.time.text = itemPost.time

            if(itemPost.star != false)
            {
                binding.star.setImageDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.ic_star
                    )
                )
            } else{
                binding.star.setImageDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.ic_start_fill
                    )
                )
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder {
        binding = ItemEmailBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MailViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MailViewHolder, position: Int) {

        holder.bindViews(data[position])

    }

    override fun getItemCount(): Int {
        return data.size
    }

}