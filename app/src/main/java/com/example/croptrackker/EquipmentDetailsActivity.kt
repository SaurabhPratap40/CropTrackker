package com.example.croptrackker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EquipmentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equipment_details)

        // Receive data from intent
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val imageResId = intent.getIntExtra("image", 0)

        // Set data in views
        val nameView = findViewById<TextView>(R.id.equipmentName)
        val descriptionView = findViewById<TextView>(R.id.equipmentDescription)
        val imageView = findViewById<ImageView>(R.id.equipmentImage)

        nameView.text = name
        descriptionView.text = description
        imageView.setImageResource(imageResId)

        // ✅ Booking button click
        val bookButton = findViewById<Button>(R.id.btnBookEquipment)
        bookButton.setOnClickListener {
            val intent = Intent(this, BookingFormActivity::class.java).apply {
                putExtra("name", name)
                putExtra("imageResId", imageResId)
            }
            startActivity(intent)
        }
    }
}
