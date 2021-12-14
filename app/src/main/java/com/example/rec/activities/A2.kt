package com.example.rec.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import com.example.rec.R
import com.example.rec.fragments.Frag1

class A2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a2)
    }

    fun goNew(view: View)
    {
        var fr:FragmentTransaction=supportFragmentManager.beginTransaction()

        fr.replace(R.id.cont,Frag1())

        fr.commit()
    }


}