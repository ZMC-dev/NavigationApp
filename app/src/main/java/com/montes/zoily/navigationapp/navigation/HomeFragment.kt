package com.montes.zoily.navigationapp.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


import com.montes.zoily.navigationapp.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        buttonStart.setOnClickListener(this)

        // Inflate the layout for this fragment
        return view

    }

    override fun onClick(view: View) {
        buttonStart.findNavController().navigate(R.id.action_homeFragment_to_firstQuestionFragment)
    }

}