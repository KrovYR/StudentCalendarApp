package com.example.studentcalendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCalendar(view: View) {
        val openIntent = Intent(this,CalendarActivity::class.java)
        startActivity(openIntent)
    }

    fun addReminder(view: View) {
        val openIntent = Intent(this,AddReminderActivity::class.java)
        startActivity(openIntent)
    }
}
