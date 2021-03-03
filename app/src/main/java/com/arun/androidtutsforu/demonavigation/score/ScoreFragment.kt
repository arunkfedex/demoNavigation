package com.arun.androidtutsforu.demonavigation.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.arun.androidtutsforu.demonavigation.R
import com.arun.androidtutsforu.demonavigation.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  binding : FragmentScoreBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_score, container, false)
        binding.btover.setOnClickListener{view ->
            Navigation.findNavController(view).navigate(ScoreFragmentDirections.actionScoreFragmentToGameOverFragment())
        }

        binding.btwon.setOnClickListener {view->
            val score  = binding.etScore.text.toString().toInt()
            Navigation.findNavController(view).navigate(ScoreFragmentDirections.actionScoreFragmentToGameWonFragment(score))
        }
        return binding.root
    }


}