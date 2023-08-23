package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.databinding.FragmentRickiMortiDetailBinding
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti


class RickiMortiDetailFragment : Fragment() {
    private lateinit var binding: FragmentRickiMortiDetailBinding
    val args: RickiMortiDetailFragmentArgs by navArgs()
    private lateinit var results: Rickimorti
    private lateinit var viewModel:RickimortiDetailViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        results=args.results
        viewModel= ViewModelProvider(requireActivity()).get(RickimortiDetailViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentRickiMortiDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(binding.root.context)
            .load(results.image)
            .placeholder(R.drawable.ic_list)
            .error(R.drawable.ic_list)
            .into(binding.imageView)
        binding.name.text = results.name
        binding.status.text = results.status
        binding.species.text=results.species
        binding.gender.text=results.gender
        binding.btnAddFavorite.setOnClickListener {
            viewModel.addFavorite(results)
        }

    }

}