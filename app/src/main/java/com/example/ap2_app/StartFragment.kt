package com.example.ap2_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

class StartFragment : Fragment(R.layout.fragment_start) {

    private lateinit var etNome: EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        etNome = view.findViewById(R.id.etNome)
    }

    fun getNome(): String {
        return etNome.text.toString()
    }

}