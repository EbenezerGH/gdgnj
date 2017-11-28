package jfyg.gdgnj

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RVAdapter(val names: List<NamesModel>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(names[position])
    }

    override fun getItemCount(): Int {
        return names.size
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView: TextView = v.findViewById(R.id.tv_name)

        fun bindItems(user: NamesModel) {
            textView.text = user.name
        }
    }

}


