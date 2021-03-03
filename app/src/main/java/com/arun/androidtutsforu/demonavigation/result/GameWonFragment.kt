package com.arun.androidtutsforu.demonavigation.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.arun.androidtutsforu.demonavigation.R
import com.arun.androidtutsforu.demonavigation.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentGameWonBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_game_won, container, false)
        val args = GameWonFragmentArgs.fromBundle(arguments!!)
        binding.tvFinalScore.text = args.score.toString()
        binding.btHome.setOnClickListener { view ->
              Navigation.findNavController(view).navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment())

        }
        return binding.root
    }


}