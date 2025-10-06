package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity () {
    private var mCount = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)

        if (savedInstanceState != null) {
            val isVisible = savedInstanceState.getBoolean("reply_visible")
            if (isVisible) {
                mCount = savedInstanceState.getInt("count_value")
                mShowCount.text = mCount.toString()
            }
        }
    }

    fun countUp (view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }

    fun showToast (view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("reply_visible", true)
        outState.putInt("count_value", mCount)
    }
}