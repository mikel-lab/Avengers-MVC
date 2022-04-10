package io.keepcoding.marvel_avengers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_DETAIL_EXTRAS = "KEY_DETAIL_EXTRAS"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        configureViews()

        intent.extras?.getParcelable<Heroe>(KEY_DETAIL_EXTRAS)?.let {
            updateViews(it)
        }
    }

    private fun configureViews() {
       // heroImageView = findViewById(R.id.ivHero)
    }

    private fun updateViews(heroe: Heroe) {
       /* val imageDrawableId = resources.getIdentifier(heroe.image,
            "drawable",
            packageName)
        heroImageView.setImageDrawable(
            AppCompatResources.getDrawable(this,
                imageDrawableId))

        */
    }
}