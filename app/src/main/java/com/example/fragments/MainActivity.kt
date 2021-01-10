package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragments.fragments.AreaFragment
import com.example.fragments.fragments.SumFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnSum : Button
    private lateinit var btnCircle : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()

        btnSum.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, SumFragment())
                addToBackStack(null)
                commit()
            }
        }
        btnCircle.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, AreaFragment())
                addToBackStack(null)
                commit()
            }
        }
    }

    private fun binding() {
        btnSum = findViewById(R.id.btnSum)
        btnCircle = findViewById(R.id.btnCircle)
    }

}