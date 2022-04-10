package io.keepcoding.marvel_avengers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.keepcoding.marvel_avengers.Adapters.VillainsAdapter
import io.keepcoding.marvel_avengers.Models.Heroes
import io.keepcoding.marvel_avengers.Models.Villains
import io.keepcoding.marvel_avengers.R
import io.keepcoding.marvel_avengers.Repositories.VillainRepository
import io.keepcoding.marvel_avengers.fragments.MainGridFragment
import io.keepcoding.marvel_avengers.fragments.MainListFragment

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    private var villains: Villains? = null

    /******* Ciclo de vida ********/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureViews()
        configureViewListeners()
        openListFragment()
    }

    /******* Configuración de vista ********/
    private fun configureViews() {

        bottomNavigationView = findViewById(R.id.mainBottomNavigation)

        }

    private fun configureViewListeners() {
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menuGrid -> {
                    openGridFragment()
                    true
                }

                R.id.menuList -> {
                    openListFragment()
                    true
                }

                else -> false
            }
        }
    }

    private fun openListFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,
                MainListFragment.newInstance()).commit()
    }

    private fun openGridFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,
                MainGridFragment.newInstance()).commit()
    }


    }
