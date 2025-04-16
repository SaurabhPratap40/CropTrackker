package com.example.croptrackker

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<LinearLayout>(R.id.itemTractor).setOnClickListener {
            showToast("Tractor selected")
        }

        findViewById<LinearLayout>(R.id.itemCombine).setOnClickListener {
            showToast("Combine Harvester selected")
        }

        findViewById<LinearLayout>(R.id.itemPlough).setOnClickListener {
            showToast("Plough selected")
        }

        findViewById<LinearLayout>(R.id.itemRotavator).setOnClickListener {
            showToast("Rotavator selected")
        }

        findViewById<LinearLayout>(R.id.itemSeeder).setOnClickListener {
            showToast("Seeder selected")
        }

        findViewById<LinearLayout>(R.id.itemSprayer).setOnClickListener {
            showToast("Sprayer selected")
        }

        findViewById<LinearLayout>(R.id.itemBaler).setOnClickListener {
            showToast("Baler selected")
        }

        findViewById<LinearLayout>(R.id.itemIrrigation).setOnClickListener {
            showToast("Irrigation System selected")
        }

        findViewById<LinearLayout>(R.id.itemMiniLoader).setOnClickListener {
            showToast("Mini Loader selected")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}