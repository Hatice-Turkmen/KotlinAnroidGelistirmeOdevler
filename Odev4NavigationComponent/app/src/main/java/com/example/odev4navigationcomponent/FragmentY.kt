package com.example.odev4navigationcomponent

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.example.odev4navigationcomponent.databinding.FragmentYBinding

class FragmentY : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentYBinding.inflate(inflater, container, false)
        //return inflater.inflate(R.layout.fragment_y, container, false)

        //binding = FragmentYBinding.inflate(R.layout.fragment_y, container, false)

        val geriTusu = object : OnBackPressedCallback(false) {
            override fun handleOnBackPressed() {
                Log.e("Y Sayfa","Geri Donus Tusu Calisti")
                isEnabled = false
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)
        
        return binding.root
    }
}