package com.giuliana.evaluacioncontinuacuatro.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.giuliana.evaluacioncontinuacuatro.R
import com.giuliana.evaluacioncontinuacuatro.databinding.ActivityAddBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class AddActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAddBinding
    private lateinit var firestore: FirebaseFirestore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firestore = Firebase.firestore
        binding.btnAdd.setOnClickListener {
            val name:String=binding.txtName.text.toString()
            val status:String=binding.txtStatus.text.toString()
            val species:String=binding.txtSpecies.text.toString()
            val gender:String=binding.txtGender.text.toString()
            if(name.isNotEmpty() && status.isNotEmpty()&&species.isNotEmpty()&&gender.isNotEmpty()){
                val rickimorti= hashMapOf(
                    "gender" to gender,
                    "name" to name,
                    "species" to species,
                    "status" to status
                )
                firestore.collection("rickimorti")
                    .add(rickimorti)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Agregado correctamente con id: ${it.id}",Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "No se agrego el elemento", Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }
}