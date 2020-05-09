package com.piusanggoro.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val exampleList = listOf(
        ExampleItem(R.drawable.ic_boat, "Kapal", "laut"),
        ExampleItem(R.drawable.ic_train, "Kereta", "darat"),
        ExampleItem(R.drawable.ic_car, "Mobil", "darat"),
        ExampleItem(R.drawable.ic_bus, "Bus", "darat"),
        ExampleItem(R.drawable.ic_plane, "Pesawat", "udara"),
        ExampleItem(R.drawable.ic_walk, "Jalan", "darat"),
        ExampleItem(R.drawable.ic_cart, "Keranjang", "darat")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
}
