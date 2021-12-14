package com.example.rec.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.rec.R


open class Frag1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_frag1, container, false)

        var btn:Button=v.findViewById(R.id.btn)
        btn.setOnClickListener {

            val fragment: Fragment = Frag1()
            val fragmentManager: FragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.cont, Frag2());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }

        return v
    }

}