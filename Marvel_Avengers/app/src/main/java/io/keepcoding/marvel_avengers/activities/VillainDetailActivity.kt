package io.keepcoding.marvel_avengers.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Villain
import io.keepcoding.marvel_avengers.R

class VillainDetailActivity: AppCompatActivity() {

    companion object {
        const val KEY_VILLAIN_DETAIL_EXTRAS = "KEY_VILLAIN_DETAIL_EXTRAS"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_villain_detail)

        configureViews()

        intent.extras?.getParcelable<Villain>(KEY_VILLAIN_DETAIL_EXTRAS)?.let {
            updateViews(it)
        }
    }

    private fun configureViews() {
       // villainImageView = findViewById(R.id.ivVillain)
    }

    private fun updateViews(villain: Villain) {
       /* val imageDrawableId = resources.getIdentifier(heroe.image,
            "drawable",
            packageName)
        villainImageView.setImageDrawable(
            AppCompatResources.getDrawable(this,
                imageDrawableId))
                */
    }
}