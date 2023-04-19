package com.example.listviewmid
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyAdapter(var mycntx:Context,var resources:Int,var item:List<Models>):ArrayAdapter<Models>(mycntx,resources,item) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
        val layoutInflater:LayoutInflater= LayoutInflater.from(mycntx)
        val view:View=layoutInflater.inflate(resources,null)
        val imageView:ImageView=view.findViewById(R.id.image)
        val Tv_ittle:TextView=view.findViewById(R.id.Tv_maintext)
        val Tv_description:TextView=view.findViewById(R.id.Tv_subtext)
        var myitems:Models=item[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        Tv_ittle.text=myitems.title
        Tv_description.text=myitems.description
        return  view
    }
}