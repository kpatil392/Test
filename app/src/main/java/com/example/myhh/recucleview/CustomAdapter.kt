package com.example.myhh.recucleview

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myhh.R
import kotlinx.android.synthetic.main.item_view.view.*

class CustomAdapter(val context: Context) :RecyclerView.Adapter<CustomAdapter.Holder>(){
    var movieList : List<Movie> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
    return Holder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindItems(movieList[position])
    }

    class Holder(view: View):RecyclerView.ViewHolder(view){
   
        fun bindItems(mMovie: Movie) {
           // tv.text=mModel.toString()
            
        }

    }
    fun setMovieListItems(movieList: List<Movie>){
        this.movieList = movieList;
        notifyDataSetChanged()
    }
}