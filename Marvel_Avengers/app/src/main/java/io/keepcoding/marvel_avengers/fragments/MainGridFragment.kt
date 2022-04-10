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
import io.keepcoding.marvel_avengers.Adapters.VillainItemClickListener
import io.keepcoding.marvel_avengers.Adapters.VillainsAdapter
import io.keepcoding.marvel_avengers.Models.Heroe
import io.keepcoding.marvel_avengers.Models.Villain
import io.keepcoding.marvel_avengers.Models.Villains
import io.keepcoding.marvel_avengers.R
import io.keepcoding.marvel_avengers.Repositories.HeroRepository
import io.keepcoding.marvel_avengers.Repositories.VillainRepository
import io.keepcoding.marvel_avengers.activities.VillainDetailActivity
import io.keepcoding.marvel_avengers.activities.VillainDetailActivity.Companion.KEY_VILLAIN_DETAIL_EXTRAS

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainGridFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainGridFragment : Fragment() {
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

    private var villains: Villains? = null

    private lateinit var recyclerView: RecyclerView


    private val villainItemClickListener = object : VillainItemClickListener {
        override fun onItemClickListener(item: Villain) {
            startActivity(
                Intent(activity, VillainDetailActivity::class.java).apply {
                    putExtra(KEY_VILLAIN_DETAIL_EXTRAS, item)
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
        return inflater.inflate(R.layout.fragment_villain_grid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        configureViews(view)
    }

    private fun configureViews(view: View) {
        // Para listado grid

        recyclerView = view.findViewById<RecyclerView>(R.id.gridRecycleView).apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = VillainsAdapter(
                villains ?: arrayListOf(),
                villainItemClickListener)
        }
    }

    /****** Data *******/
    private fun loadData() {
        // FriendRepository es un object (Singleton) y no es necesario instanciarlo
        // porque podemos acceder a sus funciones y propiedades directamente
        villains = VillainRepository.villainsSample
    }
}