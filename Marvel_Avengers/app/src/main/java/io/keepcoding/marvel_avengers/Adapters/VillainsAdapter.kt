package io.keepcoding.marvel_avengers.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.content.res.AppCompatResources
import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Villain

import io.keepcoding.marvel_avengers.Models.Villains
import io.keepcoding.marvel_avengers.R
public interface VillainItemClickListener {
    fun onItemClickListener(item: Villain)
}
class VillainsAdapter(private var items: Villains, private val listener: VillainItemClickListener? = null ):

    RecyclerView.Adapter<VillainsAdapter.VillainViewHolder>(){

    class VillainViewHolder(private val view: View, private val listener: VillainItemClickListener? = null): RecyclerView.ViewHolder(view){
        //Aquí van las variables que serán los elementos visuales de la celda

        private var villainNameTextView = view.findViewById<TextView>(R.id.tvVillainName)
        private val villainImageView = view.findViewById<ImageView>(R.id.ivVillain)


        fun updateViews(item: Villain){

            view.setOnClickListener {
                listener?.onItemClickListener(item)
            }
           with(view.context){

                val imageDrawableId = resources.getIdentifier(item.image, "drawable", packageName)
                villainImageView.setImageDrawable(AppCompatResources.getDrawable(this, imageDrawableId))
            }


            villainNameTextView.text = item.name
             }

        }

    override fun getItemCount(): Int {
        //Devolvemos la cantidad de elementos que conforman la lista

        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VillainViewHolder {
        //Asignamos vista (layout) de la celda (viewholder)

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_villain_list, parent, false)
        return VillainViewHolder(itemView, listener) //Instanciamos el viewholder el villano con el parámetro de la itemView que hemos hecho.
    }

    override fun onBindViewHolder(holder: VillainsAdapter.VillainViewHolder, position: Int) {
        //asignamos valores a la celda

        holder.updateViews(items[position])
    }


}






