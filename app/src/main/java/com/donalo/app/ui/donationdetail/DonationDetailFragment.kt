package com.donalo.app.ui.donationdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.donalo.app.databinding.DonationDetailFragmentBinding
import com.donalo.app.presentation.donationdetail.DonationDetailViewModel

class DonationDetailFragment : Fragment() {
    private var viewBinding: DonationDetailFragmentBinding? = null

    private val viewModel by viewModels<DonationDetailViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DonationDetailFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

}