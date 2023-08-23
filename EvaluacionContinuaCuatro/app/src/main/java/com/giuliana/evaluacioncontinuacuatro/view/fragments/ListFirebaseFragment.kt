package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.databinding.FragmentListFirebaseBinding
import com.giuliana.evaluacioncontinuacuatro.databinding.FragmentLogoutBinding
import com.giuliana.evaluacioncontinuacuatro.model.RickimortiFirebase
import com.giuliana.evaluacioncontinuacuatro.view.AddActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class ListFirebaseFragment : Fragment() {
    private lateinit var binding: FragmentListFirebaseBinding
    private lateinit var firestore: FirebaseFirestore
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentListFirebaseBinding.inflate(inflater,container,false)

        binding.addButton.setOnClickListener {
            val intent = Intent(activity, AddActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firestore = Firebase.firestore

        val dataList = mutableListOf<RickimortiFirebase>()
        val adapter = RVRickiMortiListAdapter2(dataList)
        val layoutManager = LinearLayoutManager(requireContext()) // Puedes utilizar otros tipos de layout managers también, como GridLayoutManager
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter

        firestore.collection("rickimorti")
            .get()
            .addOnSuccessListener { querySnapshot ->
                for (document in querySnapshot) {
                    val item = document.toObject(RickimortiFirebase::class.java)
                    dataList.add(item)
                }
                adapter.notifyDataSetChanged()
            }
            .addOnFailureListener { exception ->
                // Manejo de errores
            }
    }
}