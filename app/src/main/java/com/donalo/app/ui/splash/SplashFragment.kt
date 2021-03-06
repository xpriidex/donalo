package com.donalo.app.ui.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.donalo.app.R
import com.donalo.app.databinding.LoginFragmentBinding
import com.donalo.app.databinding.SplashFragmentBinding
import com.donalo.app.presentation.splash.SplashViewModel

class SplashFragment : Fragment() {

    private var viewBinding: SplashFragmentBinding? = null

    private val viewModel by viewModels<SplashViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = SplashFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        Handler().postDelayed(
            {
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
            },
            2500
        )
    }
}