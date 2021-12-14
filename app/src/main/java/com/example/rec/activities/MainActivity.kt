package com.example.rec.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rec.R
import com.example.rec.fragments.Frag1
import com.example.rec.model.Meal
import com.stepbystep_tc.rvkotlin.RecycleAdapter
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler=findViewById(R.id.rec)
        recycler.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false))

        var recAdapter=RecycleAdapter(this,prepareMeal())
        recycler.adapter=recAdapter


    }
    fun prepareMeal():ArrayList<Meal>
    {
        var m:ArrayList<Meal> = ArrayList()

        var meal1=Meal()
        meal1.mealName="Burger"
        meal1.mealPrice="6 JOD"
        meal1.mealImage=R.drawable.burger
        m.add(meal1)

        var meal2=Meal()
        meal2.mealName="Mansaf"
        meal2.mealPrice="7 JOD"
        meal2.mealImage=R.drawable.mansaf
        m.add(meal2)

        var meal3=Meal()
        meal3.mealName="Pizza"
        meal3.mealPrice="5.5 JOD"
        meal3.mealImage=R.drawable.pizza
        m.add(meal3)
        return m

    }


}