package com.donalo.app.presentation.donationlist.action

import com.donalo.app.core.MviAction


sealed class DonationListAction : MviAction{

    object GetAllDonation : DonationListAction()
}