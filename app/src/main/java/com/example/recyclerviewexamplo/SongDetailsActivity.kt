package com.example.recyclerviewexamplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SongDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_details)

        // Obtener datos de la canción desde el Intent
        val name = intent.getStringExtra("name")
        val artist = intent.getStringExtra("artist")
        val label = intent.getStringExtra("label")
        val year = intent.getStringExtra("year")

        // Mostrar los datos en los TextViews
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val artistTextView: TextView = findViewById(R.id.artistTextView)
        val labelTextView: TextView = findViewById(R.id.labelTextView)
        val yearTextView: TextView = findViewById(R.id.yearTextView)

        nameTextView.text = "Nombre: $name"
        artistTextView.text = "Artista: $artist"
        labelTextView.text = "Disquera: $label"
        yearTextView.text = "Año: $year"
    }
}