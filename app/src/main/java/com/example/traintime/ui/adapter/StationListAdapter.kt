package com.example.traintime.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.traintime.data.model.StationItem
import com.example.traintime.databinding.RowStationBinding

class StationListAdapter(
    var stationList: List<StationItem>,
    private val onItemClickListener: (element: StationItem) -> Unit
) : RecyclerView.Adapter<StationListAdapter.MainListViewHolder>() {


    override fun getItemCount(): Int = stationList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListViewHolder {
        val itemBinding =
            RowStationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainListViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MainListViewHolder, position: Int) {
        holder.bind(stationList[position], onItemClickListener)
    }


    class MainListViewHolder(private val itemBinding: RowStationBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(element: StationItem, onItemClickListener: (element: StationItem) -> Unit) {
            itemBinding.run {

                stationName.text = element.name

                root.setOnClickListener {
                    onItemClickListener(element)
                }
            }
        }

    }


}