package com.lucassimoesmartins.myrecyclerviewgridexample.views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lucassimoesmartins.myrecyclerviewgridexample.R
import com.lucassimoesmartins.myrecyclerviewgridexample.model.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

class MyRecyclerViewAdapter(
    private val context: Context,
    private val list: ArrayList<Movie>
) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(list[position])
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMovie = itemView.imgMovie
        val txtTitle = itemView.txtTitle
        val txtSubtitle = itemView.txtSubtitle
        val txtPercent = itemView.txtpercent

        fun bindView(movie: Movie) {
            txtTitle.text = movie.title
            txtSubtitle.text = movie.subtitle
            txtPercent.text = movie.percent

            Picasso
                .get()
                .load(movie.image)
                .into(imgMovie)
        }
    }
}