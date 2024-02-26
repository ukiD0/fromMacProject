package com.example.myapplication.view

import android.content.Context
import android.graphics.Shader.TileMode
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentThirdBinding
import org.osmdroid.config.Configuration
import org.osmdroid.library.BuildConfig
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
import org.osmdroid.tileprovider.tilesource.TileSourceFactory


class ThirdFragment : Fragment() {

    private lateinit var  binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater,container,false)

        binding.goRegist.setOnClickListener {
            onBoardingFinished()
            Navigation.findNavController(binding.root).navigate(R.id.action_viewPagerFragment_to_registrationFragment)
        }

        binding.mapID.setTileSource(TileSourceFactory.MAPNIK)
        binding.mapID.controller.setZoom(5.0)
        Configuration.getInstance().userAgentValue = BuildConfig.LIBRARY_PACKAGE_NAME

        return binding.root

    }

    private fun onBoardingFinished(){
        val sharedPreferences = requireActivity().getSharedPreferences("OnBoarding", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }

}