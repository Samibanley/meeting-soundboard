package com.example.worksoundboard

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val standUpMP: MediaPlayer = MediaPlayer.create(this, R.raw.ludacris_standup)
        val retroOneMP: MediaPlayer = MediaPlayer.create(this, R.raw.get_knocked_down)
        val retroTwoMP: MediaPlayer = MediaPlayer.create(this, R.raw.something_to_talk_about)
        val turnAroundMP: MediaPlayer = MediaPlayer.create(this, R.raw.turn_around)
        val sitDownMP: MediaPlayer = MediaPlayer.create(this, R.raw.roll_out)
        val closingTimeMP: MediaPlayer = MediaPlayer.create(this, R.raw.closing_time)
        val takeMeAwayMP: MediaPlayer = MediaPlayer.create(this, R.raw.take_me_away)
        val failureMP: MediaPlayer = MediaPlayer.create(this, R.raw.failure)

        standUpStart.setOnClickListener { handleClick(standUpMP) }

        retroOne.setOnClickListener { handleClick(retroOneMP) }

        retroTwo.setOnClickListener { handleClick(retroTwoMP) }

        turnAround.setOnClickListener { handleClick(turnAroundMP) }

        standUpEnd.setOnClickListener { handleClick(sitDownMP) }

        closingTime.setOnClickListener { handleClick(closingTimeMP) }

        takeMeAway.setOnClickListener { handleClick(takeMeAwayMP) }

        failure.setOnClickListener { handleClick(failureMP) }
    }

    private fun handleClick(mp: MediaPlayer) {
        if (mp.isPlaying) {
            mp.pause()
            mp.seekTo(0)
        } else {
            mp.start()
        }
    }

}
