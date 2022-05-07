package com.tdoni_10119907.a10119907latihan3.layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.navArgs
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan3.databinding.FragmentHomeBinding
import com.tdoni_10119907.a10119907latihan3.module.ViewBindingFragment

// 5/7/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class HomeViewBindingFragment : ViewBindingFragment<FragmentHomeBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding =
        FragmentHomeBinding::inflate

    private val args: HomeViewBindingFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        "Beres Sekarang ${args.name} udah bisa ngecheck penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)".also {
            binding.txtViewGreeting.text = it
        }
        binding.btnOk.setOnClickListener {
            requireActivity().finish()
        }
    }
}