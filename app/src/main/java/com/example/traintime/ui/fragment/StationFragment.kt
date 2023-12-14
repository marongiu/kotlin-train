package com.example.traintime.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.traintime.R
import com.example.traintime.databinding.FragmentStationBinding
import com.example.traintime.ui.viewmodel.StationViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StationFragment : Fragment(R.layout.fragment_station) {

    private val model: StationViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FragmentStationBinding.bind(view).run {
                model.getStationName("Lido")
        }
    }

}