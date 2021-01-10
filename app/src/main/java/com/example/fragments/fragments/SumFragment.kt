package com.example.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.fragments.R

class SumFragment : Fragment() {
    private lateinit var num1 : EditText
    private lateinit var num2 : EditText
    private lateinit var CalculateSum : Button
    private lateinit var sumDisplay : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sum, container, false)
        binding(view)
        listener()
        return view
    }


    private fun binding(view: View) {
        num1 = view.findViewById(R.id.num1)
        num2 = view.findViewById(R.id.num2)
        CalculateSum = view.findViewById(R.id.sumCalculate)
        sumDisplay = view.findViewById(R.id.sumDisplay)
    }
    private fun listener() {
        CalculateSum.setOnClickListener {
            sum()
        }
    }
    private fun sum(){
        val first = num1.text.toString().toInt()
        val second = num2.text.toString().toInt()

        val result = first + second
        sumDisplay.text = result.toString()
        sumDisplay.visibility = View.VISIBLE
    }

}