package com.donalo.app.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.donalo.app.presentation.donationcreate.DonationCreateViewModel
import com.donalo.app.R

class DonationCreateFragment : Fragment() {

    companion object {
        fun newInstance() = DonationCreateFragment()
    }

    private lateinit var viewModel: DonationCreateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.donation_create_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DonationCreateViewModel::class.java)
        // TODO: Use the ViewModel
    }

}