package com.donalo.app.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.donalo.app.presentation.donationlist.DonationListViewModel
import com.donalo.app.R

class DonationListFragment : Fragment() {

    companion object {
        fun newInstance() = DonationListFragment()
    }

    private lateinit var viewModel: DonationListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.donation_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DonationListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}