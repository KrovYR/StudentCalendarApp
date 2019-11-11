package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(applicationContext,"Hello, Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this,SecondActivity::class.java)
        val countSting = textView.text.toString()
        val count = Integer.parseInt(countSting)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

    fun openCalendar(view: View) {
        val openIntent = Intent(this,ThirdActivity::class.java)
        startActivity(openIntent)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }


}
