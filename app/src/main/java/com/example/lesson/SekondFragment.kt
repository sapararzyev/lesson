package com.example.lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson.databinding.FragmentSekondBinding


class SekondFragment : Fragment() {

    private lateinit var binding:FragmentSekondBinding
    private val data = arrayListOf<name1>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSekondBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data.add(name1("azamat","ormokyev",12,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("Sapar","Arzyev",47,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("giorgiy","tevzadza",39,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("kamchybek","Tashiev",43,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("sadyr","japarov",34,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("monza","gonza",23,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("dima","gordey",49,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        data.add(name1("wladimer","puten",40,
            "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"))
        val adapter = NameAdapter(data, object : Onclik{

            override fun OnItemClick(name1:name1) {

                val fragment = MainFragment()
                val bundle = Bundle()
                bundle.putSerializable("key",name1)
                fragment.arguments = bundle
                replaceFragment2(MainFragment())
            }
        })
        binding.recyclerView.adapter = adapter
    }
}




