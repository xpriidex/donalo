package com.donalo.app.ui.donationlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.donalo.app.R
import com.donalo.app.databinding.DonationListFragmentBinding
import com.donalo.app.presentation.donationlist.DonationListViewModel

class DonationListFragment : Fragment() {

    private var viewBinding: DonationListFragmentBinding? = null

    private val viewModel by viewModels<DonationListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DonationListFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding?.apply {
            fabAddDonation.setOnClickListener {
                findNavController().navigate(R.id.action_donationListFragment_to_donationCreateFragment)
            }
        }
    }
}