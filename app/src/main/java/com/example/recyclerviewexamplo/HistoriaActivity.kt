package com.example.recyclerviewexamplo

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewexamplo.databinding.ActivityHistoriaBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import android.content.DialogInterface




class HistoriaActivity : AppCompatActivity() {

    private lateinit var navegation: BottomNavigationView
    private var mediaPlayer: MediaPlayer? = null
    private lateinit var binding: ActivityHistoriaBinding // cambio bindind

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.itemFragment1 -> {
                startActivity(Intent(this, MainActivity::class.java))
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemFragment2 -> {
                startActivity(Intent(this, HistoriaActivity::class.java))
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemFragment3 -> {

                startActivity(Intent(this, MusicaActivity::class.java))


                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoriaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navegation = findViewById(R.id.navMenu)
        navegation.setOnNavigationItemSelectedListener(mOnNavMenu)


        val infoButton: Button = findViewById(R.id.infoButton)
        val textView: TextView =
            findViewById(R.id.textView)

        infoButton.setOnClickListener {
            // Crear un AlertDialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Zelda Majoras Mask")
            builder.setMessage("\"The Legend of Zelda: Majora's Mask\" es un videojuego de aventuras desarrollado y publicado por Nintendo para la consola Nintendo 64. Fue lanzado originalmente en el año 2000 y es el sexto juego de la serie \"The Legend of Zelda\". En este juego, el jugador asume el papel de Link, el protagonista de la serie, quien es transportado al misterioso mundo de Termina. La premisa principal del juego es evitar que la luna se estrelle contra el mundo en tres días, utilizando una mecánica de viaje en el tiempo que permite al jugador volver al principio de los tres días y conservar ciertos elementos.")


            builder.setPositiveButton("Aceptar") { dialog, which ->

            }

            // Mostrar el AlertDialog
            val dialog = builder.create()
            dialog.show()


        }


        val infoButton2: Button = findViewById(R.id.SkyWardButton)
        infoButton2.setOnClickListener {
            // Crear un AlertDialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Zelda Sky Ward Sword")
            builder.setMessage("\n" +
                    "\"The Legend of Zelda: Skyward Sword\" es un juego de acción y aventuras desarrollado por Nintendo para la consola Wii. Fue lanzado en 2011 como el decimosexto título principal de la serie \"The Legend of Zelda\" y sirve como precuela de los juegos anteriores de la serie. La historia sigue a Link, el protagonista principal, mientras emprende un viaje en el cielo y en la superficie de un mundo llamado Hyrule en busca de su amiga de la infancia Zelda.")


            builder.setPositiveButton("Aceptar") { dialog, which ->

            }

            // Mostrar el AlertDialog
            val dialog = builder.create()
            dialog.show()
        }

        val infoButton3: Button = findViewById(R.id.song3Buttonmus)
        infoButton3.setOnClickListener {
            // Crear un AlertDialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Zelda Twilight proncess")
            builder.setMessage("\n" +
                    "\"The Legend of Zelda: Twilight Princess\" es un juego de acción y aventuras desarrollado y publicado por Nintendo para varias plataformas, incluyendo la Nintendo GameCube y la Wii. Fue lanzado en 2006 como el decimotercer juego principal de la serie \"The Legend of Zelda\". La trama sigue a Link, el protagonista principal, mientras se embarca en una misión para salvar el reino de Hyrule de la oscuridad y rescatar a la Princesa Zelda.")


            builder.setPositiveButton("Aceptar") { dialog, which ->

            }

            // Mostrar el AlertDialog
            val dialog = builder.create()
            dialog.show()
        }


        val infoButton4: Button = findViewById(R.id.song4Button)
        infoButton4.setOnClickListener {
            // Crear un AlertDialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Zelda Wind Waker")
            builder.setMessage("\"The Legend of Zelda: The Wind Waker\" es un juego de acción y aventuras desarrollado y publicado por Nintendo para la consola Nintendo GameCube. Fue lanzado en 2002 como el décimo juego principal de la serie \"The Legend of Zelda\". El juego presenta un estilo visual único y colorido, que se aparta del realismo de los juegos anteriores de la serie, en favor de gráficos cel-shaded que le dan un aspecto de dibujo animado.")

            // Agregar un botón de "Aceptar" al AlertDialog
            builder.setPositiveButton("Aceptar") { dialog, which ->

            }

            // Mostrar el AlertDialog
            val dialog = builder.create()
            dialog.show()


            val infoButton5: Button = findViewById(R.id.song5Button)
            infoButton5.setOnClickListener {
                // Crear un AlertDialog
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Zelda Ocarina of Time")
                builder.setMessage("\"The Legend of Zelda: Ocarina of Time\" es un juego de acción y aventuras desarrollado y publicado por Nintendo para la consola Nintendo 64. Fue lanzado en 1998 y es el quinto juego principal de la serie \"The Legend of Zelda\". \"Ocarina of Time\" es ampliamente considerado como uno de los mejores videojuegos de todos los tiempos y un punto de inflexión en la industria del videojuego, especialmente en el género de las aventuras.")

                // Agregar un botón de "Aceptar" al AlertDialog
                builder.setPositiveButton("Aceptar") { dialog, which ->

                }

                // Mostrar el AlertDialog
                val dialog = builder.create()
                dialog.show()
            }
        }



    }}

