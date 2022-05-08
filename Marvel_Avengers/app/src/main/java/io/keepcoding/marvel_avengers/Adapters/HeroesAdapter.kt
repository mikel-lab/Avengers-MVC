package io.keepcoding.marvel_avengers.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Heroes
import io.keepcoding.marvel_avengers.R

public interface ItemClickListener {
    fun onItemClickListener(item: Heroe)
}
class HeroesAdapter(private var items: Heroes, private val listener: ItemClickListener? = null ):

    RecyclerView.Adapter<HeroesAdapter.HeroViewHolder>(){

    class HeroViewHolder(private val view: View, private val listener: ItemClickListener? = null): RecyclerView.ViewHolder(view){
    //Aquí van las variables que serán los elementos visuales de la celda

        private var heroNameTextView = view.findViewById<TextView>(R.id.tvHeroName)
        private val heroImageView = view.findViewById<ImageView>(R.id.ivHero)


        fun updateViews(item: Heroe){

            view.setOnClickListener {
                listener?.onItemClickListener(item)
            }

           with(view.context){

                val imageDrawableId = resources.getIdentifier(item.image, "drawable", packageName)
                heroImageView.setImageDrawable(AppCompatResources.getDrawable(this, imageDrawableId))
            }
            heroNameTextView.text = item.name
        }
    }

    override fun getItemCount(): Int {
        //Devolvemos la cantidad de elementos que conforman la lista
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        //Asignamos vista (layout) de la celda (viewholder)

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_hero, parent, false)
        return HeroViewHolder(itemView, listener) //Instanciamos el viewholder el Heroe con el parámetro de la itemView que hemos hecho.
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        //asignamos valores a la celda

        holder.updateViews(items[position])
    }


}