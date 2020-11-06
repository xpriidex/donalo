package com.donalo.app.ui.donationcreate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.donalo.app.databinding.DonationCreateFragmentBinding
import com.donalo.app.presentation.donationcreate.DonationCreateViewModel

class DonationCreateFragment : Fragment() {

    private var viewBinding: DonationCreateFragmentBinding? = null

    private lateinit var viewModel: DonationCreateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DonationCreateFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root    }

}