package com.tdoni_10119907.a10119907latihan3.layout

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan3.databinding.FragmentRegisterBinding
import com.tdoni_10119907.a10119907latihan3.module.ViewBindingFragment

// 5/7/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class RegisterViewBindingFragment : ViewBindingFragment<FragmentRegisterBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding =
        FragmentRegisterBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnNext.setOnClickListener {
            val name = binding.txtFieldName.text.toString()
            if (name.isEmpty() || binding.txtFieldAge.text.toString().isEmpty()) {
                AlertDialog.Builder(requireActivity())
                    .setTitle("Warning")
                    .setMessage("Form tidak boleh kosong")
                    .show()
            } else {
                val action =
                    RegisterViewBindingFragmentDirections.actionRegisterViewBindingFragmentToHomeViewBindingFragment(
                        name
                    )
                findNavController().navigate(action)
            }
        }
    }
}