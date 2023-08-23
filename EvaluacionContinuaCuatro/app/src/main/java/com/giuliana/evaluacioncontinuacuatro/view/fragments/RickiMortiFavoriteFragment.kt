package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.giuliana.evaluacioncontinuacuatro.databinding.FragmentRickiMortiFavoriteBinding
import kotlinx.coroutines.launch


class RickiMortiFavoriteFragment : Fragment() {
    private lateinit var binding: FragmentRickiMortiFavoriteBinding
    private lateinit var viewModel: RickiMortiFavoriteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel= ViewModelProvider(requireActivity()).get(RickiMortiFavoriteViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentRickiMortiFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter= RVRickiMortiListAdapter(listOf()){results->
            val detailRmDestination=RickiMortiListFragmentDirections.actionRickiMortiListFragmentToRickiMortiDetailFragment(
                results
            )
            findNavController().navigate(detailRmDestination)
        }
        binding.rvRickimortiFavorite.adapter=adapter
        binding.rvRickimortiFavorite.layoutManager=
            GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)
        viewModel.favorites.observe(viewLifecycleOwner) {
            adapter.results = it
            adapter.notifyDataSetChanged()
        }

        adapter.onClick = { results ->
            viewModel.addFavorite(results)
            viewModel.removeFavorite(results) // Agregar a favoritos cuando se hace clic en un elemento
        }

    }
}