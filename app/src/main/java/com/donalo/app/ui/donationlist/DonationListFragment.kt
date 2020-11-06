package com.donalo.app.ui.donationlist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.donalo.app.presentation.donationlist.DonationListViewModel
import com.donalo.app.R
import com.donalo.app.databinding.DonationListFragmentBinding
import com.donalo.app.databinding.LoginFragmentBinding

class DonationListFragment : Fragment() {

    private var viewBinding: DonationListFragmentBinding? = null


    private lateinit var viewModel: DonationListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DonationListFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DonationListViewModel::class.java)
        // TODO: Use the ViewModel
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