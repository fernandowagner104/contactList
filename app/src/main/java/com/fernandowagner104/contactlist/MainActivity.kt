package com.fernandowagner104.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val recViewList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.recView_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }

    private fun bindViews() {
        recViewList.adapter = adapter
        recViewList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList() {
        adapter.updateList(
            arrayListOf(
                Contact(
                    name = "Fernando Wagner",
                    phone = "(00)00000-0000",
                    photograph = "img.png"),
                Contact(
                    name = "Ana",
                    phone = "00",
                    photograph = "img.png")
            )
        )
    }
}