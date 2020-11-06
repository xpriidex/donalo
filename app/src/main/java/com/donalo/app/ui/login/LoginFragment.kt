package com.donalo.app.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.donalo.app.R
import com.donalo.app.databinding.LoginFragmentBinding
import com.donalo.app.presentation.login.LoginViewModel

class LoginFragment : Fragment() {

    private var viewBinding: LoginFragmentBinding? = null

    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = LoginFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding?.apply {
            btSignInGoogle.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_donationListFragment)
            }
        }
    }
}