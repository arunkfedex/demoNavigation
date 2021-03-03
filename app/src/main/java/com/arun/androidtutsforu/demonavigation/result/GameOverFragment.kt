package com.arun.androidtutsforu.demonavigation.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.arun.androidtutsforu.demonavigation.R
import com.arun.androidtutsforu.demonavigation.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentGameOverBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_game_over, container, false)
        binding.btGame.setOnClickListener { view->
            Navigation.findNavController(view).navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }
        return binding.root
    }


}