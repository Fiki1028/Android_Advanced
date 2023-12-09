package com.example.recycleview.Adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Model.ModelsHape
import com.example.recycleview.R

class HapeAdapter (
    private val context: Context,
    private val modelsHapeList: List<ModelsHape>,
    private val titles: Array<String>,
    private val harga: Array<String>,
    private val modelsHapeListener: (ModelsHape) -> Unit

): RecyclerView.Adapter<HapeAdapter.HapeViewHolder>() {

    inner class HapeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgHape: ImageView = view.findViewById(R.id.img_artikel)
        val judulHape: TextView = view.findViewById(R.id.tv_hape)
        val hargaHape: TextView = view.findViewById(R.id.tv_Harga)

        fun bindView(modelsHape: ModelsHape, listener: (ModelsHape) -> Unit) {
            imgHape.setImageResource(modelsHape.imgHape)
            judulHape.text = titles[modelsHape.titleIndex]
            hargaHape.text = harga[modelsHape.descriptionIndex]

            // Set OnClickListener untuk item
            itemView.setOnClickListener {
                listener(modelsHape)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HapeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return HapeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HapeViewHolder, position: Int) {
        holder.bindView(modelsHapeList[position], modelsHapeListener)
    }

    override fun getItemCount(): Int = modelsHapeList.size

}