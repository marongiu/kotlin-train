package com.example.traintime.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.traintime.R
import com.example.traintime.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FragmentHomeBinding.bind(view).run {
            departureInput.setOnClickListener {
                //move to stationfragment
                findNavController().navigate(R.id.action_homeFragment_to_stationFragment)
            }
        }
    }
}