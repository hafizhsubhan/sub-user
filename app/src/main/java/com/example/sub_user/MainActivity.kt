package com.example.sub_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewPager(viewPager)
        tabs.setupWithViewPager(viewPager)
    }

    private fun setupViewPager (viewPager: ViewPager){
        val adapter = viewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Login(), "Log In" )
        adapter.addFragment(regist(), "Sign Up")
        viewPager.adapter = adapter
    }
}
