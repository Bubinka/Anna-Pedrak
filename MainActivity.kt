package com.example.hrmeeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView




class MainActivity : AppCompatActivity() {

    //initialize varaiables

    val SPLASH_SCREEN = 5000

    private lateinit var topAnimation:Animation
    private lateinit var bottomAnimation:Animation
    private lateinit var imageView: ImageView
    private lateinit var title_txt:TextView
    private lateinit var description_txt:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hide status bar

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val actionBar = supportActionBar
        actionBar!!.hide()

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        imageView = findViewById(R.id.hr_image)
        title_txt = findViewById(R.id.title_text)
        description_txt = findViewById(R.id.description_text)

        imageView.animation = topAnimation
        title_txt.animation = bottomAnimation
        description_txt.animation = bottomAnimation

        Handler().postDelayed( {

            val intent= Intent (this,AnotherActivity::class.java)

            startActivity(intent)

            finish()

        },SPLASH_SCREEN.toLong())
    }
}//end class MainActivity