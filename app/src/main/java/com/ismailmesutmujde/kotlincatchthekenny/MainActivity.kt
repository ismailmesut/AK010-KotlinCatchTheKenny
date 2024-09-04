package com.ismailmesutmujde.kotlincatchthekenny

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlincatchthekenny.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMainActivity: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMainActivity.root
        setContentView(view)

    }
}