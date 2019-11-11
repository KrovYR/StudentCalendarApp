package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        findViewById<TextView>(R.id.textView2).apply {
            text = message
        }
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        java.util.Random().nextInt()
        var randomInt = 0
        if (count > 0) {
            randomInt = java.util.Random().nextInt(count + 1)
        }
        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading, count)
    }

}
