package com.example.croptrackker

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BookingFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_form)

        val equipmentName = intent.getStringExtra("name")
        val equipmentImage = intent.getIntExtra("imageResId", 0)

        findViewById<TextView>(R.id.tvSelectedEquipment).text = equipmentName
        findViewById<ImageView>(R.id.imgSelectedEquipment).setImageResource(equipmentImage)

        val btnSubmit = findViewById<Button>(R.id.btnSubmitBooking)
        btnSubmit.setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val date = findViewById<EditText>(R.id.etDate).text.toString()

            if (name.isBlank() || date.isBlank()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Booking Submitted!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}
