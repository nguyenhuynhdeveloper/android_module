package com.android_module

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
    }
}