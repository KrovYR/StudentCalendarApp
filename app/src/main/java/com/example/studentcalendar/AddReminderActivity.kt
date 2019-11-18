package com.example.studentcalendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddReminderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_reminder)
    }

    fun closeAddReminder(view: View) {
        val openIntent = Intent(this,MainActivity::class.java)
        startActivity(openIntent)
    }
}
