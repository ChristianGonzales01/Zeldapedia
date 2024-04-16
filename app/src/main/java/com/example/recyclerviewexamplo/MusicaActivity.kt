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
import android.widget.ImageView


class MusicaActivity : AppCompatActivity() {

    private lateinit var navegation: BottomNavigationView
    private var mediaPlayer: MediaPlayer? = null
    private lateinit var binding: ActivityHistoriaBinding // Cambio de nombre del binding


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

                // Lanzar la actividad HistoriaActivity
                startActivity(Intent(this, MusicaActivity::class.java))
                // Devolver verdadero para indicar que se ha manejado la selección del elemento

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoriaBinding.inflate(layoutInflater) // Cambio de nombre del binding

        setContentView(R.layout.activity_musica)



        navegation = findViewById(R.id.navMenu)
        navegation.setOnNavigationItemSelectedListener(mOnNavMenu)


        val infoButton: Button = findViewById(R.id.infoButton)
        val textView: TextView =
            findViewById(R.id.textView)

        infoButton.setOnClickListener {
            // Crear un AlertDialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Zelda Majoras Mask")
            builder.setMessage("\"The Legend of Zelda: Majora's Mask\" Creador: Koji Kondo\"")


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
                    "\"The Legend of Zelda: Skyward Sword\" Creador: Koji Kondo")

            // Agregar un botón de "Aceptar" al AlertDialog
            builder.setPositiveButton("Aceptar") { dialog, which ->
                // Aquí puedes agregar código para manejar el clic en el botón "Aceptar", si es necesario
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
                    "\"The Legend of Zelda: Twilight Princess\" Creador: Koji Kondo")

            // Agregar un botón de "Aceptar" al AlertDialog
            builder.setPositiveButton("Aceptar") { dialog, which ->
                // Aquí puedes agregar código para manejar el clic en el botón "Aceptar", si es necesario
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
            builder.setMessage("\"The Legend of Zelda: The Wind Waker\" Creador: Koji Kondo")

            // Agregar un botón de "Aceptar" al AlertDialog
            builder.setPositiveButton("Aceptar") { dialog, which ->
                // Aquí puedes agregar código para manejar el clic en el botón "Aceptar", si es necesario
            }

            // Mostrar el AlertDialog
            val dialog = builder.create()
            dialog.show()


            val infoButton5: Button = findViewById(R.id.song5Button)
            infoButton5.setOnClickListener {
                // Crear un AlertDialog
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Zelda Ocarina of Time")
                builder.setMessage("\"The Legend of Zelda: Ocarina of Time\" Creador: Koji Kondo")

                // Agregar un botón de "Aceptar" al AlertDialog
                builder.setPositiveButton("Aceptar") { dialog, which ->
                    // Aquí puedes agregar código para manejar el clic en el botón "Aceptar", si es necesario
                }

                // Mostrar el AlertDialog
                val dialog = builder.create()
                dialog.show()


            }



















        }


        // Asignar OnClickListener a las imágenes
        val song1Image: ImageView = findViewById(R.id.Majoras)
        val song2Image: ImageView = findViewById(R.id.SkyWard)
        val song3Image: ImageView = findViewById(R.id.Twilight)
        val song4Image: ImageView = findViewById(R.id.Wind)
        val song5Image: ImageView = findViewById(R.id.ocarina)


        song1Image.setOnClickListener { playSong(R.raw.majorasmusic)}
        song2Image.setOnClickListener { playSong(R.raw.skywardmusic)}
            song3Image.setOnClickListener { playSong(R.raw.twilightmusic)}
                song4Image.setOnClickListener { playSong(R.raw.windmusic)}
                    song5Image.setOnClickListener { playSong(R.raw.ocarinamusic)}
        }



    private fun playSong(songResId: Int) {
        // Detener la reproducción anterior si hay una
        mediaPlayer?.release()

        // Crear MediaPlayer y reproducir la canción
        mediaPlayer = MediaPlayer.create(this, songResId)
        mediaPlayer?.start()

        // Escuchar el evento de finalización para liberar recursos
        mediaPlayer?.setOnCompletionListener {
            mediaPlayer?.release()
            mediaPlayer = null
        }
    }

    // Agregar esta función para detener la canción
    private fun stopSong() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null

        // Tu código para asignar OnClickListener a los botones y cualquier otra lógica aquí...
    }}

