package com.donalo.app.ui.donationlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.donalo.app.R
import com.donalo.app.databinding.DonationListFragmentBinding
import com.donalo.app.presentation.donationlist.DonationListViewModel

class DonationListFragment : Fragment() {

    private lateinit var  donationListFragmentBinding: DonationListFragmentBinding
    private var donationAdapter: DonationAdapter? = null

    companion object {
        fun newInstance() = DonationListFragment()
    }
    private var viewBinding: DonationListFragmentBinding? = null


    private lateinit var viewModel: DonationListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        donationListFragmentBinding = DataBindingUtil.inflate( inflater,
            R.layout.donation_list_fragment, container, false)

        return donationListFragmentBinding.root

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