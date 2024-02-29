package com.dungnd.ui

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var container: ViewGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = findViewById(R.id.container1)
        btn = findViewById(R.id.button)
        btn?.setOnClickListener{
            Intent(this, DetailActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}