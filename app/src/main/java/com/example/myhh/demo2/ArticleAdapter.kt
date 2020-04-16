package com.example.myhh.demo2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myhh.R
import com.example.myhh.databinding.RawItemBinding

class ArticleAdapter (private val mArticles: List<Article>) : RecyclerView.Adapter<ArticleAdapter.BindingHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val binding = DataBindingUtil.inflate<RawItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.raw_item, parent, false)

        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val binding = holder.binding
        //binding.avm = ArticleViewModel(mArticles[position])
    }

    override fun getItemCount(): Int {
        return mArticles.size
    }

    class BindingHolder(val binding: RawItemBinding) : RecyclerView.ViewHolder(binding.root)
}