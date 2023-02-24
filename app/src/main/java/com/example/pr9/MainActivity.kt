package com.example.pr9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val imageView : ImageView = findViewById(R.id.THESUN)
        val sunAnim : Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        imageView.startAnimation(sunAnim)
        val imageView1 : ImageView = findViewById(R.id.clock)
        val clockgoing : Animation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        imageView1.startAnimation(clockgoing) */

        val man : ImageView = findViewById(R.id.man)
        val manAnim : Animation = AnimationUtils.loadAnimation(this, R.anim.rounding)
        man.startAnimation(manAnim)

        val billy : ImageView = findViewById(R.id.billy)
        val billAnim : Animation = AnimationUtils.loadAnimation(this, R.anim.billy)
        billy.startAnimation(billAnim)


        val ricardo : ImageView = findViewById(R.id.ricardo)
        val ricardoAnim : Animation = AnimationUtils.loadAnimation(this, R.anim.ricardo)
        ricardo.startAnimation(ricardoAnim)

        val billyText : TextView = findViewById(R.id.billyText)
        val ricardoText : TextView = findViewById(R.id.ricardoText)
        val TextAnim :Animation = AnimationUtils.loadAnimation(this, R.anim.textanim)
        billyText.startAnimation(TextAnim)
        ricardoText.startAnimation(TextAnim)
    }


}