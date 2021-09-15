package com.maverick.bindingadaptersexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.maverick.bindingadaptersexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        val post = Post("Introduction to kotlin","CheezyCode","https://lh3.googleusercontent.com/-p-lwdGoPXwU/X-8v30gUBII/AAAAAAAABQk/tPEKSb-42o0d10RwrQruyP98uOw7TdiGQCLcBGAsYHQ/w400-h400/kotlin-introduction-cheezycode.png")

        binding.post = post
    }
}