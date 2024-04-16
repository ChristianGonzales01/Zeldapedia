package com.example.recyclerviewexamplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.recyclerviewexamplo.adapter.ZeldaAdapter
import com.example.recyclerviewexamplo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var personajesMutableList: MutableList<Personajes> =
        ProveedorZelda.ZeldaLists.toMutableList()
    private lateinit var adapter: ZeldaAdapter
    private val llmanager = LinearLayoutManager(this)

    private lateinit var navegation: BottomNavigationView

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.itemFragment1 -> {

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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el RecyclerView
        initRecycleView()

        // Configurar el menú de navegación
        navegation = findViewById(R.id.navMenu)
        navegation.setOnNavigationItemSelectedListener(mOnNavMenu)
    }

    private fun initRecycleView() {
        adapter = ZeldaAdapter(
            superheroList = personajesMutableList,
            onClickListener = { zeldalista -> OnItemSelected(zeldalista) },
            onClickDelete = { position -> onDeleteItem(position) }
        )
        binding.recyclerZelda.layoutManager = llmanager
        binding.recyclerZelda.adapter = adapter
    }

    private fun onDeleteItem(position: Int) {
        personajesMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)
    }

    private fun OnItemSelected(personajes: Personajes) {
        Toast.makeText(this, personajes.superhero, Toast.LENGTH_SHORT).show()
    }

    private fun showInputDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Ingrese texto")

        val input = EditText(this)
        builder.setView(input)

        builder.setPositiveButton("Aceptar") { _, _ ->
            val texto = input.text.toString()
            if (texto.isNotEmpty()) {

                val nuevoPersonaje = Personajes(
                    superhero = texto,
                    photo = "",
                    publisher = "",
                    realName = ""
                )
                personajesMutableList.add(nuevoPersonaje)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this, "No se ingresó texto", Toast.LENGTH_SHORT).show()
            }
        }

        builder.setNegativeButton("Cancelar") { dialog, _ -> dialog.cancel() }

        builder.show()
    }

    override fun onResume() {
        super.onResume()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            showInputDialog()
        }
    }
}





