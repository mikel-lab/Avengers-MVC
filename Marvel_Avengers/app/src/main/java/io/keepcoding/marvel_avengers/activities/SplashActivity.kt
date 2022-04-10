package io.keepcoding.marvel_avengers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import io.keepcoding.marvel_avengers.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        loadData()
    }

    private fun loadData() {
        //Simulamos una llamada generando un pequeño retraso de tiempo para hacer como que carga el salto de activity
        Handler().postDelayed(
            {
                val intent = Intent(
                    this,
                    MainActivity::class.java
                )
                startActivity(intent)
            },
            3000
        )
    }
}