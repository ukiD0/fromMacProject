package com.example.myapplication.view

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment() {
    private lateinit var binding: FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSplashScreenBinding.inflate(inflater,container,false)

        Handler(Looper.getMainLooper()).postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_splashScreenFragment_to_registrationFragment)
            }else{
                findNavController().navigate(R.id.action_splashScreenFragment_to_viewPagerFragment)
            }
        },2500)

        return binding.root
    }

    private fun onBoardingFinished(): Boolean {
        val sharedPreferences = requireActivity().getSharedPreferences("OnBoarding",Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("Finished",false)
    }

}