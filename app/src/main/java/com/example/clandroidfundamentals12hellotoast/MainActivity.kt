package com.example.clandroidfundamentals12hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.clandroidfundamentals12hellotoast.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private var mCount = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mShowCount = findViewById<TextView>(R.id.txt_show_count)
    }

    override fun onResume() {
        super.onResume()
    }

    fun showToast(view: android.view.View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show()
    }
    fun countUp(view: android.view.View) {
        mCount += 1
        binding.txtShowCount.text = mCount.toString()
    }
}