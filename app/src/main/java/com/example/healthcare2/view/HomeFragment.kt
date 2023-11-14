package com.example.healthcare2.view

import android.os.Bundle
import android.os.Handler

import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.healthcare2.R
import com.example.healthcare2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var binding : FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding?.root
    }
}