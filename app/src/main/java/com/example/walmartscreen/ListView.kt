package com.example.walmartscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*
import kotlinx.android.synthetic.main.activity_main.*

class ListView : AppCompatActivity() {


    var clothesList = arrayListOf("T-Shirt", "Athletic Shoes", "Boots", "Dresses")
    var beautyList  = arrayListOf("Liquid Soap", "Nail Stuff", "Lip stick", "Body Lotion")
    var foodList = arrayListOf("Vegetables and legumes/beans", "Fruit ", "Milk, yoghurt cheese")
    var electronicsList = arrayListOf("TV & Video", "Audio & Home Theater", "Computers", "Camera & Photo")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        lateinit var list: ArrayList<String>
        val intent = intent
        val type = intent.getStringExtra("type")
        if (type == "clothes") {
            list = clothesList
        } else if (type == "beauty") {
            list = beautyList
        } else if (type == "food") {
            list = foodList
        } else if (type == "electronics") {
            list = electronicsList
        } else {

        }
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list)
        listView.adapter = adapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val item = parent.getItemAtPosition(position).toString()
                Toast.makeText(this, "You have chosen ${list[position]}", Toast.LENGTH_SHORT)
                    .show()

            }

    }
}
