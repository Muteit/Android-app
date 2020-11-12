package com.example.water

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_water_animation.*


class WaterAnimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_animation)
      val  mediaPlayer = MediaPlayer.create(this, R.raw.watertap)

        spray_img.visibility = View.GONE
        stream_img.visibility = View.GONE
        turn_off_img.visibility = View.GONE


        turn_on_img.setOnClickListener {
            mediaPlayer.isLooping = true
            mediaPlayer.start()
            turn_on_img.visibility = View.GONE
            drop_img.visibility = View.GONE

            spray_img.visibility = View.VISIBLE
            stream_img.visibility = View.VISIBLE
            turn_off_img.visibility = View.VISIBLE
        }
        turn_off_img.setOnClickListener {
            mediaPlayer.pause()
            spray_img.visibility = View.GONE
            stream_img.visibility = View.GONE
            turn_off_img.visibility = View.GONE


            turn_on_img.visibility = View.VISIBLE
            drop_img.visibility = View.VISIBLE
        }
    }
}