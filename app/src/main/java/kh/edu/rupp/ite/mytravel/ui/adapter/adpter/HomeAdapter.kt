package kh.edu.rupp.ite.mytravel.ui.adapter.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kh.edu.rupp.ite.mytravel.R

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_home
                , parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        // Bind data to the views within the item
        // Example: holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        // Return the number of items in your data source
        return 0
    }

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Define views within the item and bind data here
    }
}
