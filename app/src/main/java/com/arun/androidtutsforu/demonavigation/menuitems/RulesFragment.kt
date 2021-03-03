package com.arun.androidtutsforu.demonavigation.menuitems

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.arun.androidtutsforu.demonavigation.R
import com.arun.androidtutsforu.demonavigation.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentRulesBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_rules, container, false)
        return binding.root
    }


}