package com.example.ururu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ururu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener{
            //binding.textView.text = binding.editText.text
        }
    }
}