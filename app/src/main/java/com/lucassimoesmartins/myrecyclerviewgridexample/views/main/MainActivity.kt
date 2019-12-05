package com.lucassimoesmartins.myrecyclerviewgridexample.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.lucassimoesmartins.myrecyclerviewgridexample.views.adapter.MyRecyclerViewAdapter
import com.lucassimoesmartins.myrecyclerviewgridexample.R
import com.lucassimoesmartins.myrecyclerviewgridexample.model.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUI()
    }

    private fun setUI() {

        val list = getList()
        recyclerView.adapter =
            MyRecyclerViewAdapter(
                this,
                list
            )
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }

    private fun getList(): ArrayList<Movie> {

        //Hardcoded list
        val list: ArrayList<Movie> = arrayListOf(

            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/qdfARIhgpgZOBh3vfNhWS4hmSo3.jpg",
                "71%",
                "Frozen II",
                "November 20, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/mbm8k3GFhXS0ROd9AD1gqYbIFbM.jpg",
                "81%",
                "The Irishman",
                "Novembrer 1, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
                "84%",
                "Joker",
                "October 2, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/zBhv8rsLOfpFW2M5b6wW78Uoojs.jpg",
                "62%",
                "Hustlers",
                "September 12, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/jpfkzbIXgKZqCZAkEkFH2VYF63s.jpg",
                "67%",
                "Cars",
                "June 8, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg",
                "70%",
                "Aladdin",
                "May 22, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/4I0CQfnMy6sRR7QhgqsXR16TmIs.jpg",
                "35%",
                "Ellipse",
                "December 12, 2019"
            ),
            Movie(
                "https://image.tmdb.org/t/p/w370_and_h556_bestv2/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
                "85%",
                "Parasite",
                "May 30, 2019"
            )
        )
        return list
    }
}
