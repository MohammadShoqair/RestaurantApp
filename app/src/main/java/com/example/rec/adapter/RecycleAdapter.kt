package com.stepbystep_tc.rvkotlin



import android.content.Context
import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.rec.R
import com.example.rec.model.Meal
import java.util.*


class RecycleAdapter    (var context: Context, var items: ArrayList<Meal>) :
    RecyclerView.Adapter<RecycleAdapter.viewitem>() {




    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewitem {

        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_meal, parent, false)

//        itemView.setOnClickListener {
//            Toast.makeText(
//                parent.context,
//                "ROW Clicked",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//
//
//        itemView.findViewById<View>(R.id.btnBuy)
//            .setOnClickListener {
//                Toast.makeText(parent.context, "Sa7a wa Hana", Toast.LENGTH_SHORT).show()
//                val i = Intent(context, A2::class.java)
//                context.startActivity(i)
//            }
        return viewitem(itemView)
    }

    inner class viewitem(itemView: View) : ViewHolder(itemView) {
        //Declare
        var name: TextView
        var price: TextView
        var image: ImageView
        var btn: Button

        //initialize
        init {
            name = itemView.findViewById(R.id.name)
            price = itemView.findViewById(R.id.price)
            image = itemView.findViewById(R.id.img)
            btn = itemView.findViewById(R.id.btnBuy)
        }
    }



    //to fill each item with data from the array depending on position
    override fun onBindViewHolder(
        holder: viewitem,
        position: Int
    ) {
        holder.name.text = items[position].mealName
        holder.price.text = items[position].mealPrice
        holder.image.setImageResource(items[position].mealImage)
        holder.btn.setOnClickListener {
            Toast.makeText(
                context,
                items[position].mealName,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
