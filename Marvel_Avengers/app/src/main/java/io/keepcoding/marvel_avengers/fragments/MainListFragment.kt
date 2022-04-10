package io.keepcoding.marvel_avengers.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.keepcoding.marvel_avengers.Adapters.HeroesAdapter
import io.keepcoding.marvel_avengers.Adapters.ItemClickListener
import io.keepcoding.marvel_avengers.Adapters.VillainsAdapter
import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Heroes
import io.keepcoding.marvel_avengers.R
import io.keepcoding.marvel_avengers.Repositories.HeroRepository
import io.keepcoding.marvel_avengers.activities.DetailActivity
import io.keepcoding.marvel_avengers.activities.DetailActivity.Companion.KEY_DETAIL_EXTRAS

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainListFragment : Fragment() {
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */
        @JvmStatic
        fun newInstance() =
            MainListFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    private var heroes: Heroes? = null

    private lateinit var recyclerView: RecyclerView

    //Variable privada sobre la que implementamos la interfaz del listener en un trozo especifico del código.
    //así no tenemos que aplicarlo a toda la clase.

    private val itemClickListener = object : ItemClickListener {
        override fun onItemClickListener(item: Heroe) {
            startActivity(
                Intent(activity, DetailActivity::class.java).apply {
                    putExtra(KEY_DETAIL_EXTRAS, item)
                }
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hero_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        configureViews(view)
    }

    private fun configureViews(view: View) {
        // Para listado vertical

        recyclerView = view.findViewById<RecyclerView>(R.id.listRecycleView).apply {
            layoutManager = LinearLayoutManager(activity)
            // adapter = friends?.let { FriendsAdapter(it) }
            // adapter = friends?.let { FriendsAdapter(it) } ?: FriendsAdapter(arrayListOf())
            adapter = HeroesAdapter(
                heroes ?: arrayListOf(),
                itemClickListener)
        }
    }

    /****** Data *******/
    private fun loadData() {
        // FriendRepository es un object (Singleton) y no es necesario instanciarlo
        // porque podemos acceder a sus funciones y propiedades directamente
        heroes = HeroRepository.heroesSample
    }
}