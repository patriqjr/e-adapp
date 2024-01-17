package com.patriqjr.e_adapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.patriqjr.e_adapp.databinding.FragmentAboutFarmerBinding


internal class AboutFarmerFragment : Fragment() {

    private lateinit var binding: FragmentAboutFarmerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAboutFarmerBinding.inflate(inflater, container, false)
        buttons()
        return binding.root
    }

    private fun buttons() {
        binding.apply {
            delBtn.setOnClickListener {
                Toast.makeText(requireContext(), "Delete button pressed", Toast.LENGTH_LONG).show()
            }
            editBtn.setOnClickListener {
                Toast.makeText(requireContext(), "Edit button pressed", Toast.LENGTH_LONG).show()
            }
        }
    }
}