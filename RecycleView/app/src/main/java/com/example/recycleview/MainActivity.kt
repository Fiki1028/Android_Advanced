package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Adapter.HapeAdapter
import com.example.recycleview.Model.ModelsHape

class MainActivity : AppCompatActivity() {

    private lateinit var hapeAdapter: HapeAdapter
    private lateinit var modelsHapeList: List<ModelsHape>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        modelsHapeList = generateDummyData(6)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hp)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize the HapeAdapter
        hapeAdapter = HapeAdapter(
            this,
            modelsHapeList,
            resources.getStringArray(R.array.data_name),
            resources.getStringArray(R.array.data_description)
        ) { selectedModelHape ->
            showToast("Anda memilih: ${resources.getStringArray(R.array.data_name)[selectedModelHape.titleIndex]}")
        }
        recyclerView.adapter = hapeAdapter
    }

    private fun generateDummyData(size: Int): List<ModelsHape> {
        val dummyList = mutableListOf<ModelsHape>()
        val images = intArrayOf(
            R.drawable.iphone_xr,
            R.drawable.iphone_11,
            R.drawable.iphone_12,
            R.drawable.iphone_13,
            R.drawable.iphone_14,
            R.drawable.iphone_15
        )

        for (i in 0 until size) {
            dummyList.add(
                ModelsHape(
                    imgHape = images[i % images.size],
                    titleIndex = i,
                    descriptionIndex = i
                )
            )
        }
        return dummyList
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}