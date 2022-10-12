package com.example.buttomnavigation
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buttomnavigation.adapter.Course
import com.example.buttomnavigation.adapter.viewmodel
import com.example.buttomnavigation.databinding.FragmentHomeBinding


class home : Fragment() {

    lateinit var binding: FragmentHomeBinding
   lateinit var viewHolder:viewmodel
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

          binding=FragmentHomeBinding.inflate(layoutInflater,container,false)


        val list = arrayListOf<Course>()

        list.add(Course(R.drawable.net,"we need .net developer"))
        list.add(Course(R.drawable.android,"we need android app developer"))
        list.add(Course(R.drawable.java,"we need java developer"))
        list.add(Course(R.drawable.php,"we need php developer"))

        val recycler=binding.recyclerview.findViewById<RecyclerView>(R.id.recyclerview)

        recycler.setHasFixedSize(true)
        viewHolder = viewmodel(requireContext(),list)
        recycler.adapter = viewHolder
        recycler.layoutManager = LinearLayoutManager(context)


        return binding.root
    }
}

