package com.tdoni_10119907.a10119907latihan3.layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan3.R
import com.tdoni_10119907.a10119907latihan3.databinding.FragmentStartBinding
import com.tdoni_10119907.a10119907latihan3.module.ViewBindingFragment

// 5/7/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class StartViewBindingFragment : ViewBindingFragment<FragmentStartBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding =
        FragmentStartBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_startViewBindingFragment_to_familyCodeViewBindingFragment)
        }
    }
}