package com.example.gridviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.grid_item.view.*


class GridAdapter(
    var context: Context,
    var name: Array<String>,
    var image: IntArray,
) : BaseAdapter() {

    var inflater: LayoutInflater? = null

    override fun getCount(): Int {
        return name.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View? {
        var view = view
        if (inflater == null) {
            inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (view == null) {
            view = inflater!!.inflate(R.layout.grid_item, null)
        }
        val imageView: ImageView = view!!.image_grid
        val textView: TextView = view.item_name

        imageView.setImageResource(image[position])
        textView.text = name[position]

        return view
    }
}