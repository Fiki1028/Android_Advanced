package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)
        val myButton = findViewById<Button>(R.id.tombol)
        val myImageView = findViewById<ImageView>(R.id.myImageView)

        val fadeIn: Animation = AnimationUtils.loadAnimation(applicationContext, androidx.constraintlayout.widget.R.anim.abc_fade_in)

        myTextView.startAnimation(fadeIn)

        myButton.setOnClickListener {
            myImageView.startAnimation(fadeIn)
        }

        fadeIn.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {
            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })
    }
}