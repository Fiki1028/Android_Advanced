package com.example.tablayot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.tablayot.adapter.FragmentAdapter
import com.example.tablayot.fragment.GameFragment
import com.example.tablayot.fragment.HadiahFragment
import com.example.tablayot.fragment.HomeFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        val fragments = listOf(HomeFragment(), GameFragment(), HadiahFragment())
        val titles = listOf("Home", "Game", "Hadiah")

        val adapter = FragmentAdapter(supportFragmentManager, fragments, titles)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)

    }
}