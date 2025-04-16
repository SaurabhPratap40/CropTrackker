package com.example.croptrackker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MyBookingsActivity : AppCompatActivity() {

    // Define the Booking data class
    data class Booking(val equipmentName: String, val bookingDate: String)

    // Function to fetch booking data (this could be from a database, API, etc.)
    private fun getBookings(): List<Booking> {
        // Replace this with actual data fetching logic
        return listOf(
            Booking("Tractor", "2025-04-16"),
            Booking("Combine Harvester", "2025-04-17"),
            Booking("Plough", "2025-04-18"),
            // You can add more data dynamically here
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_bookings)

        // Fetch the actual booking data
        val bookings = getBookings()

        // Create a list of strings to display in the ListView
        val bookingDescriptions = bookings.map { "${it.equipmentName} on ${it.bookingDate}" }

        // Find the ListView by ID
        val bookingsListView = findViewById<ListView>(R.id.lvBookings)

        // Create an adapter to display the booking data in the ListView
        val adapter = ArrayAdapter(this, R.layout.list_item_booking, R.id.itemBookingInfo, bookingDescriptions)

        // Set the adapter to the ListView
        bookingsListView.adapter = adapter
    }
}
