package com.donalo.app.ui.donationdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.donalo.app.databinding.DonationDetailFragmentBinding
import com.donalo.app.presentation.donationdetail.DonationDetailViewModel
import com.donalo.app.setImageUrlRounded

class DonationDetailFragment : Fragment() {
    private var viewBinding: DonationDetailFragmentBinding? = null

    private val viewModel by viewModels<DonationDetailViewModel>()
    private val args: DonationDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DonationDetailFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val donationDetal = args.donationDetail

        viewBinding?.apply {
            imageView2.setImageUrlRounded(donationDetal.imageURL)
            tilDonateTitle.text = donationDetal.title
            tilDonateDescription.text = donationDetal.description
            tilDonateCategory.text = donationDetal.category
            tilDonateContact.text = donationDetal.contact
        }
    }
}