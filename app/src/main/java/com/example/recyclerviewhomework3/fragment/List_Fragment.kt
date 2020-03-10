package com.example.recyclerviewhomework3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework3.R
import com.example.recyclerviewhomework3.adapter.FruitsAdapter
import com.example.recyclerviewhomework3.model.Fruits
import kotlinx.android.synthetic.main.fragment_list_.view.*


/**
 * A simple [Fragment] subclass.
 */
class List_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_list_,container, false)

        var fruitsArray = ArrayList<Fruits>()
        fruitsArray.add(
            Fruits(R.drawable.strawberry,"Strawberry",
            "Prices-$20.00","2kg"))
        fruitsArray.add(Fruits(R.drawable.strawberry,"Strawberry",
            "Prices-$100.00","5kg"))
        fruitsArray.add(Fruits(
            R.drawable.strawberry,"Strawberry",
            "Prices-$80.00","10kg"))

        var fruitsAdapter = FruitsAdapter(fruitsArray)
        root.recyclerView.layoutManager = LinearLayoutManager(context)
        root.recyclerView.adapter = fruitsAdapter
        return root
    }



}
